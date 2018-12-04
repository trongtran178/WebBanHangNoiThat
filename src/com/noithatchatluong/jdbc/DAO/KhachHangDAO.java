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

import com.noithatchatluong.model.KhachHang;

public class KhachHangDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public KhachHangDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	
	
	public List<KhachHang> listAllKhachHangs() throws SQLException {
		List<KhachHang> listKhachHang = new ArrayList<>();
		
		String sql = "SELECT * FROM khachhang";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String maKhachHang = resultSet.getString("MaKhachHang");

			KhachHang khachhang = this.getKhachHang(maKhachHang);
			listKhachHang.add(khachhang);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listKhachHang;
	}
	
	
	public boolean updateKhachHang(KhachHang khachhang) throws SQLException {
		String sql = "UPDATE khachhang SET HoTen = ?, SDT = ?, DIaChi = ?, Password = ?";
		sql += " WHERE MaKhachHang = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, khachhang.getHoTen());
		statement.setString(2, khachhang.getSoDienThoai());
		statement.setString(3, khachhang.getDiaChi());
		statement.setString(4, khachhang.getPassword());
		statement.setString(5, khachhang.getMaKhachHang());

		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}
	
	public KhachHang getKhachHang(String MaKhachHang) throws SQLException {
		KhachHang khachhang = null;
		String sql = "SELECT * FROM khachhang WHERE MaKhachHang = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
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
}
