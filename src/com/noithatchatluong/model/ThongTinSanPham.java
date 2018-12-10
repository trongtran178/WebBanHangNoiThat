package com.noithatchatluong.model;

import java.util.List;

import com.noithatchatluong.entities.HangMucSanPham;
import com.noithatchatluong.entities.HinhAnh;

public class ThongTinSanPham {
	private Integer id;
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	private String mauSac;
	private float cao;
	private float dai;
	private float rong;
	private HangMucSanPham hangMucSanPham;
	private String hinhDaiDien;

	private List<HinhAnh> hinhAnh;

	public ThongTinSanPham() {

	}

	public ThongTinSanPham(Integer id, String maSanPham, String tenSanPham, double donGia, String mauSac, float cao,
			float dai, float rong, HangMucSanPham hangMucSanPham, String hinhDaiDien) {
		super();
		this.id = id;
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.mauSac = mauSac;
		this.cao = cao;
		this.dai = dai;
		this.rong = rong;
		this.hangMucSanPham = hangMucSanPham;
		this.hinhDaiDien = hinhDaiDien;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public HangMucSanPham getHangMucSanPham() {
		return hangMucSanPham;
	}

	public void setHangMucSanPham(HangMucSanPham hangMucSanPham) {
		this.hangMucSanPham = hangMucSanPham;
	}

	public String getHinhDaiDien() {
		return hinhDaiDien;
	}

	public void setHinhDaiDien(String hinhDaiDien) {
		this.hinhDaiDien = hinhDaiDien;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
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

	public List<HinhAnh> getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(List<HinhAnh> hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

}
