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
import com.noithatchatluong.model.AdminUser;
import com.noithatchatluong.utils.BCryptUtils;

@WebServlet("/admincapnhatthongtin")
public class AdminCapNhatThongTinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean isShowNotification = false;

	public AdminCapNhatThongTinController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("admin") == null) {
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/templates/admin_login.jsp");
			dispatcher.forward(request, response);
		} else {

			if (isShowNotification == false) {
				request.setAttribute("trangthai", null);
			}

			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/templates/admin_capnhatthongtin.jsp");
			dispatcher.forward(request, response);
			isShowNotification = false;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String oldPassword = request.getParameter("oldpassword");
		String newPassword = request.getParameter("newpassword");

		AdminUser adminuser = new AdminUser(username, oldPassword);
		AdminUserDAO adminuserDAO = new AdminUserDAO();
		String trangthai = "Sai mật khẩu!";

		try {
			if (adminuserDAO.checkPassword(adminuser)) {
				// Dung mat khau
				String hashPassword = BCryptUtils.hashPassword(newPassword);
				adminuser.setPassword(hashPassword);
				adminuserDAO.updatePassword(adminuser);
				trangthai = "Cập nhật thành công!";
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		request.setAttribute("trangthai", trangthai);
		isShowNotification = true;
		doGet(request, response);
	}

}
