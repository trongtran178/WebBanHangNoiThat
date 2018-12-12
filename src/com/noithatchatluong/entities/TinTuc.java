package com.noithatchatluong.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TinTuc")
public class TinTuc {
	private int ID;
	private String maTinTuc;
	private String tieuDe;
	private String noiDung;
	private Date ngayTao;
	private String hinhDaiDien;

	public TinTuc() {

	}

	public TinTuc(int ID, String tieuDe, String noiDung, Date ngayTao, String hinhDaiDien) {
		this.ID = ID;
		this.maTinTuc = "TT" + Integer.toString(ID);
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayTao = ngayTao;
		this.hinhDaiDien = hinhDaiDien;
	}
	
	@Id
	@Column(name = "ID", nullable = false)
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	@Column(name = "MaTinTuc", nullable = false)
	public String getMaTinTuc() {
		return maTinTuc;
	}

	public void setMaTinTuc(String maTinTuc) {
		this.maTinTuc = maTinTuc;
	}
	
	@Column(name = "TieuDe", nullable = false)
	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	
	@Column(name = "NoiDung", nullable = false)
	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
	@Column(name = "NgayTao", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	
	@Column(name = "HinhDaiDien")
	public String getHinhDaiDien() {
		return hinhDaiDien;
	}

	public void setHinhDaiDien(String hinhDaiDien) {
		this.hinhDaiDien = hinhDaiDien;
	}

}
