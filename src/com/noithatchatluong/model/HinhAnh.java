package com.noithatchatluong.model;

public class HinhAnh {
	private int iD;
	private String maHinh;
	private String hinhCha;
	private String hinhCon;
	public HinhAnh(int iD, String maHinh, String hinhCha, String hinhCon) {
		super();
		this.iD = iD;
		this.maHinh = maHinh;
		this.hinhCha = hinhCha;
		this.hinhCon = hinhCon;
	}
	public HinhAnh( String hinhCha, String hinhCon,String maHinh) {
		super();
	
		this.maHinh = maHinh;
		this.hinhCha = hinhCha;
		this.hinhCon = hinhCon;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getMaHinh() {
		return maHinh;
	}
	public void setMaHinh(String maHinh) {
		this.maHinh = maHinh;
	}
	public String getHinhCha() {
		return hinhCha;
	}
	public void setHinhCha(String hinhCha) {
		this.hinhCha = hinhCha;
	}
	public String getHinhCon() {
		return hinhCon;
	}
	public void setHinhCon(String hinhCon) {
		this.hinhCon = hinhCon;
	}
	
}
