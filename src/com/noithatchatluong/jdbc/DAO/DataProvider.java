package com.noithatchatluong.jdbc.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
 
 
public class DataProvider {
	static String databaseName="";
	static String url="jdbc:mysql://localhost:3306/webnoithat";
	static String username="root";
	static String password="hoanhtu1998";
	static Connection connection =null;
	public DataProvider()
	{
		databaseName="webnoithat";
	}
	public static Connection getConnection()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, username, password);
		}
		catch (SQLException | ClassNotFoundException e) {
			System.out.println("lỗi"+e.getMessage());
		}
		return connection;
	}
	protected void disconnect() throws SQLException {
		if ( connection != null && !connection.isClosed()) {
		      connection.close();
		}
	}
	public static void main(String[] args)
	{
		System.out.println(getConnection());
	}
	
	public void excuteSQL(String sql) throws SQLException
	{
		Connection connection=getConnection();
		PreparedStatement stmt=(PreparedStatement) connection.createStatement();
		stmt.executeUpdate(sql);
		
	}
	public ResultSet selectData(String sql) throws SQLException
	{
		Connection connection=getConnection();
		PreparedStatement stmt=(PreparedStatement) connection.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		return rs;
		
	}
	
 
}