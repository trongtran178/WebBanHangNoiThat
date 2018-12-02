package com.noithatchatluong.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HoaDon")
public class HoaDon {

	private int ID;
	private String maHoaDon;
	private String maKhachHang;
	private double tongTien;

	public HoaDon() {

	}

	public HoaDon(int ID, String maKhachHang, double tongTien) {
		this.ID = ID;
		this.maHoaDon = "HD" + Integer.toString(ID);
		this.maKhachHang = maKhachHang;
		this.tongTien = tongTien;
	}

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Column(name = "MaHoaDon")
	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	@Column(name = "MaKhachHang")
	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	@Column(name = "TongTien")
	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

}
