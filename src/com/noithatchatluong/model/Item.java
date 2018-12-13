package com.noithatchatluong.model;

public class Item {
	
	private String maHoaDon;
	private SanPham sanPham;
	private int soLuong;
	private double donGia;
	private double khuyenMai;

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
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

	public double getTongTien() {
		return this.donGia * this.soLuong * (1.0 - this.khuyenMai / 100.0);
	}

	public double getTongTienChuaKhuyenMai() {
		return this.donGia * this.soLuong;
	}

	public double getTongTienKhuyenMai() {
		return this.donGia * this.soLuong * this.khuyenMai / 100.0;
	}

	public Item() {

	}

	public Item(String maHoaDon, SanPham sanPham, int soLuong, double donGia, double khuyenMai) {
		super();
		this.maHoaDon = maHoaDon;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.khuyenMai = khuyenMai;
	}

	public Item(SanPham sanPham, int soLuong, double donGia, double khuyenMai) {
		super();
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.khuyenMai = khuyenMai;
	}

	public void tangSoLuong() {
		this.soLuong += 1;
	}

	public void giamSoLuong() {
		this.soLuong -= 1;
	}

}
