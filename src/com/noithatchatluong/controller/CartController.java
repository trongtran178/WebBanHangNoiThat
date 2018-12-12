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
import javax.servlet.http.HttpSession;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.*;

@WebServlet(urlPatterns = "/cart")
public class CartController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("order");
		if (order == null) {
			order = new Order();
		}
		request.setAttribute("danhSachItem", order);

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/cart.jsp");
		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maSanPham = request.getParameter("maSanPham");
		String action = request.getParameter("action");
		int idSanPham = Integer.parseInt(maSanPham);

		response.setContentType("text/plain");
		HttpSession session = request.getSession();
		Order order = (Order) session.getAttribute("order");

		if (action.equals("xoa")) {
			if (order != null) {
				order.removeItem(idSanPham);
				double tongTienChuaKhuyenMai = order.getTongTienChuaKhuyenMai();
				double tongTienKhuyenMai = order.getTongTienKhuyenMai();
				double tienPhaiTra = order.getTongTien();
				response.getWriter().write(Double.toString(tongTienChuaKhuyenMai) + "-"
						+ Double.toString(tongTienKhuyenMai) + "-" + Double.toString(tienPhaiTra));
			}
		} else if (action.equals("sua")) {
			int soLuong = Integer.parseInt(request.getParameter("soLuong"));
			if (order != null) {
				order.thayDoiSoLuong(idSanPham, soLuong);
				double tongTienChuaKhuyenMai = order.getTongTienChuaKhuyenMai();
				double tongTienKhuyenMai = order.getTongTienKhuyenMai();
				double tienPhaiTra = order.getTongTien();
				response.getWriter().write(Double.toString(tongTienChuaKhuyenMai) + "-"
						+ Double.toString(tongTienKhuyenMai) + "-" + Double.toString(tienPhaiTra));
			}
		}
	}
}
