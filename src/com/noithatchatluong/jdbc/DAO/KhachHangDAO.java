package com.noithatchatluong.jdbc.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.BCryptUtils;
 
public class KhachHangDAO {
	public DataProvider dataProvider;
	
	public KhachHangDAO() {
	}	
	
	
	public List<KhachHang> listAllKhachHangs() throws SQLException {
		List<KhachHang> listKhachHang = new ArrayList<KhachHang>();
		
		String sql = "SELECT * FROM khachhang";
		
		this.dataProvider = new DataProvider();
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
	
	
	public boolean tangSoNguoiGioiThieu(String emailKhachHang) throws SQLException {
		String sql = "update khachhang set songuoidagioithieu = songuoidagioithieu + 1 where email = ?";
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, emailKhachHang);
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		this.dataProvider.disconnect();
		return rowUpdated;	
	}
	
	
	public boolean updateKhachHang(KhachHang khachhang) throws SQLException {
		String sql = "UPDATE khachhang SET HoTen = ?, SDT = ?, DIaChi = ?, Password = ?";
		sql += " WHERE MaKhachHang = ?";
		
		this.dataProvider = new DataProvider();
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
		
		this.dataProvider = new DataProvider();
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
		this.dataProvider.disconnect();
		
		return khachhang;
	}
	
	public boolean checkPassword(KhachHang khachHang) throws SQLException {
		String sql = "SELECT * from KhachHang where email = ? AND DangHoatDong = 1";
		
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
		String sql = "UPDATE KhachHang SET password = ? WHERE Email = ?";
		
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
	
	public boolean checkEmailTonTai(String email) throws SQLException {
		String sql = "SELECT COUNT(*) as count FROM KhachHang WHERE Email = ? AND  DangHoatDong = 1;";
		boolean isSuccess = false;

		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
		statement.setString(1, email);
		
		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {
			int count = resultSet.getInt("count");
			if (count > 0) {
				isSuccess = true;
			}
		}
		
		statement.close();
		this.dataProvider.disconnect();
		
		return isSuccess;
	}
	
	
	public int getLastIDKhachHang() throws SQLException {
		int id = 0;
		String sql = "select ID from KhachHang order by ID DESC LIMIT 1";
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
	
	public KhachHang getKhachHangByEmail(String email) throws SQLException {
		KhachHang khachhang = null;
		String sql = "SELECT * FROM khachhang WHERE Email = ?";
		
		this.dataProvider = new DataProvider();
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setString(1, email);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {

			int iD = resultSet.getInt("ID");

			String maKhachHang = resultSet.getString("MaKhachHang");	
			String hoTen = resultSet.getString("HoTen");
			String sdt = resultSet.getString("SDT");
			String diaChi = resultSet.getString("DiaChi");
			String password = resultSet.getString("Password");
			Date ngayDangKy = resultSet.getDate("NgayDangKy");
			int daDangKy = resultSet.getInt("DaDangKy");
			int soNguoiDaGioiThieu = resultSet.getInt("SoNguoiDaGioiThieu");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			khachhang = new KhachHang(iD, maKhachHang, email, hoTen, sdt, diaChi, password, ngayDangKy, daDangKy, soNguoiDaGioiThieu, dangHoatDong);
		}
		
		resultSet.close();
		statement.close();

		this.dataProvider.disconnect();

		return khachhang;
	}

	
}

