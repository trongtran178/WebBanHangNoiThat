package com.noithatchatluong.jdbc.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
 
 
public class DataProvider {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	public Connection jdbcConnection;
	
	public DataProvider()
	{
		this.jdbcURL = "jdbc:mysql://den1.mysql3.gear.host:3306/webnoithat";
		this.jdbcUsername = "webnoithat";
		this.jdbcPassword = "Tj33~v1T_5RX";
		this.jdbcConnection = null;
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
	
//	public void excuteSQL(String sql) throws SQLException
//	{
//		Connection connection=getConnection();
//		PreparedStatement stmt=(PreparedStatement) connection.createStatement();
//		stmt.executeUpdate(sql);
//		
//	}
//	public ResultSet selectData(String sql) throws SQLException
//	{
//		Connection connection=getConnection();
//		PreparedStatement stmt=(PreparedStatement) connection.createStatement();
//		ResultSet rs= stmt.executeQuery(sql);
//		return rs;
//	}
//	
 
}
