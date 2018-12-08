package com.noithatchatluong.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "SanPham")
public class SanPham {

	/**
	 * 
	 */
	private Integer ID;
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	private String moTa;
	private double khuyenMai;
	private float Cao;
	private float Dai;
	private float Rong;
	private String chatLieu;
	private String xuatXu;
	private String mauSac;
	private Integer soLuongDaBan;
	private Date ngayNhap;
	private boolean dangHoatDong;
	private HangMucSanPham hangMucSanPham;
	private String maHinhAnh;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	@Column(name = "MaSanPham", unique = true)
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

	@Column(name = "SoLuongDaBan")
	public Integer getSoLuongDaBan() {
		return soLuongDaBan;
	}

	public void setSoLuongDaBan(Integer soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}

	@Column(name = "NgayNhap")
	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	@Column(name = "DangHoatDong")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isDangHoatDong() {
		return dangHoatDong;
	}

	public void setDangHoatDong(boolean dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maHangMuc", nullable = false) // maHangMuc cua HangMuc
	public HangMucSanPham getHangMucSanPham() {
		return hangMucSanPham;
	}

	public void setHangMucSanPham(HangMucSanPham hangMucSanPham) {
		this.hangMucSanPham = hangMucSanPham;
	}

	@Column(name = "MaHinhAnh")
	public String getMaHinhAnh() {
		return maHinhAnh;
	}

	public void setMaHinhAnh(String maHinhAnh) {
		this.maHinhAnh = maHinhAnh;
	}


}
