package com.noithatchatluong.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.noithatchatluong.jdbc.DAO.KhachHangDAO;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.AESUtils;

@WebServlet("/personalinformation")
public class PersonalInformationController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String email = (String) session.getAttribute("email");
		if (email == null) {
			response.sendRedirect(request.getContextPath() + "/home");
			return;
		}

		String linkGioiThieuBanBe = null;
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		String ctx = request.getContextPath();
		String base = url.substring(0, url.length() - uri.length() + ctx.length()) + "/";

		String encryptEmail = AESUtils.encrypt(email);
		encryptEmail = URLEncoder.encode(encryptEmail, "UTF-8");
		linkGioiThieuBanBe = base + "register?linkgioithieu=" + encryptEmail;

		KhachHang khachHang = null;
		try {
			khachHang = khachHangDAO.getKhachHangByEmail(email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("khachHang", khachHang);
		request.setAttribute("linkGIoiThieuBanBe", linkGioiThieuBanBe);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/templates/personalinformation.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
