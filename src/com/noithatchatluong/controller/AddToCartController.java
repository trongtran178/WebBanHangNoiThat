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
import com.noithatchatluong.utils.AESUtils;

@WebServlet(urlPatterns = "/addtocart")
public class AddToCartController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maSanPham = request.getParameter("maSanPham");
		if (maSanPham != null) {
			maSanPham = AESUtils.decrypt(maSanPham);
			SanPhamDAO sanPhamDAO = new SanPhamDAO();
			SanPham sanPham = new SanPham();

			try {
				sanPham = sanPhamDAO.getSanPham(maSanPham);
				if (sanPham != null) {
					HttpSession session = request.getSession();
					Order order = new Order();

					if (session.getAttribute("order") == null) {
						List<Item> danhSachItem = new ArrayList<Item>();
						Item item = new Item(sanPham, 1, sanPham.getDonGia(), sanPham.getKhuyenMai());
						danhSachItem.add(item);
						order.setItems(danhSachItem);
						session.setAttribute("order", order);
					} else {
						order = (Order) session.getAttribute("order");
						List<Item> danhSachItem = order.getItems();
						
						boolean check = false;

						for (Item item : danhSachItem) {
							if (item.getSanPham().getMaSanPham().equals(maSanPham)) {
								item.setSoLuong(item.getSoLuong() + 1);
								check = true;
							}
						}

						if (check == false) {
							Item item = new Item(sanPham, 1, sanPham.getDonGia(), sanPham.getKhuyenMai());
							danhSachItem.add(item);
						}
						
						order.setItems(danhSachItem);
						session.setAttribute("order", order);
					}

				}


			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.getWriter().write("Loi roi!!!" + e.getMessage());
			}
			
//			HttpSession session = request.getSession();
//			Order order = (Order) session.getAttribute("order");
//			if (order == null) {
//				order = new Order();
//			}
//			request.setAttribute("danhSachItem", order.getItems());

			response.sendRedirect("cart");
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
