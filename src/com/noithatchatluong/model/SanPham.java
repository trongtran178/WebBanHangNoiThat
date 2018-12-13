package com.noithatchatluong.model;

import java.util.Date;

public class SanPham {
	protected int id;
	private String maSanPham;
	private String maHangMuc;
	private String tenSanPham;
	private double donGia;
	
	private String moTa;
	private double khuyenMai;
	private float cao;
	private float dai;
	private float rong;
	private String chatLieu;
	private String xuatXu;
	private String mauSac;
	private String HinhAnh;
	private int soLuongDaBan;
	private Date ngayNhap;
	private int dangHoatDong;
	public SanPham(int id) {
	        this.id = id;
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public double getKhuyenMai() {
		return khuyenMai;
	}
	public void setKhuyenMai(double khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	public float getCao() {
		return cao;
	}
	public void setCao(float cao) {
		this.cao = cao;
	}
	public float getDai() {
		return dai;
	}
	public void setDai(float dai) {
		this.dai = dai;
	}
	public float getRong() {
		return rong;
	}
	public void setRong(float rong) {
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
		return HinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.HinhAnh = hinhAnh;
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
	
	public SanPham() {
		
	}

	
	public SanPham(int id, String maHangMuc,  String tenSanPham, double donGia, String moTa,
			double khuyenMai, float cao, float dai, float rong, String chatLieu, String xuatXu, String mauSac,
			String hinhAnh, int soLuongDaBan, Date ngayNhap, int dangHoatDong) {
		super();
		this.id = id;
		this.maSanPham = "SP" + Integer.toString(id);
		this.maHangMuc = maHangMuc;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.moTa = moTa;
		this.khuyenMai = khuyenMai;
		this.cao = cao;
		this.dai = dai;
		this.rong = rong;
		this.chatLieu = chatLieu;
		this.xuatXu = xuatXu;
		this.mauSac = mauSac;
		this.HinhAnh = hinhAnh;
		this.soLuongDaBan = soLuongDaBan;
		this.ngayNhap = ngayNhap;
		this.dangHoatDong = dangHoatDong;
	}
	public SanPham(String maHangMuc,  String tenSanPham, double donGia, String moTa,
			double khuyenMai, float cao, float dai, float rong, String chatLieu, String xuatXu, String mauSac
			, int soLuongDaBan, int dangHoatDong,int id) {
		super();
	
		this.maSanPham = "SP" + Integer.toString(id);
		this.maHangMuc = maHangMuc;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.moTa = moTa;
		this.khuyenMai = khuyenMai;
		this.cao = cao;
		this.dai = dai;
		this.rong = rong;
		this.chatLieu = chatLieu;
		this.xuatXu = xuatXu;
		this.mauSac = mauSac;

		this.soLuongDaBan = soLuongDaBan;

		this.dangHoatDong = dangHoatDong;
		this.id=id;
	}
	
	
	
}
