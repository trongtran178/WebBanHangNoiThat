package com.noithatchatluong.controller;

import java.io.IOException;
import java.net.URLEncoder;
/*import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;*/
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.noithatchatluong.DAO.KhachHangDAO;
import com.noithatchatluong.entities.KhachHang;
import com.noithatchatluong.utils.AESUtils;
import com.noithatchatluong.utils.BCryptUtils;
import com.noithatchatluong.utils.SendConfirmInformationAccountCustomerUtils;

@WebServlet(urlPatterns = "/register")
public class RegisterController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("email") != null) {
			response.sendRedirect(request.getContextPath() + "/home");
			return;
		}
		
		String emailNguoiGioiThieu = request.getParameter("linkgioithieu");
		if(emailNguoiGioiThieu != null)
			System.out.println(emailNguoiGioiThieu);
		
		System.out.println(AESUtils.decrypt(emailNguoiGioiThieu));
		request.setAttribute("emailNguoiGioiThieu", emailNguoiGioiThieu);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/register.jsp");

		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			
			KhachHangDAO khachHangDAO = new KhachHangDAO();
			KhachHang khachHang = new KhachHang();
			khachHang.setHoTen(request.getParameter("fullname"));
			khachHang.setDiaChi(request.getParameter("address"));
			khachHang.setNgayDangKy(new Date());
			String hashPassword = BCryptUtils.hashPassword(request.getParameter("password"));
			khachHang.setPassword(hashPassword);
			khachHang.setSoDienThoai(request.getParameter("phonenumber"));
			khachHang.setDaDangKy(false);
			khachHang.setDangHoatDong(false);
			khachHang.setSoNguoiDaGioiThieu(0);
			khachHang.setEmail(request.getParameter("email"));

			boolean checkInsertCus = khachHangDAO.themKhachHang(khachHang);
			
			if (checkInsertCus == false) {
				System.out.println("Thêm thất bại");
				return;
			}
			
			String emailNguoiDaGioiThieu = request.getParameter("emailNguoiDaGioiThieu");
			emailNguoiDaGioiThieu = AESUtils.decrypt(emailNguoiDaGioiThieu);
			System.out.println(emailNguoiDaGioiThieu);
			if(emailNguoiDaGioiThieu != null) {
				com.noithatchatluong.jdbc.DAO.KhachHangDAO khjdbc = new com.noithatchatluong.jdbc.DAO.KhachHangDAO();
				
				boolean check = khjdbc.tangSoNguoiGioiThieu(emailNguoiDaGioiThieu);
				System.out.println(check + " day la ket qua");
			}
			
			StringBuffer url = request.getRequestURL();
			String uri = request.getRequestURI();
			String ctx = request.getContextPath();
			String base = url.substring(0, url.length() - uri.length() + ctx.length()) + "/";
			String encryptCustomerCode = AESUtils.encrypt(khachHang.getMaKhachHang());
			encryptCustomerCode = URLEncoder.encode(encryptCustomerCode, "UTF-8");
			String urlContextConfirmCustomerInformation = base + "confirmAccount?" + "jokeaisthis="
					+ encryptCustomerCode;
			SendConfirmInformationAccountCustomerUtils.sendEnableAccountMail(khachHang.getHoTen(), khachHang.getEmail(),
					urlContextConfirmCustomerInformation);
			request.setAttribute("urlTrangChu", base);
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/templates/notifySendConfirmAccountEmail.jsp");
			dispatcher.forward(request, response);
		} catch (Exception ex) {
			System.out.println("Có lỗi xảy ra khi gửi mail!");
			System.out.println(ex.getMessage());
		}
	}
}
