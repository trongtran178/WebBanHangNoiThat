package com.noithatchatluong.jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.noithatchatluong.model.BinhLuan;

public class BinhLuanDAO {

	public DataProvider dataProvider;
	
	public BinhLuan getSanPham(String maBinhLuan) throws SQLException {
		BinhLuan BinhLuan = new BinhLuan();
		String sql = "SELECT * FROM BinhLuan WHERE MaBinhLuan = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, maBinhLuan);
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			int id = resultSet.getInt("ID");
			String maSanPham = resultSet.getString("MaSanPham");
			String email = resultSet.getString("Email");
			String noiDung = resultSet.getString("NoiDung");
			Date thoiGian = resultSet.getDate("ThoiGian");
			BinhLuan = new BinhLuan(id, maSanPham, email, noiDung, thoiGian);
		}
		
		resultSet.close();
		statement.close();
		
		return BinhLuan;
	}
	
	public List<BinhLuan> getDanhSachBinhLuan(String maSanPham) throws SQLException {
	
		List<BinhLuan> listBinhLuan = new ArrayList<>();
		String sql = "SELECT * FROM BinhLuan WHERE MaSanPham = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, maSanPham);
		ResultSet resultSet = statement.executeQuery();
		
		while (resultSet.next()) {
			int id = resultSet.getInt("ID");
			String email = resultSet.getString("Email");
			String noiDung = resultSet.getString("NoiDung");
			Date thoiGian = resultSet.getDate("ThoiGian");
			
			BinhLuan binhLuan = new BinhLuan(id, maSanPham, email, noiDung, thoiGian);
			listBinhLuan.add(binhLuan);
		}
		
		resultSet.close();
		statement.close();
		this.dataProvider.disconnect();
		
		return listBinhLuan;
	}
	
	public boolean insertBinhLuan(BinhLuan binhLuan) throws SQLException {
		String sql = "INSERT INTO BinhLuan (ID, MaBinhLuan, MaSanPham, Email, NoiDung, ThoiGian) VALUES (?, ?, ?, ?, ?, ?)";
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setInt(1, binhLuan.getiD());
		statement.setString(2, binhLuan.getMaBinhLuan());
		statement.setString(3, binhLuan.getMaSanPham());
		statement.setString(4, binhLuan.getEmail());
		statement.setString(5, binhLuan.getNoiDung());
		statement.setDate(6, binhLuan.getThoiGian());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		return rowInserted;
	}
	
	public int getLastIDBinhLuan() throws SQLException {
		int id = 0;
		String sql = "select ID from BinhLuan order by ID DESC LIMIT 1";
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next()) {
			id = resultSet.getInt("ID");
		}
		resultSet.close();
		statement.close();
		this.dataProvider.disconnect();
		
		return id + 1;
	}

}
