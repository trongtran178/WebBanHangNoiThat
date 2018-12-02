package com.noithatchatluong.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.DAO.KhachHangDAO;
import com.noithatchatluong.entities.KhachHang;
import com.noithatchatluong.utils.AESUtils;

@WebServlet("/confirmAccount")
public class ConfirmAccountController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			String encryptedCustomerCode = request.getParameter("jokeaisthis");
			//encryptedCustomerCode = URLDecoder.decode(encryptedCustomerCode, "UTF-8");
			System.out.println(encryptedCustomerCode + " clgv ");
			String decryptedCustomerCode = AESUtils.decrypt(encryptedCustomerCode);	
			System.out.println(decryptedCustomerCode + " day la giai ma");
			KhachHang khachHang = null;
			khachHang = KhachHangDAO.timKhachHangBoiMaKhachHang(decryptedCustomerCode);
			if (khachHang.isDaDangKy() == true && khachHang.isDangHoatDong() == true) {
				return;
			}
			khachHang.setDaDangKy(true);
			khachHang.setDangHoatDong(true);
			KhachHangDAO.capNhatThongTinKhachHang(khachHang);
			request.setAttribute("tenKhachHang", khachHang.getHoTen());
			StringBuffer url = request.getRequestURL();
			String uri = request.getRequestURI();
			String ctx = request.getContextPath();
			String base = url.substring(0, url.length() - uri.length() + ctx.length()) + "/";
			request.setAttribute("urlTrangChu", base);
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/templates/isSuccessfulAccountActivation.jsp");
			dispatcher.forward(request, response);

		} catch (Exception ex) {
			System.out.println("Đã xảy ra lỗi");
			System.out.println("Nguyên nhân : " + ex.getMessage());
		}
	}
}
