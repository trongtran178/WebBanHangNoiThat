package com.noithatchatluong.jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.noithatchatluong.model.SanPham;

public class HinhAnhDAO {

	public DataProvider dataProvider;
	
	public List<String> getDanhSachHinh(String maHinhAnh) throws SQLException {
		SanPham sanPham = new SanPham();
		String sql = "SELECT * FROM HinhAnh WHERE MaHinh = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, maHinhAnh);
		ResultSet resultSet = statement.executeQuery();
		
		List<String> danhSachHinhAnh = new ArrayList<String>();

		while (resultSet.next()) {
			String hinhAnh = resultSet.getString("HinhCon");
			danhSachHinhAnh.add(hinhAnh);
		}
		
		resultSet.close();
		statement.close();
		
		return danhSachHinhAnh;
	}
}
