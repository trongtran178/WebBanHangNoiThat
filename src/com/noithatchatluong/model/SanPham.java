package com.noithatchatluong.model;

import java.sql.Date;

public class SanPham {
	String iD;
	String maSanPham;
	String maHangMuc;
	String tenSanPham;
	double donGia;
	String phanLoai;
	String moTa;
	String khuyenMai;
	double cao;
	double dai;
	double rong;
	String chatLieu;
	String xuatXu;
	String mauSac;
	String hinhAnh;
	int soLuongDaBan;
	Date ngayNhap;
	int dangHoatDong;
	public SanPham(String iD, String maSanPham, String maHangMuc, String tenSanPham, double donGia, String phanLoai,
			String moTa, String khuyenMai, double cao, double dai, double rong, String chatLieu, String xuatXu,
			String mauSac, String hinhAnh, int soLuongDaBan, Date ngayNhap, int dangHoatDong) {
		super();
		this.iD = iD;
		this.maSanPham = maSanPham;
		this.maHangMuc = maHangMuc;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.phanLoai = phanLoai;
		this.moTa = moTa;
		this.khuyenMai = khuyenMai;
		this.cao = cao;
		this.dai = dai;
		this.rong = rong;
		this.chatLieu = chatLieu;
		this.xuatXu = xuatXu;
		this.mauSac = mauSac;
		this.hinhAnh = hinhAnh;
		this.soLuongDaBan = soLuongDaBan;
		this.ngayNhap = ngayNhap;
		this.dangHoatDong = dangHoatDong;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getMaHangMuc() {
		return maHangMuc;
	}
	public void setMaHangMuc(String maHangMuc) {
		this.maHangMuc = maHangMuc;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getPhanLoai() {
		return phanLoai;
	}
	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getKhuyenMai() {
		return khuyenMai;
	}
	public void setKhuyenMai(String khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	public double getCao() {
		return cao;
	}
	public void setCao(double cao) {
		this.cao = cao;
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public String getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public int getSoLuongDaBan() {
		return soLuongDaBan;
	}
	public void setSoLuongDaBan(int soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getDangHoatDong() {
		return dangHoatDong;
	}
	public void setDangHoatDong(int dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}
	

}
