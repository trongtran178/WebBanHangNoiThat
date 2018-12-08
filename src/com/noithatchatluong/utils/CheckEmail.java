package com.noithatchatluong.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.DAO.KhachHangDAO;

@WebServlet("/checkEmail")
public class CheckEmail extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		//String temp = "ok";
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		String emailCheck = request.getParameter("email");
		//System.out.println(emailCheck);
		boolean checkExistenceEmail = khachHangDAO.kiemTraEmailTonTai(emailCheck);
		if(checkExistenceEmail == true)
			out.print("ok");
		else
			out.print("denied");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
