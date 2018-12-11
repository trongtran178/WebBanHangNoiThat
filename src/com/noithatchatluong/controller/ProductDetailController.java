package com.noithatchatluong.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.utils.AESUtils;

@WebServlet("/maNo")
public class ProductDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductDetailController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String maSanPhamEnc = request.getParameter("maSanPham");
		//if(maSanPham == null) return;
		System.out.println(maSanPhamEnc);
		String maSanPham = AESUtils.decrypt(maSanPhamEnc);
		
		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/product-detail.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
