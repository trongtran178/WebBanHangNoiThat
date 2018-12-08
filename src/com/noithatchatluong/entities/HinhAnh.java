package com.noithatchatluong.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HinhAnh")
public class HinhAnh implements Serializable {

	/**
	 * 
	 */
	private Integer id;
	private String maHinh;
	private String hinhCha;
	private String hinhCon;

	@Id
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "MaHinh", nullable = false)
	public String getMaHinh() {
		return maHinh;
	}

	public void setMaHinh(String maHinh) {
		this.maHinh = maHinh;
	}

	@Column(name = "HinhCha", nullable = false)
	public String getHinhCha() {
		return hinhCha;
	}

	public void setHinhCha(String hinhCha) {
		this.hinhCha = hinhCha;
	}

	@Column(name = "HinhCon", nullable = false)
	public String getHinhCon() {
		return hinhCon;
	}

	public void setHinhCon(String hinhCon) {
		this.hinhCon = hinhCon;
	}

/*	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maHinh")
	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}*/

}
