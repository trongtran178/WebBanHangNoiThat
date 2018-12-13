package com.noithatchatluong.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "HoaDon")
public class HoaDon implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private String maHoaDon;
	private double tongTien;

	private KhachHang khachHang;
	private Date ngayDat;

	private String trangThai;
	private String ghiChu;
	private boolean dangHoatDong;
	private Set<ChiTietHoaDon> chiTietHoaDon = new HashSet<ChiTietHoaDon>(0);

	public HoaDon() {

	}

	public HoaDon(int ID, double tongTien) {
		this.ID = ID;
		this.maHoaDon = "HD" + Integer.toString(ID);
		this.tongTien = tongTien;
	}

/*	public HoaDon(String maHoaDon, double tongTien, KhachHang khachHang, boolean dangHoatDong) {
		super();
		this.maHoaDon = maHoaDon;
		this.tongTien = tongTien;
		this.khachHang = khachHang;
		this.dangHoatDong = dangHoatDong;
	}*/

	public HoaDon(String maHoaDon, double tongTien, KhachHang khachHang, Date ngayDat, String trangThai, String ghiChu,
			boolean dangHoatDong, Set<ChiTietHoaDon> chiTietHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.tongTien = tongTien;
		this.khachHang = khachHang;
		this.ngayDat = ngayDat;
		this.trangThai = trangThai;
		this.ghiChu = ghiChu;
		this.dangHoatDong = dangHoatDong;
		this.chiTietHoaDon = chiTietHoaDon;
	}
	
	public HoaDon(KhachHang khachHang, String maHoaDon, double tongTien, boolean dangHoatDong) {
		this.khachHang = khachHang;
		this.maHoaDon = maHoaDon;
		this.tongTien = tongTien;
		this.dangHoatDong = dangHoatDong;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
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

	@Column(name = "TongTien")
	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKhachHang", nullable = false)
	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NgayDat", length = 26)
	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	@Column(name = "TrangThai", length = 50)
	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "GhiChu", length = 400)
	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "DangHoatDong", nullable = false)
	public boolean isDangHoatDong() {
		return dangHoatDong;
	}

	public void setDangHoatDong(boolean dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hoaDon")
	public Set<ChiTietHoaDon> getChiTietHoaDon() {
		return chiTietHoaDon;
	}

	public void setChiTietHoaDon(Set<ChiTietHoaDon> chiTietHoaDon) {
		this.chiTietHoaDon = chiTietHoaDon;
	}

}
