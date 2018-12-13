package com.noithatchatluong.model;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import com.noithatchatluong.entities.HinhAnh;
import com.noithatchatluong.utils.AESUtils;

public class SanPham {
	private int id;
	private String maSanPham;
	private int maHangMuc;
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
	private String maHinhAnh;
	private int soLuongDaBan;
	private Date ngayNhap;
	private int dangHoatDong;
	private List<String> danhSachHinhAnh;

	public List<String> getDanhSachHinhAnh() {
		return danhSachHinhAnh;
	}
	public void setDanhSachHinhAnh(List<String> danhSachHinhAnh) {
		this.danhSachHinhAnh = danhSachHinhAnh;
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
	
	public int getMaHangMuc() {
		return maHangMuc;
	}
	public void setMaHangMuc(int maHangMuc) {
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
	public String getMaHinhAnh() {
		return maHinhAnh;
	}
	public void setMaHinhAnh(String hinhAnh) {
		this.maHinhAnh = hinhAnh;
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
	public int DangHoatDong() {
		return dangHoatDong;
	}
	public void setDangHoatDong(int dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}
	
	public String getMaSanPhamMaHoa() throws UnsupportedEncodingException {
		String maHoa = URLEncoder.encode(AESUtils.encrypt(this.getMaSanPham()),"UTF-8");
		return maHoa;
	}
	
	public SanPham() {
		
	}

	
	public SanPham(int id, int maHangMuc,  String tenSanPham, double donGia, String moTa,
			double khuyenMai, float cao, float dai, float rong, String chatLieu, String xuatXu, String mauSac,
			String maHinhAnh, int soLuongDaBan, Date ngayNhap, int dangHoatDong, List<String> danhSachHinhAnh) {
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
		this.maHinhAnh = maHinhAnh;
		this.soLuongDaBan = soLuongDaBan;
		this.ngayNhap = ngayNhap;
		this.dangHoatDong = dangHoatDong;
		this.danhSachHinhAnh = danhSachHinhAnh;
	}
	public SanPham(int id, int maHangMuc, String tenSanPham, double donGia, float cao, float dai,
			float rong, String mauSac) {
		super();
		this.id = id;
		this.maHangMuc = maHangMuc;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.cao = cao;
		this.dai = dai;
		this.rong = rong;
		this.mauSac = mauSac;
	}
	
	
	
}
