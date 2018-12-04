package com.noithatchatluong.DAO;

import javax.websocket.Session;

import org.hibernate.SessionFactory;

import com.noithatchatluong.entities.SanPham;
import com.noithatchatluong.utils.HibernateUtils;

public class SanPhamDAO {

	@SuppressWarnings("unused")
	private static SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

	public static SanPham timSanPhamBoiMaSanPham(String maSanPham) {

		return null;
	}

	public static boolean themSanPham(SanPham sanPham) {
		
		return false;

	}

	public static boolean xoaSanPham(String maSanPham) {
		return false;

	}

	public static boolean suaThongTinSanPham(SanPham sanPham) {
		return false;
	}

}
