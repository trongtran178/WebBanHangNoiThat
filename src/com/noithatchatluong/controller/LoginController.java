package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.KhachHangDAO;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.BCryptUtils;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("email") == null) {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/login.jsp");
		dispatcher.forward(request, response);
		} else {
			response.sendRedirect("home");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		KhachHang khachHang = new KhachHang(email, password);
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		
		try {
			if (khachHangDAO.checkPassword(khachHang)){
				request.getSession().setAttribute("email", email);
				response.sendRedirect("home");
			} else {
				response.sendRedirect("login");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//doGet(request, response);
	}

}
