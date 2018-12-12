package com.noithatchatluong.jdbc.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.noithatchatluong.model.HoaDon;

public class HoaDonDAO {
	public DataProvider dataProvider;

	public HoaDonDAO() {
	}

	public boolean insertHoaDon(HoaDon hoaDon) throws SQLException {
		String sql = "INSERT INTO HoaDon (ID, MaHoaDon, MaKhachHang, TongTien, NgayDat, TrangThai, GhiChu, DangHoatDong) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		this.dataProvider.connect();

		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		int count = 1;

		statement.setInt(count++, hoaDon.getId());
		statement.setString(count++, hoaDon.getMaHoaDon());
		statement.setString(count++, hoaDon.getMaKhachHang());
		statement.setDouble(count++, hoaDon.getTongTien());
		statement.setDate(count++, hoaDon.getNgayDat());
		statement.setString(count++, hoaDon.getTrangThai());
		statement.setString(count++, hoaDon.getGhiChu());
		statement.setInt(count++, hoaDon.getDangHoatDong());

		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		return rowInserted;
	}

	public boolean deletetHoaDon(HoaDon hoaDon) throws SQLException {
		String sql = "DELETE FROM HoaDon where MaHoaDon = ?";

		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, hoaDon.getMaHoaDon());

		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		return rowDeleted;
	}

	public int getMaxID() throws SQLException {

		int id = 0;
		String sql = "select ID from HoaDon order by ID DESC LIMIT 1";
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
