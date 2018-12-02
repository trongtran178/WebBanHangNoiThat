package com.noithatchatluong.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "SanPham")
public class SanPham {

	private int ID;
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	private String phanLoai;
	private String moTa;
	private double khuyenMai;
	private float Cao;
	private float Dai;
	private float Rong;
	private String chatLieu;
	private String xuatXu;
	private String mauSac;
	private String hinhAnh;
	private int soLuongDaBan;
	private Date ngayNhap;
	private boolean dangHoatDong;

	@Id
	@Column(name = "ID")
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	@Column(name = "SanPham", unique = true)
	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Column(name = "TenSanPham")
	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	@Column(name = "DonGia")
	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Column(name = "PhanLoai")
	public String getPhanLoai() {
		return phanLoai;
	}

	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}

	@Column(name = "MoTa")
	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Column(name = "KhuyenMai")
	public double getKhuyenMai() {
		return khuyenMai;
	}

	public void setKhuyenMai(double khuyenMai) {
		this.khuyenMai = khuyenMai;
	}

	@Column(name = "Cao")
	public float getCao() {
		return Cao;
	}

	public void setCao(float cao) {
		Cao = cao;
	}

	@Column(name = "Dai")
	public float getDai() {
		return Dai;
	}

	public void setDai(float dai) {
		Dai = dai;
	}

	@Column(name = "Rong")
	public float getRong() {
		return Rong;
	}

	public void setRong(float rong) {
		Rong = rong;
	}

	@Column(name = "ChatLieu")
	public String getChatLieu() {
		return chatLieu;
	}

	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}

	@Column(name = "XuatXu")
	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	@Column(name = "MauSac")
	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	@Column(name = "HinhAnh")
	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	@Column(name = "SoLuongDaBan")
	public int getSoLuongDaBan() {
		return soLuongDaBan;
	}

	public void setSoLuongDaBan(int soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}

	@Column(name = "NgayNhap")
	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
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
