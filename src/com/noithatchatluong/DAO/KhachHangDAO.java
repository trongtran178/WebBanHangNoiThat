package com.noithatchatluong.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.noithatchatluong.entities.KhachHang;
import com.noithatchatluong.utils.HibernateUtils;

public class KhachHangDAO {

	private static SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

	public int getMaxID(Session session) {
		try {
			String sql = "select max(c.ID) from " + KhachHang.class.getName() + " c ";
			Query<Integer> query = session.createQuery(sql, Integer.class);
			
			Integer value = (Integer) query.getSingleResult();
			if (value == null) {
				return -1;
			}
			return value;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return -1;
		}
	}

	public KhachHang timKhachHangBoiMaKhachHang(String maKhachHang) {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "select k from " + KhachHang.class.getName()
					+ " k where k.maKhachHang= :maKhachHang ";

			Query<KhachHang> query = session.createQuery(sql, KhachHang.class);
			query.setParameter("maKhachHang", maKhachHang);

			KhachHang khachHang = query.getSingleResult();
			session.getTransaction().commit();
			return khachHang;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
		return null;
	}

	public boolean capNhatThongTinKhachHang(KhachHang khachHang) {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			khachHang.setDaDangKy(true);
			khachHang.setDangHoatDong(true);
			// update(..) chỉ áp dụng cho đối tượng Detached.
			// (Không dùng được với đối tượng Transient).
			// Sử dụng update(khachHang) để đưa khachHang trở lại trạng thái Persistent.
			session.update(khachHang);
			// Chủ động đẩy dữ liệu xuống DB.
			// Câu lệnh update sẽ được gọi.
			session.flush();
			session.getTransaction().commit();
			return true;
 
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
	}

	public boolean themKhachHang(KhachHang khachHang) {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			int IDKhachHang = getMaxID(session) + 1;
			Integer.toString(IDKhachHang);
			khachHang.setMaKhachHang("KH0" + Integer.toString(IDKhachHang));
			khachHang.setID(IDKhachHang);

			session.persist(khachHang);
			
			session.getTransaction().commit();
			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
	}
	
	public boolean kiemTraEmailTonTai(String emailCheck) {
		boolean check;
		Session session = sessionFactory.getCurrentSession();

		try {
			session.getTransaction().begin();
			String sql = "Select count(*) from " + KhachHang.class.getName() + " khachHang "
					+ " where khachHang.email = :email ";
			Query<Long> query = session.createQuery(sql, Long.class);
			query.setParameter("email", emailCheck);

			Long count = query.getSingleResult();
			if (count != 0)
				check = false;
			else
				check = true;
			session.getTransaction().commit();

			return check;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			check = false;
			return check;
		}

	}
	

}
/*
 * You are use sessionFactory.getCurrentSession(), So you no need to flush and
 * close session. It automatically flush and close when transaction end.
 * 
 * --more
 * 
 * getCurrentSession
 * 
 * When you call SessionFactory. getCurrentSession, it will provide you session
 * object which is in hibernate context and managed by hibernate internally. It
 * is bound to transaction scope. When you call SessionFactory.
 * getCurrentSession , it creates a new Session if not exists , else use same
 * session which is in current hibernate context.
 * 
 * openSession
 * 
 * When you call SessionFactory.openSession, it always create new Session object
 * afresh and give it to you. You need to explicitly flush and close these
 * session objects. As session objects are not thread safe, you need to create
 * one session object per request in multithreaded environment and one session
 * per request in web applications too.
 * 
 * If you are using hibernate in single threaded environment , you can use
 * getCurrentSession
 */