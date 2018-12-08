package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.AdminUserDAO;
import com.noithatchatluong.model.AdminUser;

@WebServlet("/TestJDBC")
public class TestJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminUserDAO adDAO = null;

	public TestJDBC() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {

		adDAO = new AdminUserDAO();

	}

	private void updateAdminUser() throws SQLException {
		AdminUser ad = new AdminUser("DucTuan", "Duoc roi");
		adDAO.updatePassword(ad);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write("Dau Xanh nha ai");
		try {
			response.getWriter().write("First S!!!");
			updateAdminUser();
			response.getWriter().write("Success!!!");

		} catch (SQLException e) {
			response.getWriter().write("First F");
			e.printStackTrace();
			response.getWriter().write("!!!Fail");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
