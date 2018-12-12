package com.noithatchatluong.jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.noithatchatluong.model.SanPham;

public class SanPhamDAO {

	public DataProvider dataProvider;
	
	public List<SanPham> getSanPham() throws SQLException {
		List<SanPham> listSanPham = new ArrayList<>();
		String sql = "select sanpham.ID,MaSanPham,MaHangMuc,TenSanPham,DonGia,MoTa,KhuyenMai,cao,dai,rong,chatlieu,xuatxu,mausac,HinhCha as hinhanh,SoLuongDaBan,NgayNhap,DangHoatDong\r\n" + 
				"from sanpham inner join hinhanh on sanpham.MaHinhAnh=hinhanh.MaHinh\r\n" + 
				"";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		//statement.setString(1, maSanPham);
		ResultSet resultSet = statement.executeQuery();
		


		if (resultSet.next()) {
			int id = resultSet.getInt("ID");
			String maHangMuc = resultSet.getString("MaHangMuc");
			String tenSanPham = resultSet.getString("TenSanPham");
			double donGia = resultSet.getDouble("DonGia");
			String moTa = resultSet.getString("MoTa");
			double khuyenMai = resultSet.getDouble("KhuyenMai");
			float cao = resultSet.getFloat("Cao");
			float dai = resultSet.getFloat("Dai");
			float rong = resultSet.getFloat("Rong");
			String chatLieu = resultSet.getString("ChatLieu");
			String xuatXu = resultSet.getString("XuatXu");
			String mauSac = resultSet.getString("MauSac");
			String hinhAnh = resultSet.getString("MaHinhAnh");
			int soLuongDaBan = resultSet.getInt("SoLuongDaBan");
			Date ngayNhap = resultSet.getDate("NgayNhap");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			
			
			if (dangHoatDong != 0) {
				SanPham sanPham=new SanPham(id, maHangMuc, tenSanPham, donGia, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, hinhAnh, soLuongDaBan, ngayNhap, dangHoatDong);
				listSanPham.add(sanPham);
			}
		}
		
		resultSet.close();
		statement.close();
		
		return listSanPham;
	}
	
	
	
	
}	