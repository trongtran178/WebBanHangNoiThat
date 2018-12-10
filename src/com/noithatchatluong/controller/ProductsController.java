package com.noithatchatluong.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.DAO.HangMucSanPhamDAO;
import com.noithatchatluong.DAO.SanPhamDAO;
import com.noithatchatluong.entities.HangMucSanPham;
import com.noithatchatluong.model.ThongTinSanPham;
import com.noithatchatluong.utils.AESUtils;
import com.noithatchatluong.utils.PaginationResult;

@WebServlet(urlPatterns = "/products")
public class ProductsController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		SanPhamDAO sanPhamDAO = new SanPhamDAO();
		HangMucSanPhamDAO hangMucSanPhamDAO = new HangMucSanPhamDAO();
		final int maxResult = 6;
		final int maxNavigationPage = 10;
		
		int page = 1;//default page
		double giaTu = -1, giaDen = -1; //gia mac dinh query!
		String mauSac = null;
		String tenHangMuc = null;
		
		//Session session = 
		String pageParameter = request.getParameter("page");
		String giaTuParameter = request.getParameter("giaTu");
		System.out.println(giaTuParameter);
		String giaDenParameter = request.getParameter("giaDen");
		System.out.println(giaDenParameter);
		String mauSacParameter = (String) request.getParameter("mauSac");
		System.out.println(mauSacParameter);
		
		String tenHangMucParameter = (String) request.getParameter("tenHangMuc");
		if(tenHangMucParameter != null) {
			tenHangMuc = tenHangMucParameter;
		}
		
		
		if(giaTuParameter != null && giaDenParameter != null) {
			giaTu = Double.parseDouble(giaTuParameter);
			giaDen = Double.parseDouble(giaDenParameter);
		}
		if(pageParameter != null) {
			page = Integer.parseInt(pageParameter);
		}
		if(mauSacParameter != null) {
			mauSac = mauSacParameter;
		}
		
		PaginationResult<ThongTinSanPham> paginationResultThongTinSanPham = sanPhamDAO.layTatCaThongTinSanPham(page, maxResult, maxNavigationPage, giaTu, giaDen, mauSac, tenHangMuc);
		
		for(ThongTinSanPham thongTinSanPham : paginationResultThongTinSanPham.getList()) {
			thongTinSanPham.setMaSanPham(URLEncoder.encode(AESUtils.encrypt(thongTinSanPham.getMaSanPham()),"UTF-8"));
		}
		
		request.setAttribute("paginationResultThongTinSanPham", paginationResultThongTinSanPham);

		// gửi list query hạng mục sản phẩm
		List<HangMucSanPham> listHangMucSanPham = hangMucSanPhamDAO.layHangMucSanPham();
		
		request.setAttribute("listHangMucSanPham", listHangMucSanPham);
		
		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/products.jsp");
		
		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
