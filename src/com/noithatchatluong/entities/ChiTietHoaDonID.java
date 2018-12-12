package com.noithatchatluong.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonID implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String maHoaDon;
	private String maSanPham;
	private Integer soLuong;
	private Double donGia;
	private Double khuyenMai;

	public ChiTietHoaDonID() {

	}

	public ChiTietHoaDonID(String maHoaDon, String maSanPham, Integer soLuong, Double donGia, Double khuyenMai) {
		super();
		this.maHoaDon = maHoaDon;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.khuyenMai = khuyenMai;
	}

	@Column(name = "MaHoaDon", length = 10)
	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	@Column(name = "MaSanPham", length = 10)
	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Column(name = "SoLuong")
	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "DonGia", precision = 22, scale = 0)
	public Double getDonGia() {
		return donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	@Column(name = "KhuyenMai", precision = 22, scale = 0)
	public Double getKhuyenMai() {
		return khuyenMai;
	}

	public void setKhuyenMai(Double khuyenMai) {
		this.khuyenMai = khuyenMai;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChiTietHoaDonID))
			return false;
		ChiTietHoaDonID castOther = (ChiTietHoaDonID) other;

		return ((this.getMaHoaDon() == castOther.getMaHoaDon()) || (this.getMaHoaDon() != null
				&& castOther.getMaHoaDon() != null && this.getMaHoaDon().equals(castOther.getMaHoaDon())))
				&& ((this.getMaSanPham() == castOther.getMaSanPham()) || (this.getMaSanPham() != null
						&& castOther.getMaSanPham() != null && this.getMaSanPham().equals(castOther.getMaSanPham())))
				&& ((this.getSoLuong() == castOther.getSoLuong()) || (this.getSoLuong() != null
						&& castOther.getSoLuong() != null && this.getSoLuong().equals(castOther.getSoLuong())))
				&& ((this.getDonGia() == castOther.getDonGia()) || (this.getDonGia() != null
						&& castOther.getDonGia() != null && this.getDonGia().equals(castOther.getDonGia())))
				&& ((this.getKhuyenMai() == castOther.getKhuyenMai()) || (this.getKhuyenMai() != null
						&& castOther.getKhuyenMai() != null && this.getKhuyenMai().equals(castOther.getKhuyenMai())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMaHoaDon() == null ? 0 : this.getMaHoaDon().hashCode());
		result = 37 * result + (getMaSanPham() == null ? 0 : this.getMaSanPham().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonGia() == null ? 0 : this.getDonGia().hashCode());
		result = 37 * result + (getKhuyenMai() == null ? 0 : this.getKhuyenMai().hashCode());
		return result;
	}

}
