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
import com.noithatchatluong.utils.SendConfirmResetPasswordCustomerUtils;

@WebServlet("/forgetpassword")
public class ForgetPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ForgetPasswordController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/forgetpassword.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		request.setAttribute("resetEmail", null);
		
		try {
			if (khachHangDAO.checkEmailTonTai(email)) { 
				request.setAttribute("resetEmail", email);
				
				KhachHang khachHang = new KhachHang();
				khachHang = khachHangDAO.getKhachHangByEmail(email);

				StringBuffer url = request.getRequestURL();
				String uri = request.getRequestURI();
				String ctx = request.getContextPath();
				String base = url.substring(0, url.length() - uri.length() + ctx.length()) + "/";
				String encryptCustomerCode = AESUtils.encrypt(email);
				encryptCustomerCode = URLEncoder.encode(encryptCustomerCode, "UTF-8");
				String urlContextConfirmCustomerInformation = base + "resetpassword?" + "GKKWE3I98qyW="
						+ encryptCustomerCode;
				SendConfirmResetPasswordCustomerUtils.sendEnableAccountMail(khachHang.getHoTen(), email,
						urlContextConfirmCustomerInformation);
				request.setAttribute("urlTrangChu", base);
				
			} 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Có lỗi xảy ra khi xác thực reset password !");

		}
		
		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/templates/thongbaoresetpassword.jsp");
		dispatcher.forward(request, response);
		
	}

}
