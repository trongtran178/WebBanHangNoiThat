package com.noithatchatluong.model;

import java.sql.Date;

public class HoaDon {
	private int id;
	private String maHoaDon;
	private String maKhachHang;
	private double tongTien;
	private Date ngayDat;
	private String trangThai;
	private String ghiChu;
	private int dangHoatDong;
	
	public static String CHUA_XU_LY = "Chưa xử lý";
	public static String DANG_GIAO = "Đang giao";
	public static String DA_GIAO = "Đã giao";		

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public Date getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getDangHoatDong() {
		return dangHoatDong;
	}
	public void setDangHoatDong(int dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}
	
	public HoaDon(int id, String maHoaDon, String maKhachHang, double tongTien, Date ngayDat, String trangThai, String ghiChu,
			int dangHoatDong) {
		super();
		this.id = id;
		this.maHoaDon = "HD" + Integer.toString(id);
		this.maKhachHang = maKhachHang;
		this.tongTien = tongTien;
		this.ngayDat = ngayDat;
		this.trangThai = trangThai;
		this.ghiChu = ghiChu;
		this.dangHoatDong = dangHoatDong;
	}
	
	public HoaDon(String maHoaDon, String maKhachHang, double tongTien, Date ngayDat, String ghiChu) {
		super();
		this.maHoaDon = maHoaDon;
		this.maKhachHang = maKhachHang;
		this.tongTien = tongTien;
		this.ngayDat = ngayDat;
		this.trangThai = HoaDon.CHUA_XU_LY;
		this.ghiChu = ghiChu;
		this.dangHoatDong = 1;
	}
	
	
}
