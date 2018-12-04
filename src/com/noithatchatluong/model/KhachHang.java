package com.noithatchatluong.model;

import java.util.Date;

public class KhachHang {
	private int ID;
	private String maKhachHang;
	private String email;
	private String hoTen;
	private String soDienThoai;
	private String diaChi;
	private String password;
	private Date ngayDangKy;
	private int daDangKy;
	private int soNguoiDaGioiThieu;
	private int dangHoatDong;

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getNgayDangKy() {
		return ngayDangKy;
	}

	public void setNgayDangKy(Date ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}

	public int isDaDangKy() {
		return daDangKy;
	}

	public void setDaDangKy(int daDangKy) {
		this.daDangKy = daDangKy;
	}

	public int getSoNguoiDaGioiThieu() {
		return soNguoiDaGioiThieu;
	}

	public void setSoNguoiDaGioiThieu(int soNguoiDaGioiThieu) {
		this.soNguoiDaGioiThieu = soNguoiDaGioiThieu;
	}

	public int isDangHoatDong() {
		return dangHoatDong;
	}

	public void setDangHoatDong(int dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}


	public KhachHang() {

	}

	public KhachHang(int ID, String email, String hoTen, String soDienThoai, String diaChi,
			String password, Date ngayDangKy, int daDangKy, int soNguoiDaGioiThieu, int dangHoatDong) {
		super();
		this.ID = ID;
		this.maKhachHang = "KH" + this.getID();
		this.email = email;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.password = password;
		this.ngayDangKy = ngayDangKy;
		this.daDangKy = daDangKy;
		this.soNguoiDaGioiThieu = soNguoiDaGioiThieu;
		this.dangHoatDong = dangHoatDong;
	}
	
	public KhachHang(int ID, String maKhachHang, String email, String hoTen, String soDienThoai, String diaChi,
			String password, Date ngayDangKy, int daDangKy, int soNguoiDaGioiThieu, int dangHoatDong) {
		super();
		this.ID = ID;
		this.maKhachHang = maKhachHang;
		this.email = email;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.password = password;
		this.ngayDangKy = ngayDangKy;
		this.daDangKy = daDangKy;
		this.soNguoiDaGioiThieu = soNguoiDaGioiThieu;
		this.dangHoatDong = dangHoatDong;
	}

}
