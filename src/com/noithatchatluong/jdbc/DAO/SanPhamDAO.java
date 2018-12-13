package com.noithatchatluong.jdbc.DAO;

<<<<<<< HEAD
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.noithatchatluong.model.HangMuc;
import com.noithatchatluong.model.SanPham;
import com.noithatchatluong.model.HinhAnh;


public class SanPhamDAO {

	public DataProvider dataProvider;
	
	public List<SanPham> getSanPham() throws SQLException {
		List<SanPham> listSanPham = new ArrayList<>();
		String sql = "select distinct sanpham.ID,MaSanPham,MaHangMuc,TenSanPham,DonGia,MoTa,KhuyenMai,cao,dai,rong,chatlieu,xuatxu,mausac,HinhCha as hinhanh,SoLuongDaBan,NgayNhap,DangHoatDong\r\n" + 
				"from sanpham inner join hinhanh on sanpham.MaHinhAnh=hinhanh.MaHinh\r\n" + 
				"";
		
		this.dataProvider = new DataProvider();

		this.dataProvider.connect();

		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);

		//statement.setString(1, maSanPham);
		ResultSet resultSet = statement.executeQuery();



		while(resultSet.next()) {
			int id = resultSet.getInt("ID");
			String maHangMuc = resultSet.getString("MaHangMuc");
			String tenSanPham = resultSet.getString("TenSanPham");
			double donGia = resultSet.getDouble("DonGia");
			String moTa = resultSet.getString("MoTa");
			double khuyenMai = resultSet.getDouble("KhuyenMai");
			float cao = resultSet.getFloat("Cao");
			float dai = resultSet.getFloat("Dai");
			float rong = resultSet.getFloat("Rong");
			String chatLieu = resultSet.getString("ChatLieu");
			String xuatXu = resultSet.getString("XuatXu");
			String mauSac = resultSet.getString("MauSac");
			String hinhAnh = resultSet.getString("HinhAnh");
			int soLuongDaBan = resultSet.getInt("SoLuongDaBan");
			Date ngayNhap = resultSet.getDate("NgayNhap");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			
			
			if (dangHoatDong != 0) {
				SanPham sanPham=new SanPham(id, maHangMuc, tenSanPham, donGia, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, hinhAnh, soLuongDaBan, ngayNhap, dangHoatDong);
				listSanPham.add(sanPham);
			}
		}
		
		resultSet.close();
		statement.close();
		
		return listSanPham;
	}
	public SanPham getSanPhambyID(int id) throws SQLException {
		SanPham sanPham =null;
		String sql = "select* from sanpham where sanpham.id="+id;
		
		this.dataProvider = new DataProvider();

		this.dataProvider.connect();

		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);

		//statement.setString(1, maSanPham);
		ResultSet resultSet = statement.executeQuery();



		while(resultSet.next()) {
			int iD = resultSet.getInt("ID");
			String maHangMuc = resultSet.getString("MaHangMuc");
			String tenSanPham = resultSet.getString("TenSanPham");
			double donGia = resultSet.getDouble("DonGia");
			String moTa = resultSet.getString("MoTa");
			double khuyenMai = resultSet.getDouble("KhuyenMai");
			float cao = resultSet.getFloat("Cao");
			float dai = resultSet.getFloat("Dai");
			float rong = resultSet.getFloat("Rong");
			String chatLieu = resultSet.getString("ChatLieu");
			String xuatXu = resultSet.getString("XuatXu");
			String mauSac = resultSet.getString("MauSac");
			String hinhAnh = resultSet.getString("maHinhAnh");
			int soLuongDaBan = resultSet.getInt("SoLuongDaBan");
			Date ngayNhap = resultSet.getDate("NgayNhap");
			int dangHoatDong = resultSet.getInt("DangHoatDong");

			
			
			if (dangHoatDong != 0) {
				sanPham=new SanPham(id, maHangMuc, tenSanPham, donGia, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, hinhAnh, soLuongDaBan, ngayNhap, dangHoatDong);
				
			}
		}
		
		resultSet.close();
		statement.close();
		
		return sanPham;
	}
	public HinhAnh getHinhAnhbyID(String mahinh) throws SQLException {
		HinhAnh hinhAnh =null;
		String sql = "select* from hinhanh where hinhanh.mahinh='"+mahinh+"'";
		
		this.dataProvider = new DataProvider();

		this.dataProvider.connect();

		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);

		//statement.setString(1, maSanPham);
		ResultSet resultSet = statement.executeQuery();



		while(resultSet.next()) {
			
			String hinhcha = resultSet.getString("hinhcha");
			String hinhcon = resultSet.getString("hinhcon");
			

			hinhAnh =new HinhAnh(1, mahinh, hinhcha, hinhcon);
			
			
				
			
		}
		
		resultSet.close();
		statement.close();
		
		return hinhAnh;
	}
	public boolean DeleteSP(int id) throws SQLException
	{
		String sql="call webbanhangnoithat.deleteSP(?);";
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);
		return statement.executeUpdate() > 0;
	}
	public boolean AddSP(SanPham sp) throws SQLException
	{
		String sql="call webbanhangnoithat.addsp(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);\r\n" + 
				"";	
		
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setInt(1, sp.getId());
		statement.setString(2, sp.getMaSanPham());
		statement.setString(3, sp.getMaHangMuc());
		statement.setString(4, sp.getTenSanPham());
		statement.setDouble(5, sp.getDonGia());
		statement.setString(6, sp.getMoTa());
		statement.setDouble(7, sp.getKhuyenMai());
		statement.setFloat(8, sp.getCao());
		statement.setFloat(9, sp.getDai());
		statement.setFloat(10, sp.getRong());
		statement.setString(11, sp.getChatLieu());
		statement.setString(12, sp.getXuatXu());
		statement.setString(13, sp.getMauSac());
		statement.setString(14, sp.getHinhAnh());
		statement.setInt(15, sp.getSoLuongDaBan());
		statement.setDate(16, (java.sql.Date) sp.getNgayNhap());
		statement.setInt(17, sp.getDangHoatDong());
		
		
		return statement.executeUpdate() > 0;
		
	}
	public boolean UpdateSP(SanPham sp) throws SQLException
	{
		String sql="update sanpham set mahangmuc=?,tensanpham=?,dongia=?,mota=?,khuyenmai=?,cao=?,dai=?,rong=?,chatlieu=?,xuatxu=?,mausac=?,soluongdaban=?,danghoatdong=? where id=?";
		
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		
	
		statement.setString(1, sp.getMaHangMuc());
		statement.setString(2, sp.getTenSanPham());
		statement.setDouble(3, sp.getDonGia());
		statement.setString(4, sp.getMoTa());
		statement.setDouble(5, sp.getKhuyenMai());
		statement.setFloat(6, sp.getCao 	());
		statement.setFloat(7, sp.getDai());
		statement.setFloat(8, sp.getRong());
		statement.setString(9, sp.getChatLieu());
		statement.setString(10, sp.getXuatXu());
		statement.setString(11, sp.getMauSac());
		statement.setInt(12, sp.getSoLuongDaBan());
		statement.setInt(13, sp.getDangHoatDong());
		statement.setInt(14, sp.getId());
		
		
		return statement.executeUpdate() > 0;
		
	}
	public boolean Addha (HinhAnh ha) throws SQLException
	{
		String sql= "INSERT INTO `webbanhangnoithat`.`hinhanh` (`ID`, `MaHinh`, `HinhCha`, `HinhCon`) VALUES (?,?,?,?);";
		
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		statement.setInt(1, ha.getiD());
		statement.setString(2, ha.getMaHinh());
		statement.setString(3, ha.getHinhCha());
		statement.setString(4, ha.getHinhCon());
	
		return statement.executeUpdate() > 0;
		
	}
	public boolean Updateha (HinhAnh ha) throws SQLException
	{
		String sql= "update hinhanh set hinhcha=?,hinhcon=? where mahinh=?";
		
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
			
		statement.setString(1, ha.getHinhCha());
		statement.setString(2, ha.getHinhCon());
		statement.setString(3, ha.getMaHinh());
		return statement.executeUpdate() > 0;
		
	}
	public int GetMaxID() throws SQLException
	{
		String sql="select max(ID) as id from sanpham";
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		resultSet.next();
		int id=resultSet.getInt("id");
		
		return id+1;
	}
	public int GetMaxIDHinhAnh() throws SQLException
	{
		String sql="select max(ID) as id from hinhanh";
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		resultSet.next();
		int id=resultSet.getInt("id");
		
		return id+1;
	}
	public List<HangMuc> GetListHangMuc() throws SQLException
	{
		List<HangMuc> ListhangMuc=new ArrayList<>();
		String sql="select IDHangMuc as id,TenHangMuc from hangmucsanpham";
		this.dataProvider = new DataProvider();
		
		this.dataProvider.connect();
		
		PreparedStatement statement = this.dataProvider.jdbcConnection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next())
		{
			int id=resultSet.getInt("id");
			String tenhangmuc=resultSet.getString("tenhangmuc");
			HangMuc hangMuc=new HangMuc(id,tenhangmuc);
			ListhangMuc.add(hangMuc);
		}
		return ListhangMuc;
	}
	
	
	
	
	
}	
=======
import java.sql.Date;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.noithatchatluong.model.SanPham;

public class SanPhamDAO {
	
	public static Map<String,SanPham> mapSanPham=loadData();
	public SanPhamDAO() {
		
	}
	public Map<String, SanPham> loadData() {
		Map<String,SanPham> mapSP=new HashMap<>(); 
		try {
			ResultSet rs= new DataProvider().selectData("select* from sanpham");
			while(rs.next())
			{
				String iD=rs.getString(1);
				String maSanPham=rs.getString(2);
				String maHangMuc=rs.getString(3);
				String tenSanPham=rs.getString(4);
				double donGia=rs.getDouble(5);
				String phanLoai=rs.getString(6);
				String moTa=rs.getString(7);
				String khuyenMai=rs.getString(8);
				double cao=rs.getDouble(9);
				double dai=rs.getDouble(10);
				double rong=rs.getDouble(11);
				String chatLieu=rs.getString(12);
				String xuatXu=rs.getString(13);
				String mauSac=rs.getString(14);
				String hinhAnh=rs.getString(15);
				int soLuongDaBan=rs.getInt(16);
				Date ngayNhap=rs.getDate(16);
				int dangHoatDong=rs.getInt(17);
				SanPham sp=new SanPham(iD, maSanPham, maHangMuc, tenSanPham, donGia, phanLoai, moTa, khuyenMai, cao, dai, rong, chatLieu, xuatXu, mauSac, hinhAnh, soLuongDaBan, ngayNhap, dangHoatDong);
				mapSP.put(sp.getMaSanPham(), sp);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mapSP;
	}
	
}
>>>>>>> test2
