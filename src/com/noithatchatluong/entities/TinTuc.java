package com.noithatchatluong.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMaTinTuc() {
		return maTinTuc;
	}

	public void setMaTinTuc(String maTinTuc) {
		this.maTinTuc = maTinTuc;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getHinhDaiDien() {
		return hinhDaiDien;
	}

	public void setHinhDaiDien(String hinhDaiDien) {
		this.hinhDaiDien = hinhDaiDien;
	}

}
