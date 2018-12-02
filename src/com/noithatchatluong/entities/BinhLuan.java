package com.noithatchatluong.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BinhLuan")
public class BinhLuan {
	private int ID;
	private String maBinhLuan;
	private String maSanPham;
	private String email;
	private String noiDung;
	private Date thoiGian;

	public BinhLuan() {

	}

	public BinhLuan(int ID, String maSanPham, String email, String noiDung, Date thoiGian) {
		super();
		this.ID = ID;
		this.maBinhLuan = "BL" + Integer.toString(ID);
		this.maSanPham = maSanPham;
		this.email = email;
		this.noiDung = noiDung;
		this.thoiGian = thoiGian;
	}

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Column(name = "MaBinhLuan", nullable = false)
	public String getMaBinhLuan() {
		return maBinhLuan;
	}

	public void setMaBinhLuan(String maBinhLuan) {
		this.maBinhLuan = maBinhLuan;
	}

	@Column(name = "MaSanPham")
	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Column(name = "Email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "NoiDung", nullable = false)
	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Column(name = "ThoiGian")
	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

}
