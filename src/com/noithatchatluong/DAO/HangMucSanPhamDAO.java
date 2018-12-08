package com.noithatchatluong.DAO;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.noithatchatluong.entities.HangMucSanPham;
import com.noithatchatluong.utils.HibernateUtils;

public class HangMucSanPhamDAO {
	private static SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

	public List<HangMucSanPham> layHangMucSanPham() {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "select hangMuc from " + HangMucSanPham.class.getName() + " hangMuc ";

			Query<HangMucSanPham> queryHangMucSanPham = session.createQuery(sql, HangMucSanPham.class);

			List<HangMucSanPham> listHangMucSanPham = queryHangMucSanPham.getResultList();
			for (HangMucSanPham hangMucSanPham : listHangMucSanPham) {
				Hibernate.initialize(hangMucSanPham.getListHangMucCon());
			}
			session.getTransaction().commit();
			return listHangMucSanPham;

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			session.getTransaction().rollback();
		}

		return null;

	}

	/*
	 * public static List<HangMucSanPham> layHangMucSanPham() {
	 * 
	 * Session session = sessionFactory.getCurrentSession(); try {
	 * session.getTransaction().begin(); String sql = "select hangMuc from " +
	 * HangMucSanPham.class.getName() + " hangMuc";
	 * 
	 * Query<HangMucSanPham> query = session.createQuery(sql, HangMucSanPham.class);
	 * 
	 * List<HangMucSanPham> listHangMucSanPham = query.getResultList();
	 * //Hibernate.initialize(listHangMucSanPham); for(HangMucSanPham hangMucSanPham
	 * : listHangMucSanPham) { Hibernate.initialize(hangMucSanPham.getSanPham()); }
	 * session.close(); return listHangMucSanPham; } catch (Exception ex) {
	 * session.getTransaction().rollback(); System.out.println(ex.getMessage());
	 * return null; } }
	 */

}
