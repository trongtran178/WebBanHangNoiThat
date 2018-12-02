package com.noithatchatluong.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "KhachHang")
public class KhachHang {

	private int ID;
	private String maKhachHang;
	private String email;
	private String hoTen;
	private String soDienThoai;
	private String diaChi;
	private String password;
	private Date ngayDangKy;
	private boolean daDangKy;
	private int soNguoiDaGioiThieu;
	private boolean dangHoatDong;

	public KhachHang() {

	}

	public KhachHang(int ID, String email, String hoTen, String soDienThoai, String diaChi,
			String password, Date ngayDangKy, boolean daDangKy, int soNguoiDaGioiThieu, boolean dangHoatDong) {
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

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Column(name = "MaKhachHang")
	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	@Column(name = "Email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "HoTen")
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Column(name = "SDT")
	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Column(name = "DiaChi")
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "Password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NgayDangKy", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getNgayDangKy() {
		return ngayDangKy;
	}

	public void setNgayDangKy(Date ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}

	@Column(name = "DaDangKy", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isDaDangKy() {
		return daDangKy;
	}

	public void setDaDangKy(boolean daDangKy) {
		this.daDangKy = daDangKy;
	}

	public int getSoNguoiDaGioiThieu() {
		return soNguoiDaGioiThieu;
	}

	public void setSoNguoiDaGioiThieu(int soNguoiDaGioiThieu) {
		this.soNguoiDaGioiThieu = soNguoiDaGioiThieu;
	}

	@Column(name = "DangHoatDong", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isDangHoatDong() {
		return dangHoatDong;
	}

	public void setDangHoatDong(boolean dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}

}
