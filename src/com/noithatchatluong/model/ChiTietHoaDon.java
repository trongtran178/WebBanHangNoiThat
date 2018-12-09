package com.noithatchatluong.model;

public class ChiTietHoaDon {
	private String maHoaDon;
	private String maSanPham;
	private int soLuong;
	private double donGia;
	private double khuyenMai;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getKhuyenMai() {
		return khuyenMai;
	}
	public void setKhuyenMai(double khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	
	public ChiTietHoaDon() {
		
	}
	
	public ChiTietHoaDon(String maHoaDon, String maSanPham, int soLuong, double donGia, double khuyenMai) {
		super();
		this.maHoaDon = maHoaDon;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.khuyenMai = khuyenMai;
	}
	
	
}
