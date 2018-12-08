	package com.noithatchatluong.DAO;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.noithatchatluong.entities.HangMucSanPham;
import com.noithatchatluong.entities.HinhAnh;
import com.noithatchatluong.entities.SanPham;
import com.noithatchatluong.model.ThongTinSanPham;
import com.noithatchatluong.utils.HibernateUtils;
import com.noithatchatluong.utils.PaginationResult;

public class SanPhamDAO {

	private static SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

	public SanPham timSanPhamBoiMaSanPham(String maSanPham) {

		return null;
	}

	public List<SanPham> layTatCaSanPham() {

		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.getTransaction().begin();
			Query<SanPham> query = session.createQuery("from SanPham order by date(NgayNhap) desc", SanPham.class);
			List<SanPham> listSanPham = query.getResultList();
			session.flush();
			return listSanPham;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
		return null;
	}

	// Tra ve 1 danh sach duong dan theo san pham tuong ung!
	public List<HinhAnh> layDuongDanSanPham(String maHinh) {
		Session session = sessionFactory.getCurrentSession();
		try {
			String sql = "select h from " + HinhAnh.class.getName() + " h " + " where h.maHinh =:maHinh";
			Query<HinhAnh> queryHinhAnh = session.createQuery(sql, HinhAnh.class);
			queryHinhAnh.setParameter("maHinh", maHinh);
			List<HinhAnh> duongDanDanhSachHinhAnh = queryHinhAnh.getResultList();
			return duongDanDanhSachHinhAnh;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return null;
		}
	}

	// Lấy thông tin sản phẩm, dùng để hiện sản phẩm với những thuộc tính cần thiết
	// lên trang xem sản phẩm
	public List<ThongTinSanPham> layTatCaThongTinSanPham() {
		Session session = sessionFactory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "select new " + ThongTinSanPham.class.getName() 
					+ "(sanPham.id, " 
					+ "sanPham.maSanPham, "
					+ "sanPham.tenSanPham, " 
					+ "sanPham.donGia, " 
					+ "sanPham.mauSac, " 
					+ "sanPham.cao, "
					+ "sanPham.dai, " 
					+ "sanPham.rong, " 
					+ "sanPham.hangMucSanPham, " 
					+ "sanPham.maHinhAnh)" 
					+ " from " + SanPham.class.getName() + " sanPham " + " order by sanPham.ngayNhap desc";
			SanPhamDAO sanphamDAO = new SanPhamDAO();
			Query<ThongTinSanPham> query = session.createQuery(sql, ThongTinSanPham.class);
			List<ThongTinSanPham> listThongTinSanPham = query.getResultList();
			for (ThongTinSanPham thongtinSanPham : listThongTinSanPham) {
				List<HinhAnh> listHinhAnh = sanphamDAO.layDuongDanSanPham(thongtinSanPham.getHinhDaiDien());
				thongtinSanPham.setHinhDaiDien(listHinhAnh.get(0).getHinhCha());
				thongtinSanPham.setHinhAnh(listHinhAnh);
			}
			session.getTransaction().commit();
			return listThongTinSanPham;
		} catch (Exception ex) {
			session.getTransaction().rollback();
			System.out.println(ex.getMessage());
		}
		return null;
	}

	//Lấy kết quả phân trang sản phẩm
	public PaginationResult<ThongTinSanPham> layTatCaThongTinSanPham(int page, int maxResult, int maxNavigationPage,
			double giaTu, double giaDen, String mauSac) {
		Session session = sessionFactory.getCurrentSession();
		try {
			SanPhamDAO sanphamDAO = new SanPhamDAO();
			session.getTransaction().begin();
		String sql = "select new " + ThongTinSanPham.class.getName() + 
				"(sanPham.id, " 
				+ "sanPham.maSanPham, "
				+ "sanPham.tenSanPham, " 
				+ "sanPham.donGia, " 
				+ "sanPham.mauSac, " 
				+ "sanPham.cao, " 
				+ "sanPham.dai, "
				+ "sanPham.rong, " 
				+ "sanPham.hangMucSanPham, " 
				+ "sanPham.maHinhAnh)" + " from "
				+ SanPham.class.getName() + " sanPham "
				+ "";
		if (giaTu != -1 && giaDen != -1) {
			sql += " where sanPham.donGia between :giaTu AND :giaDen ";
			if (mauSac != null) {
				sql += " and lower(sanPham.mauSac) like :mauSac";
				System.out.println(mauSac);

			}
			
		} else if (mauSac != null) {
			sql += " where lower(sanPham.mauSac) LIKE :mauSac ";
			System.out.println(mauSac);
		}
		sql += " order by sanPham.ngayNhap desc ";

	
		
		Query<ThongTinSanPham> queryThongTinSanPham = session.createQuery(sql, ThongTinSanPham.class);
		if (giaTu != -1 && giaDen != -1) {
			queryThongTinSanPham.setParameter("giaTu", giaTu);
			System.out.println(giaTu);
			System.out.println(giaDen);
			queryThongTinSanPham.setParameter("giaDen", giaDen);
			if(mauSac != null) {
				queryThongTinSanPham.setParameter("mauSac",  "%" + mauSac.toLowerCase() + "%");

			}
		}
		else if (mauSac != null) {
			queryThongTinSanPham.setParameter("mauSac", "%" + mauSac.toLowerCase() + "%");
		}
		//session.getTransaction().commit();
		PaginationResult<ThongTinSanPham> paginationThongTinSanPham = new PaginationResult<>(queryThongTinSanPham, page, maxResult, maxNavigationPage);
		for(ThongTinSanPham thongTinSanPham : paginationThongTinSanPham.getList()) {
			List<HinhAnh> listHinhAnh = sanphamDAO.layDuongDanSanPham(thongTinSanPham.getHinhDaiDien());
			thongTinSanPham.setHinhDaiDien(listHinhAnh.get(0).getHinhCha());
			thongTinSanPham.setHinhAnh(listHinhAnh);
		}
		
		//session.flush();
		//session.getTransaction().commit();
		session.close();
		return paginationThongTinSanPham;
		
		//return new PaginationResult<ThongTinSanPham>(queryThongTinSanPham, page, maxResult, maxNavigationPage);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			session.getTransaction().rollback();
			
		}
		return null;
	}

	
	//Lấy kết quả phân trang sản phẩm
	public PaginationResult<ThongTinSanPham> layTatCaThongTinSanPham(int page, int maxResult, int maxNavigationPage,
			double giaTu, double giaDen, String mauSac, String tenHangMuc) {
		Session session = sessionFactory.getCurrentSession();
		try {
			SanPhamDAO sanPhamDAO = new SanPhamDAO();
			session.getTransaction().begin();
		String sql = "select new " + ThongTinSanPham.class.getName() + 
				"(sanPham.id, " 
				+ "sanPham.maSanPham, "
				+ "sanPham.tenSanPham, " 
				+ "sanPham.donGia, " 
				+ "sanPham.mauSac, " 
				+ "sanPham.cao, " 
				+ "sanPham.dai, "
				+ "sanPham.rong, " 
				+ "sanPham.hangMucSanPham, " 
				+ "sanPham.maHinhAnh)" + " from "
				+ SanPham.class.getName() + " sanPham "
				+ " where (:mauSac is null OR sanPham.mauSac like :mauSac) "
				+ " and (:tenHangMuc is null OR sanPham.hangMucSanPham.tenHangMuc like :tenHangMuc)";
		if(giaTu != -1 && giaDen != -1) {
			sql += " and (sanPham.donGia between :giaTu AND :giaDen) ";

		}
		sql += " order by sanPham.ngayNhap desc ";

		Query<ThongTinSanPham> queryThongTinSanPham = session.createQuery(sql, ThongTinSanPham.class);
		if(mauSac != null)
			queryThongTinSanPham.setParameter("mauSac", "%" + mauSac.toLowerCase() + "%");
		else 
			queryThongTinSanPham.setParameter("mauSac", mauSac);
		if(tenHangMuc != null)	
			queryThongTinSanPham.setParameter("tenHangMuc", "%" + tenHangMuc.toLowerCase() + "%");
		else 
			queryThongTinSanPham.setParameter("tenHangMuc", tenHangMuc);
		if(giaTu != -1 && giaDen != -1) {
			queryThongTinSanPham.setParameter("giaTu", giaTu);
			queryThongTinSanPham.setParameter("giaDen", giaDen);
		}
		//System.out.println(queryThongTinSanPham.getQueryString());
		
		PaginationResult<ThongTinSanPham> paginationThongTinSanPham = new PaginationResult<>(queryThongTinSanPham, page, maxResult, maxNavigationPage);
		for(ThongTinSanPham thongTinSanPham : paginationThongTinSanPham.getList()) {
			List<HinhAnh> listHinhAnh = sanPhamDAO.layDuongDanSanPham(thongTinSanPham.getHinhDaiDien());
			thongTinSanPham.setHinhDaiDien(listHinhAnh.get(0).getHinhCha());
			thongTinSanPham.setHinhAnh(listHinhAnh);
		}
		
		session.close();
		return paginationThongTinSanPham;

			
	
		
		//return new PaginationResult<ThongTinSanPham>(queryThongTinSanPham, page, maxResult, maxNavigationPage);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			session.getTransaction().rollback();
			
		}
		return null;
	}
	public PaginationResult<ThongTinSanPham> queryProducts(int page, int maxResult, int maxNavigationPage) {
		return layTatCaThongTinSanPham(page, maxResult, maxNavigationPage, -1, -1, null);
	}

	public boolean themSanPham(SanPham sanPham) {

		return false;

	}

	public boolean xoaSanPham(String maSanPham) {
		return false;

	}

	public boolean suaThongTinSanPham(SanPham sanPham) {
		return false;
	}

}
