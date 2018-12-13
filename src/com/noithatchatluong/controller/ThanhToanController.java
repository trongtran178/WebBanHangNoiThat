package com.noithatchatluong.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.noithatchatluong.jdbc.DAO.ChiTietHoaDonDAO;
import com.noithatchatluong.jdbc.DAO.HoaDonDAO;
import com.noithatchatluong.jdbc.DAO.KhachHangDAO;
import com.noithatchatluong.model.ChiTietHoaDon;
import com.noithatchatluong.model.HoaDon;
import com.noithatchatluong.model.Item;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.model.Order;

@WebServlet("/thanhtoan")
public class ThanhToanController extends HttpServlet {

	private HoaDonDAO hoaDonDAO;
	private ChiTietHoaDonDAO chiTietHoaDonDAO;
	private KhachHangDAO khachHangDAO;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("/WEB-INF/templates/_404_ERROR.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		hoaDonDAO = new HoaDonDAO();
		chiTietHoaDonDAO = new ChiTietHoaDonDAO();
		khachHangDAO = new KhachHangDAO();
		
		HttpSession session = request.getSession();

		// lấy email khách hàng
		String email = (String) session.getAttribute("email");
		System.out.println(email);
		KhachHang khachHang = null;
		if (email == null) { 
			//khách hàng không có tài khoản
			String tenKhachHang = request.getParameter("hoTen");
			String emailKhachHang = request.getParameter("email");
			String diaChiKhachHang = request.getParameter("diaChi");
			
			String soDienThoai = request.getParameter("soDienThoai");
			
			//mật khẩu mặc định : 123123
			String defaultPassword = "$2a$12$it8eHRuumeMamlopC/BzYui4vDyGYKRO6edPVxqaTG5QRQs3hRUvq";
			Date ngayDangKy = new Date();
			
			com.noithatchatluong.entities.KhachHang khachHangChuaDangKy = new com.noithatchatluong.entities.KhachHang();
			khachHangChuaDangKy.setDaDangKy(false);
			khachHangChuaDangKy.setHoTen(tenKhachHang);
			khachHangChuaDangKy.setEmail(emailKhachHang);
			khachHangChuaDangKy.setDiaChi(diaChiKhachHang);
			khachHangChuaDangKy.setPassword(defaultPassword);
			khachHangChuaDangKy.setNgayDangKy(ngayDangKy);
			khachHangChuaDangKy.setDangHoatDong(true);
			khachHangChuaDangKy.setSoDienThoai(soDienThoai);
			khachHangChuaDangKy.setSoNguoiDaGioiThieu(0);
			
			com.noithatchatluong.DAO.KhachHangDAO khachHangDAOHibernate = new com.noithatchatluong.DAO.KhachHangDAO();
			khachHangDAOHibernate.themKhachHang(khachHangChuaDangKy);
			
			Order order = (Order) session.getAttribute("order");

			// xử lý chưa có giỏ hàng
			if (order == null) {

			}

			// danh sách sản phẩm trong item
			List<Item> listItems = order.getItems();

			HoaDon hoaDon = new HoaDon();

			// XÉT ID HÓA ĐƠN
			try {
				hoaDon.setId(hoaDonDAO.getMaxID());
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			// XÉT MÃ HÓA ĐƠN
			hoaDon.setMaHoaDon("HD" + Integer.toString(hoaDon.getId()));
			for (Item item : listItems) {
				Integer ID = -1;
				try {
					ID = hoaDonDAO.getMaxID();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				item.setMaHoaDon("HD" + Integer.toString(ID));
			}

			// TRẠNG THÁI
			hoaDon.setTrangThai(HoaDon.CHUA_XU_LY);
			System.out.println(hoaDon.getTrangThai());
			// GHI CHÚ
			hoaDon.setGhiChu(null);
			System.out.println(hoaDon.getGhiChu());
			// NGÀY ĐẶT
			java.sql.Date thoiGian = new java.sql.Date(Calendar.getInstance().getTime().getTime());
			hoaDon.setNgayDat(thoiGian);
			System.out.println(hoaDon.getNgayDat());

			// TỔNG TIỀN
			hoaDon.setTongTien(order.getTongTien());

			// DANG HOAT DONG
			hoaDon.setDangHoatDong(1);
			System.out.println(hoaDon.getDangHoatDong());

			// MAKHACHHANG
			hoaDon.setMaKhachHang(khachHangChuaDangKy.getMaKhachHang());
			System.out.println(hoaDon.getMaKhachHang());
			try {
				hoaDonDAO.insertHoaDon(hoaDon);
			} catch (SQLException e1) {
				System.out.println("Không thêm hóa đơn được !");
				e1.printStackTrace();
			}

			if (listItems.isEmpty()) {
				try {
					hoaDonDAO.deletetHoaDon(hoaDon);
					//redirect toi trang nao do ?
					return;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			boolean result = true;
			for (Item item : listItems) {
				ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
				chiTietHoaDon.setDonGia(item.getDonGia());
				chiTietHoaDon.setKhuyenMai(item.getKhuyenMai());
				chiTietHoaDon.setMaHoaDon(hoaDon.getMaHoaDon());
				chiTietHoaDon.setMaSanPham(item.getSanPham().getMaSanPham());
				chiTietHoaDon.setSoLuong(item.getSoLuong());
				
				try {
					chiTietHoaDonDAO.insertChiTietHoaDon(chiTietHoaDon);
				} catch (SQLException e) {
					System.out.println("Không thêm chi tiết hóa đơn được !");
					e.printStackTrace();
					result = false;
				}
			}
			if(result == true) {
				session.setAttribute("order", null);
				request.setAttribute("temp", 123);
				response.sendRedirect(request.getContextPath() + "/confirmedOrder?tenKhachHang=" + URLEncoder.encode(khachHangChuaDangKy.getHoTen(), "UTF-8"));
			}
			
			
			//response.sendRedirect(request.getContextPath() + "/confirmedOrder?tenKhachHang=" + URLEncoder.encode(khachHangChuaDangKy.getHoTen(), "UTF-8"));
			return;
			// Hiển thị modal nhập email
			// response.sendRedirect(request.getContextPath() + "/trangnaodo");
		} 
		
		
		
		
		
		
		
		
		
		
		else {

			try {
				khachHang = khachHangDAO.getKhachHangByEmail(email);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}

		Order order = (Order) session.getAttribute("order");

		// xử lý chưa có giỏ hàng
		if (order == null) {

		}

		// danh sách sản phẩm trong item
		List<Item> listItems = order.getItems();

		HoaDon hoaDon = new HoaDon();

		// XÉT ID HÓA ĐƠN
		try {
			hoaDon.setId(hoaDonDAO.getMaxID());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		// XÉT MÃ HÓA ĐƠN
		hoaDon.setMaHoaDon("HD" + Integer.toString(hoaDon.getId()));
		for (Item item : listItems) {
			Integer ID = -1;
			try {
				ID = hoaDonDAO.getMaxID();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			item.setMaHoaDon("HD" + Integer.toString(ID));
		}

		// TRẠNG THÁI
		hoaDon.setTrangThai(HoaDon.CHUA_XU_LY);
		System.out.println(hoaDon.getTrangThai());
		// GHI CHÚ
		hoaDon.setGhiChu(null);
		System.out.println(hoaDon.getGhiChu());
		// NGÀY ĐẶT
		java.sql.Date thoiGian = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		hoaDon.setNgayDat(thoiGian);
		System.out.println(hoaDon.getNgayDat());

		// TỔNG TIỀN
		hoaDon.setTongTien(order.getTongTien());

		// DANG HOAT DONG
		hoaDon.setDangHoatDong(1);
		System.out.println(hoaDon.getDangHoatDong());

		// MAKHACHHANG
		hoaDon.setMaKhachHang(khachHang.getMaKhachHang());
		System.out.println(hoaDon.getMaKhachHang());
		try {
			hoaDonDAO.insertHoaDon(hoaDon);
		} catch (SQLException e1) {
			System.out.println("Không thêm hóa đơn được !");
			e1.printStackTrace();
		}

		if (listItems.isEmpty()) {
			try {
				hoaDonDAO.deletetHoaDon(hoaDon);
				//redirect toi trang nao do ?
				return;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		boolean result = true;
		for (Item item : listItems) {
			ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
			chiTietHoaDon.setDonGia(item.getDonGia());
			chiTietHoaDon.setKhuyenMai(item.getKhuyenMai());
			chiTietHoaDon.setMaHoaDon(hoaDon.getMaHoaDon());
			chiTietHoaDon.setMaSanPham(item.getSanPham().getMaSanPham());
			chiTietHoaDon.setSoLuong(item.getSoLuong());
			
			try {
				chiTietHoaDonDAO.insertChiTietHoaDon(chiTietHoaDon);
			} catch (SQLException e) {
				System.out.println("Không thêm chi tiết hóa đơn được !");
				e.printStackTrace();
				result = false;
			}
		}
		if(result == true) {
			session.setAttribute("order", null);
			request.setAttribute("temp", 123);
			response.sendRedirect(request.getContextPath() + "/confirmedOrder?tenKhachHang=" + URLEncoder.encode(khachHang.getHoTen(), "UTF-8"));
		}
	}
}
