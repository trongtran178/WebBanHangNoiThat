package com.noithatchatluong.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.KhachHangDAO;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.AESUtils;
import com.noithatchatluong.utils.BCryptUtils;
import com.noithatchatluong.utils.SendConfirmInformationAccountCustomerUtils;

@WebServlet("/resetpassword")
public class ResetPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ResetPasswordController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("GKKWE3I98qyW");
		
		if (email != null && !email.isEmpty()) {
			
			email = AESUtils.decrypt(email);
			KhachHangDAO khachHangDAO = new KhachHangDAO();
			try {
				if (khachHangDAO.checkEmailTonTai(email)) {
				request.setAttribute("emailKhoiPhuc", email);
				RequestDispatcher dispatcher = this.getServletContext()
						.getRequestDispatcher("/WEB-INF/templates/resetpassword.jsp");
				dispatcher.forward(request, response);	
				} else {
					response.sendRedirect("home");
				}
			} catch (SQLException e) {
				response.sendRedirect("home");
				e.printStackTrace();
			}
			
		}
		else {
			response.sendRedirect("home");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("newpassword");
		password = BCryptUtils.hashPassword(password);
		String redirect = "home";
		
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		KhachHang khachHang = new KhachHang(email, password);
		
		try {
			khachHangDAO.updatePassword(khachHang);
			redirect = "login";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		response.sendRedirect(redirect);
		

		
	}

}
