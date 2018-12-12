package com.noithatchatluong.model;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.utils.AESUtils;

public class Order {
	private int id;
	private String maKhachHang;
	private List<Item> items;
	private List<SanPham> sanPhamLienQuan;

	public List<SanPham> getSanPhamLienQuan() throws SQLException, UnsupportedEncodingException {
		if (this.items.size() > 0) {
			int index = this.items.size() - 1;
			SanPhamDAO sanPhamDAO = new SanPhamDAO();
			this.sanPhamLienQuan = sanPhamDAO.getDanhSachSanPhamLienQuan(this.items.get(index).getSanPham().getMaHangMuc());
			for(int i = 0; i <  this.sanPhamLienQuan.size(); i++ ) {
				this.sanPhamLienQuan.get(i).setMaSanPham(URLEncoder.encode(AESUtils.encrypt(this.sanPhamLienQuan.get(i).getMaSanPham()),"UTF-8"));
			}
			
		} else {
			this.sanPhamLienQuan = null;
		}
		return sanPhamLienQuan;
	}

	public void setSanPhamLienQuan(List<SanPham> sanPhamLienQuan) {
		this.sanPhamLienQuan = sanPhamLienQuan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Order() {

	}

	public Order(int id, String maKhachHang, List<Item> items) {
		super();
		this.id = id;
		this.maKhachHang = maKhachHang;
		this.items = items;
	}

	public Order(int id, List<Item> items) {
		super();
		this.id = id;
		this.items = items;
	}

	public void removeItem(int id) {
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i).getSanPham().getId() == id) {
				this.items.remove(i);
			}
		}
	}
	
	public void thayDoiSoLuong(int id, int soLuong) {
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i).getSanPham().getId() == id) {
				this.items.get(i).setSoLuong(soLuong);
			}
		}
	}

	public double getTongTien(int id) {
		double tongTien = 0;
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i).getSanPham().getId() == id) {
				tongTien = this.items.get(i).getTongTien();
			}
		}
		return tongTien;
	}
	
	public double getTongTienChuaKhuyenMai() {
		double tongTien = 0;
		for (int i = 0; i < this.items.size(); i++) {
			tongTien += this.items.get(i).getTongTienChuaKhuyenMai();
		}
		return tongTien;
	}

	public double getTongTien() {
		double tongTien = 0;
		for (int i = 0; i < this.items.size(); i++) {
			tongTien += this.items.get(i).getTongTien();
		}
		return tongTien;
	}
	
	public double getTongTienKhuyenMai() {
		double tongTien = 0;
		for (int i = 0; i < this.items.size(); i++) {
			tongTien += this.items.get(i).getTongTienKhuyenMai();
		}
		return tongTien;
	}
	
	public String getTenSanPham(int id) {
		String tongTien = "Loi roi";
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i).getSanPham().getId() == id) {
				tongTien = this.items.get(i).getSanPham().getTenSanPham();
			}
		}
		return tongTien;
	}
}
