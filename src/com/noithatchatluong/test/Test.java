package com.noithatchatluong.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.noithatchatluong.entities.ChiTietHoaDon;
import com.noithatchatluong.jdbc.DAO.KhachHangDAO;
import com.noithatchatluong.model.KhachHang;
import com.noithatchatluong.utils.BCryptUtils;
import com.noithatchatluong.utils.HibernateUtils;

public class Test {
	public static void main(String[] args) throws SQLException {
/*		//String hash = "$2y$12$.ek2xSYRLMqFnCh85fTtoePsHyMI70HQJgj8ad1pR3ev/6psi9qH6";
		//System.out.println(BCryptUtils.checkPassword("123123", hash));
		boolean test = BCryptUtils.checkPassword("123123", "$2a$12$it8eHRuumeMamlopC/BzYui4vDyGYKRO6edPVxqaTG5QRQs3hRUvq");
		
		System.out.println(test);*/
		
/*		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		String sql = "select hoaDon from " + HoaDon.class.getName() + " hoaDon ";
		Query<HoaDon> query = session.createQuery(sql, HoaDon.class);
		
		List<HoaDon> listHoaDon = query.getResultList();
		
		for(HoaDon hoaDon: listHoaDon) {
			System.out.println(hoaDon.getTrangThai());
			Set<ChiTietHoaDon> chiTietHoaDon = hoaDon.getChiTietHoaDon();
			for(ChiTietHoaDon ctdh : chiTietHoaDon) {
				System.out.println(ctdh.getSanPham().getTenSanPham());
			}
		}
		
		session.getTransaction().commit();*/
		
		
		KhachHangDAO khd = new KhachHangDAO();
		KhachHang kh = khd.getKhachHangByEmail("123asd@gmail.com");
		System.out.println(kh.getHoTen());
		/*com.noithatchatluong.model.KhachHang kh = khd.getKhachHangByEmail("123asd@gmail.com");
		System.out.println(kh.getHoTen());*/
		
		
	}
}
