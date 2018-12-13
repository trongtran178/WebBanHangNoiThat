package com.noithatchatluong.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "ChiTietHoaDon", catalog = "webbanhangnoithat")
public class ChiTietHoaDon implements java.io.Serializable{

	private ChiTietHoaDonID id;
	private HoaDon hoaDon;
	private SanPham sanPham;

	public ChiTietHoaDon() {
	}

	public ChiTietHoaDon(ChiTietHoaDonID id) {
		this.id = id;
	}

	public ChiTietHoaDon(ChiTietHoaDonID id, HoaDon hoadon, SanPham sanpham) {
		this.id = id;
		this.hoaDon = hoadon;
		this.sanPham = sanpham;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "maHoaDon", column = @Column(name = "MaHoaDon", length = 10)),
			@AttributeOverride(name = "maSanPham", column = @Column(name = "MaSanPham", length = 10)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SoLuong")),
			@AttributeOverride(name = "donGia", column = @Column(name = "DonGia", precision = 22, scale = 0)),
			@AttributeOverride(name = "khuyenMai", column = @Column(name = "KhuyenMai", precision = 22, scale = 0)) })
	public ChiTietHoaDonID getId() {
		return this.id;
	}

	public void setId(ChiTietHoaDonID id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaHoaDon", insertable = false, updatable = false)
	public HoaDon getHoaDon() {
		return this.hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaSanPham", insertable = false, updatable = false)
	public SanPham getSanPham() {
		return this.sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
}
