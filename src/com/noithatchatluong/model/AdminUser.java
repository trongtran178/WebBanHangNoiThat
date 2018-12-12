package com.noithatchatluong.model;

public class AdminUser {
	private String username;
	private String password;
	private String quyenHan;
	private int dangHoatDong;
	public static String ADMIN = "Admin";
	public static String MOD_QLBV = "ModQLBV";
	public static String MOD_QLSP = "ModQLSP";
	
	public AdminUser() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuyenHan() {
		return quyenHan;
	}

	public void setQuyenHan(String quyenHan) {
		this.quyenHan = quyenHan;
	}

	public int getDangHoatDong() {
		return dangHoatDong;
	}

	public void setDangHoatDong(int dangHoatDong) {
		this.dangHoatDong = dangHoatDong;
	}

	public AdminUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public AdminUser(String username, String password, String quyenHan, int dangHoatDong) {
		super();
		this.username = username;
		this.password = password;
		this.quyenHan = quyenHan;
		this.dangHoatDong = dangHoatDong;
	}
	
}
