package com.noithatchatluong.jdbc.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.noithatchatluong.model.AdminUser;

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
	
	public boolean checkPassword(AdminUser adminuser) throws SQLException {
		String sql = "SELECT COUNT(*) FROM AdminUser WHERE username = ? AND password = ?";

		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		statement.setString(1, adminuser.getUsername());
		statement.setString(2, adminuser.getPassword());
		
		int count = statement.executeUpdate();
		statement.close();
		this.dataProvider.disconnect();
		if (count == 1)
			return true;
		
		return false;
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
}
