package com.noithatchatluong.jdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.noithatchatluong.model.AdminUser;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.BCryptUtils;

public class KhachHangDAO {
	public DataProvider dataProvider;
	
	public KhachHangDAO() {
	}	
	
	
	public List<KhachHang> listAllKhachHangs() throws SQLException {
		List<KhachHang> listKhachHang = new ArrayList<>();
		
		String sql = "SELECT * FROM khachhang";
		
		this.dataProvider.connect();
		
		Statement statement = this.dataProvider.jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String maKhachHang = resultSet.getString("MaKhachHang");

			KhachHang khachhang = this.getKhachHang(maKhachHang);
			listKhachHang.add(khachhang);
		}
		
		resultSet.close();
		statement.close();
		
		this.dataProvider.disconnect();
		
		return listKhachHang;
	}
	
	
	public boolean updateKhachHang(KhachHang khachhang) throws SQLException {
		String sql = "UPDATE khachhang SET HoTen = ?, SDT = ?, DIaChi = ?, Password = ?";
		sql += " WHERE MaKhachHang = ?";
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, khachhang.getHoTen());
		statement.setString(2, khachhang.getSoDienThoai());
		statement.setString(3, khachhang.getDiaChi());
		statement.setString(4, khachhang.getPassword());
		statement.setString(5, khachhang.getMaKhachHang());

		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		return rowUpdated;		
	}
	
	public KhachHang getKhachHang(String MaKhachHang) throws SQLException {
		KhachHang khachhang = null;
		String sql = "SELECT * FROM khachhang WHERE MaKhachHang = ?";
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, MaKhachHang);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			int iD = resultSet.getInt("id");
			String email = resultSet.getString("Email");	
			String hoTen = resultSet.getString("HoTen");
			String sdt = resultSet.getString("SDT");
			String diaChi = resultSet.getString("DiaChi");
			String password = resultSet.getString("Password");
			Date ngayDangKy = resultSet.getDate("NgayDangKy");
			int daDangKy = resultSet.getInt("DaDangKy");
			int soNguoiDaGioiThieu = resultSet.getInt("SoNguoiDaGioiThieu");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			khachhang = new KhachHang(iD, MaKhachHang, email, hoTen, sdt, diaChi, password, ngayDangKy, daDangKy, soNguoiDaGioiThieu, dangHoatDong);
		}
		
		resultSet.close();
		statement.close();
		
		return khachhang;
	}
	
	public boolean checkPassword(KhachHang khachHang) throws SQLException {
		String sql = "SELECT * from KhachHang where email = ?";
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		statement.setString(1, khachHang.getEmail());
		
		ResultSet resultSet = statement.executeQuery();
		String password = "1";
		
		if (resultSet.next()) {
			password = resultSet.getString("password");
			
		}
		statement.close();
		this.dataProvider.disconnect();
		
		boolean isSuccess = BCryptUtils.checkPassword(khachHang.getPassword(), password);
		
		return isSuccess;
	}
	
	public boolean updatePassword(KhachHang khachHang) throws SQLException {
		String sql = "UPDATE AdminUser SET password = ? WHERE Email = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		
		statement.setString(1, khachHang.getPassword());
		statement.setString(2, khachHang.getEmail());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		
		return rowUpdated;		
	}
}
