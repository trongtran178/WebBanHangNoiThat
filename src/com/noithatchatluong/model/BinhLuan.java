package com.noithatchatluong.model;

import java.sql.Date;

public class BinhLuan {
	private int iD;
	private String maBinhLuan;
	private String maSanPham;
	private String email;
	private String noiDung;
	private Date thoiGian;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getMaBinhLuan() {
		return maBinhLuan;
	}
	public void setMaBinhLuan(String maBinhLuan) {
		this.maBinhLuan = maBinhLuan;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public Date getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
	
	public BinhLuan() {
		
	}
	
	public BinhLuan(int iD, String maSanPham, String email, String noiDung, Date thoiGian) {
		super();
		this.iD = iD;
		this.maBinhLuan = Integer.toString(iD);
		this.maSanPham = maSanPham;
		this.email = email;
		this.noiDung = noiDung;
		this.thoiGian = thoiGian;
	}
	
	public BinhLuan(String maSanPham, String email, String noiDung, Date thoiGian) {
		super();
		this.maSanPham = maSanPham;
		this.email = email;
		this.noiDung = noiDung;
		this.thoiGian = thoiGian;
	}
	
	
	
}
