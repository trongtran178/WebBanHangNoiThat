package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.SanPham;

@WebServlet(urlPatterns =  {"/home"})
public class HomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		List<SanPham> danhSachSanPhamBanChay = new ArrayList<SanPham>();
		List<SanPham> danhSachSanPhamKhuyenMai = new ArrayList<SanPham>();
		List<SanPham> danhSachSanPhamMoi = new ArrayList<SanPham>();
		
		try {
			danhSachSanPhamBanChay = sanPhamDAO.getDanhSachSanPhamBanChay();
			danhSachSanPhamKhuyenMai = sanPhamDAO.getDanhSachSanPhamBanKhuyenMaiNhieuNhat();
			danhSachSanPhamMoi = sanPhamDAO.getDanhSachSanPhamMoi();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("danhSachSanPhamBanChay", danhSachSanPhamBanChay);
		request.setAttribute("danhSachSanPhamKhuyenMai", danhSachSanPhamKhuyenMai);
		request.setAttribute("danhSachSanPhamMoi", danhSachSanPhamMoi);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/index.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
