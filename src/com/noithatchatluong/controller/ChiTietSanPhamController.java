package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.BinhLuanDAO;
import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.*;
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
		List<SanPham> danhSachSanPhamLienQuan = new ArrayList<SanPham>();
		
		BinhLuanDAO binhLuanDAO = new BinhLuanDAO();
		List<BinhLuan> danhSachBinhLuan = new ArrayList<BinhLuan>();
		
		try {
			sanPham = sanPhamDAO.getSanPham(maSanPham);
			request.setAttribute("sanPham", sanPham);
			
			danhSachSanPhamLienQuan = sanPhamDAO.getDanhSachSanPhamLienQuan(sanPham.getMaHangMuc());
			request.setAttribute("danhSachSanPhamLienQuan", danhSachSanPhamLienQuan);
			
			danhSachBinhLuan = binhLuanDAO.getDanhSachBinhLuan(maSanPham);
			request.setAttribute("danhSachBinhLuan", danhSachBinhLuan);

			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/chitietsanpham.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().write("Loi roi!!!" + e.getMessage());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		BinhLuanDAO binhLuanDAO = new BinhLuanDAO();
		int iD = 1;
		try {
			iD = binhLuanDAO.getLastIDBinhLuan();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		String email = request.getParameter("email");
		String maSanPham = request.getParameter("maSanPham");
		String noiDung = request.getParameter("message");
		Date thoiGian = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		BinhLuan binhLuan = new BinhLuan(iD, maSanPham, email, noiDung, thoiGian);
		
		try {
			binhLuanDAO.insertBinhLuan(binhLuan);
			response.getWriter().write("1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			response.getWriter().write("0");
		}
		String path = request.getServletPath() + "?maSanPham=" + request.getParameter("maSanPhamMaHoa");
		path = path.substring(1);
		response.sendRedirect(path);
	}

}
