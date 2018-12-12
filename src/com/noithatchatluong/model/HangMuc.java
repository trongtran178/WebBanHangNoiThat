package com.noithatchatluong.model;

public class HangMuc {
	protected String iDHangMuc;
	protected String tenHangMuc;
	protected String iDHangMucCha;
	public HangMuc( String iDHangMuc,String tenHangMuc) {
		super();
		this.iDHangMuc=iDHangMuc;
		this.tenHangMuc = tenHangMuc;
		
	}
	public String getiDHangMuc() {
		return iDHangMuc;
	}
	public void setiDHangMuc(String iDHangMuc) {
		this.iDHangMuc = iDHangMuc;
	}
	public String getTenHangMuc() {
		return tenHangMuc;
	}
	public void setTenHangMuc(String tenHangMuc) {
		this.tenHangMuc = tenHangMuc;
	}
	public String getiDHangMucCha() {
		return iDHangMucCha;
	}
	public void setiDHangMucCha(String iDHangMucCha) {
		this.iDHangMucCha = iDHangMucCha;
	}
	
	
}
