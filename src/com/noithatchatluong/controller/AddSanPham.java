package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.HangMuc;

/**
 * Servlet implementation class AddSanPham
 */
@WebServlet("/AddSanPham")
public class AddSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SanPhamDAO sanPhamDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSanPham() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/templates/AddSanPham.jsp");
        try {
//        	SanPhamDAO spDao = new SanPhamDAO();
//        	int res = spDao.MaxMa();
//        	System.out.println(res);
//        	request.setAttribute("maxMa", res);
			getMaxId(request, response);
			getListHangMuc(request, response);
        	dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maSanPham=request.getParameter("masanpham");
		doGet(request, response);
		
	}
	private void getMaxId(HttpServletRequest request, HttpServletResponse response) throws SQLException
	{
		sanPhamDAO = new SanPhamDAO();
		//int id=sanPhamDAO.MaxMa();
		//request.setAttribute("MaxMa", id);
		//System.out.println(id);
		 
	}
	private void getListHangMuc(HttpServletRequest request, HttpServletResponse response) throws SQLException
	{
		sanPhamDAO = new SanPhamDAO();
		//List<HangMuc> listhangmuc =sanPhamDAO.getDanhSachHangMuc();
		//request.setAttribute("listhangmuc", listhangmuc);
		
	}
	

}
