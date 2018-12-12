package com.noithatchatluong.jdbc.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.noithatchatluong.model.AdminUser;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.BCryptUtils;

public class AdminUserDAO {
	
	public DataProvider dataProvider;
			
	public boolean updateAdminUser(AdminUser adminuser) throws SQLException {
		String sql = "UPDATE AdminUser SET password = ?, QuyenHan = ?, DangHoatDong = ? WHERE Username = ?";
		
		this.dataProvider = new DataProvider();
				
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		statement.setString(1, adminuser.getPassword());
		statement.setString(2, adminuser.getQuyenHan());
		statement.setInt(3, adminuser.getDangHoatDong());
		statement.setString(4, adminuser.getUsername());

		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		
		return rowUpdated;		
	}
	
	public boolean updatePassword(AdminUser adminuser) throws SQLException {
		String sql = "UPDATE AdminUser SET password = ? WHERE Username = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		
		statement.setString(1, adminuser.getPassword());
		statement.setString(2, adminuser.getUsername());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		
		return rowUpdated;		
	}
	
	public boolean checkPassword(AdminUser adminUser) throws SQLException {
		String sql = "SELECT * from AdminUser where Username = ? AND DangHoatDong = 1";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		statement.setString(1, adminUser.getUsername());
		
		ResultSet resultSet = statement.executeQuery();
		String password = "1";
		
		if (resultSet.next()) {
			password = resultSet.getString("password");
			
		}
		statement.close();
		this.dataProvider.disconnect();
		
		boolean isSuccess = BCryptUtils.checkPassword(adminUser.getPassword(), password);
		
		return isSuccess;
	}
	
	public boolean changePassword(String username, String matKhauCu, String matKhauMoi) throws SQLException {
		
		AdminUser oldUser = new AdminUser(username, matKhauCu);
		
		if (checkPassword(oldUser)) {
			AdminUser newUser = new AdminUser(username, matKhauMoi);
			updatePassword(newUser);
			
			return true;
		}		
		
		return false;		
	}
	
	
	public AdminUser getAdminUser(String username) throws SQLException {
		AdminUser adminUser = null;
		String sql = "SELECT * FROM AdminUser WHERE Username = ? and DangHoatDong = 1";
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, username);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			
			String password = resultSet.getString("Password");
			String quyenHan = resultSet.getString("QuyenHan");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			adminUser = new AdminUser(username, password, quyenHan, dangHoatDong);
		}
		
		resultSet.close();
		statement.close();
		
		return adminUser;
	}

}
