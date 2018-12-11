package com.noithatchatluong.model;

import java.util.List;

public class Order {
	private int id;
	private String maKhachHang;
	private List<Item> items;

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
