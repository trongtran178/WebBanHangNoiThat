package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.AdminUserDAO;
import com.noithatchatluong.jdbc.DAO.KhachHangDAO;
import com.noithatchatluong.model.AdminUser;
import com.noithatchatluong.model.KhachHang;

@WebServlet("/adminlogout")
public class AdminLogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLogoutController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getSession().getAttribute("admin") != null) {
			request.getSession().invalidate();
		}

		response.sendRedirect("adminlogin");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
