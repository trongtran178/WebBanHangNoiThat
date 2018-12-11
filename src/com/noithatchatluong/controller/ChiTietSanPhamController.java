package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.SanPham;
import com.noithatchatluong.utils.AESUtils;

@WebServlet("/product-detail")
public class ChiTietSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ChiTietSanPhamController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/chitietsanpham.jsp");
//		dispatcher.forward(request, response);
		String maSanPham = request.getParameter("maSanPham");
		maSanPham = AESUtils.decrypt(maSanPham);
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		SanPham sanPham = new SanPham();
		try {
			sanPham = sanPhamDAO.getSanPham(maSanPham);
			request.setAttribute("sanPham", sanPham);
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/chitietsanpham.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().write("Loi roi!!!" + e.getMessage());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
