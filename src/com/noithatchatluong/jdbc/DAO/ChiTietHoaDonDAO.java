package com.noithatchatluong.jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.noithatchatluong.model.ChiTietHoaDon;
import com.noithatchatluong.model.KhachHang;

public class ChiTietHoaDonDAO {
	public DataProvider dataProvider;

	public ChiTietHoaDonDAO() {
	}

	public boolean insertChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) throws SQLException {
		String sql = "INSERT INTO ChiTietHoaDon (MaHoaDon, MaSanPham, SoLuong, DonGia, KhuyenMai) VALUES (?, ?, ?, ?, ?)";
		this.dataProvider.connect();

		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		int count = 1;

		statement.setString(count++, chiTietHoaDon.getMaHoaDon());
		statement.setString(count++, chiTietHoaDon.getMaSanPham());
		statement.setInt(count++, chiTietHoaDon.getSoLuong());
		statement.setDouble(count++, chiTietHoaDon.getDonGia());
		statement.setDouble(count++, chiTietHoaDon.getKhuyenMai());

		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		return rowInserted;
	}
	
	public ChiTietHoaDon getChiTietHoaDon(String maHoaDon, String maSanPham) throws SQLException {
		ChiTietHoaDon chiTietHoaDon = null;
		String sql = "SELECT * FROM ChiTietHoaDon WHERE MaHoaDon = ? AND MaSanPham = ?";
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, maHoaDon);
		statement.setString(2, maSanPham);

		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			int soLuong = resultSet.getInt("SoLuong");	
			double donGia = resultSet.getDouble("DonGia");
			double khuyenMai = resultSet.getDouble("KhuyenMai");
			
			chiTietHoaDon = new ChiTietHoaDon(maHoaDon, maSanPham, soLuong, donGia, khuyenMai);
		}
		
		resultSet.close();
		statement.close();
		
		return chiTietHoaDon;
	}
}
