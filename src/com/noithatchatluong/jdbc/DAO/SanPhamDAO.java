package com.noithatchatluong.jdbc.DAO;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.noithatchatluong.model.SanPham;

public class SanPhamDAO {
	
	public static Map<String,SanPham> mapSanPham=loadData();
	public SanPhamDAO() {
		
	}
	public Map<String, SanPham> loadData() {
		Map<String,SanPham> mapSP=new HashMap<>(); 
		try {
			ResultSet rs= new DataProvider().selectData("select* from sanpham");
			while(rs.next())
			{
				String iD=rs.getString(1);
				String maSanPham=rs.getString(2);
				String maHangMuc=rs.getString(3);
				String tenSanPham=rs.getString(4);
				double donGia=rs.getDouble(5);
				String phanLoai=rs.getString(6);
				String moTa=rs.getString(7);
				String khuyenMai=rs.getString(8);
				double cao=rs.getDouble(9);
				double dai=rs.getDouble(10);
				double rong=rs.getDouble(11);
				String chatLieu=rs.getString(12);
				String xuatXu=rs.getString(13);
				String mauSac=rs.getString(14);
				String hinhAnh=rs.getString(15);
				int soLuongDaBan=rs.getInt(16);
				Date ngayNhap=rs.getDate(16);
				int dangHoatDong=rs.getInt(17);
				SanPham sp=new SanPham(iD, maSanPham, maHangMuc, tenSanPham, donGia, phanLoai, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, hinhAnh, soLuongDaBan, ngayNhap, dangHoatDong);
				mapSP.put(sp.getMaSanPham(), sp);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mapSP;
	}
	
}
