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

@WebServlet("/adminlogin")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getSession().getAttribute("admin") == null) {
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/templates/admin_login.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("adminthongke");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		AdminUser adminuser = new AdminUser(username, password);
		AdminUserDAO adminuserDAO = new AdminUserDAO();

		try {
			if (adminuserDAO.checkPassword(adminuser)) {
				adminuser = adminuserDAO.getAdminUser(username);
				request.getSession().setAttribute("admin", adminuser);
				response.sendRedirect("adminthongke");
			} else {
				response.sendRedirect("adminlogin");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
