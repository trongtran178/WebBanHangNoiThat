package com.noithatchatluong.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.noithatchatluong.entities.TinTuc;
import com.noithatchatluong.model.ThongTinSanPham;
import com.noithatchatluong.utils.HibernateUtils;
import com.noithatchatluong.utils.PaginationResult;

public class TinTucDAO {

	private static SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
	
	public int getMaxID(Session session) {
		try {
			String sql = "select max(c.ID) from " + TinTuc.class.getName() + " c ";
			Query<Integer> queryMaxID = session.createQuery(sql, Integer.class);
			
			Integer value = (Integer) queryMaxID.getSingleResult();
			System.out.println(value + " layTugetmaxID");
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
	
	public TinTuc timTinTuc(String maTinTuc) { 
		
		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "select tinTuc from " + TinTuc.class.getName()
					 + " tinTuc where tinTuc.maTinTuc = :maTinTuc";
			Query<TinTuc> queryTinTuc = session.createQuery(sql, TinTuc.class);
			
			queryTinTuc.setParameter("maTinTuc", maTinTuc);
			
			TinTuc tinTuc = queryTinTuc.getSingleResult();
			System.out.println(session.contains(tinTuc) + " trng ham tim");
			session.getTransaction().commit();
			return tinTuc;
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			session.getTransaction().rollback();
			return null;
		}
	}
	
	
	public List<TinTuc> layTatCaTinTuc(String tieuDe) {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "select tinTuc from " + TinTuc.class.getName() 
					+ " tinTuc "
					+ " where :tieuDe is null OR lower(tinTuc.tieuDe) like :tieuDe "
					+ " order by tinTuc.ngayTao desc ";
					
			Query<TinTuc> queryTinTuc = session.createQuery(sql, TinTuc.class);
			if(tieuDe != null) {
				//queryThongTinSanPham.setParameter("mauSac",  "%" + mauSac.toLowerCase() + "%");
				queryTinTuc.setParameter("tieuDe", "%" + tieuDe.toLowerCase() + "%");

			}
			queryTinTuc.setParameter("tieuDe", tieuDe);
			List<TinTuc> listTinTuc = queryTinTuc.getResultList();

			session.getTransaction().commit();

			return listTinTuc;

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			session.getTransaction().rollback();
			return null;

		}
	}
	
	public PaginationResult<TinTuc> layTatCaTinTuc(int page, int maxResult, int maxNavigationPage,
			String tieuDe) {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "select tinTuc from " + TinTuc.class.getName() + " tinTuc "
					+ " where :tieuDe is null OR lower(tinTuc.tieuDe) like :tieuDe " + " order by tinTuc.ngayTao desc ";

			Query<TinTuc> queryTinTuc = session.createQuery(sql, TinTuc.class);
			if(tieuDe != null) {
				queryTinTuc.setParameter("tieuDe", "%" + tieuDe.toLowerCase() + "%");
			}
			queryTinTuc.setParameter("tieuDe", tieuDe);
			PaginationResult<TinTuc> paginationTinTuc = new PaginationResult<TinTuc>(queryTinTuc, page, maxResult, maxNavigationPage);
			
			session.close();
			return paginationTinTuc;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			session.getTransaction().rollback();
			return null;
		}
	}
	
	public PaginationResult<TinTuc> layTatCaTinTuc(int page, int maxResult, int maxNavigationPage) {
		return layTatCaTinTuc(page, maxResult, maxNavigationPage, null);
	}

	public boolean themTinTuc(TinTuc tinTuc) {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			
			Integer IDTinTuc = getMaxID(session) + 1;
			System.out.println(IDTinTuc);
			tinTuc.setID(IDTinTuc);
			tinTuc.setMaTinTuc("TT" + Integer.toString(IDTinTuc));
			
			session.persist(tinTuc);
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
	}

	public boolean capNhatTinTuc(TinTuc tinTuc) {

		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(tinTuc);
			session.flush();
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
	}

	public boolean xoaTinTuc(String maTinTuc) {
		
		
		TinTuc tinTuc = timTinTuc(maTinTuc);
		//System.out.println(session.contains(tinTuc));
		System.out.println(tinTuc.getNoiDung());
		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			System.out.println(session.contains(tinTuc));
			session.delete(tinTuc);
			session.flush();
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
	}

}
