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
	
	public SanPham getSanPham(String maSanPham) throws SQLException {
		SanPham sanPham = new SanPham();
		String sql = "SELECT * FROM SanPham WHERE MaSanPham = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, maSanPham);
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
			String maHinhAnh = resultSet.getString("MaHinhAnh");
			int soLuongDaBan = resultSet.getInt("SoLuongDaBan");
			Date ngayNhap = resultSet.getDate("NgayNhap");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			HinhAnhDAO hinhAnhDAO = new HinhAnhDAO();
			List<String> danhSachHinhAnh = hinhAnhDAO.getDanhSachHinh(maHinhAnh);
			
			if (dangHoatDong != 0) {
				sanPham = new SanPham(id, maHangMuc, tenSanPham, donGia, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, maHinhAnh, soLuongDaBan, ngayNhap, dangHoatDong, danhSachHinhAnh);
			}
		}
		
		resultSet.close();
		statement.close();
		
		return sanPham;
	}
	
	public List<SanPham> getDanhSachSanPhamAll() throws SQLException {
	
		String sql = "SELECT * FROM SanPham";
		return getDanhSachSanPhamTheoQuery(sql);
	}
	
	public List<SanPham> getDanhSachSanPhamMoi() throws SQLException {
	
		String sql = "SELECT * FROM SanPham ORDER BY NgayNhap LIMIT 4;";
		return getDanhSachSanPhamTheoQuery(sql);
	}
	

	public List<SanPham> getDanhSachSanPhamBanChay() throws SQLException {
	
		String sql = "SELECT * FROM SanPham ORDER BY SoLuongDaBan DESC LIMIT 4;";
		return getDanhSachSanPhamTheoQuery(sql);
	}
	
	public List<SanPham> getDanhSachSanPhamBanKhuyenMaiNhieuNhat() throws SQLException {		
		String sql = "SELECT * FROM SanPham ORDER BY KhuyenMai DESC LIMIT 4;";
		
		return getDanhSachSanPhamTheoQuery(sql);
	}
	
	public List<SanPham> getDanhSachSanPhamTheoQuery(String sql) throws SQLException {
		List<SanPham> listSanPham = new ArrayList<>();
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		
		while (resultSet.next()) {
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
			String maHinhAnh = resultSet.getString("MaHinhAnh");
			int soLuongDaBan = resultSet.getInt("SoLuongDaBan");
			Date ngayNhap = resultSet.getDate("NgayNhap");
			int dangHoatDong = resultSet.getInt("DangHoatDong");
			
			HinhAnhDAO hinhAnhDAO = new HinhAnhDAO();
			List<String> danhSachHinhAnh = hinhAnhDAO.getDanhSachHinh(maHinhAnh);
			
			if (dangHoatDong != 0) {
				SanPham sanPham = new SanPham(id, maHangMuc, tenSanPham, donGia, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, maHinhAnh, soLuongDaBan, ngayNhap, dangHoatDong, danhSachHinhAnh);
				listSanPham.add(sanPham);
			}
		}
		
		resultSet.close();
		statement.close();
		
		return listSanPham;
	}
}
