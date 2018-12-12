package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.SanPham;

/**
 * Servlet implementation class DeleteAdminQuanLySanPham
 */
@WebServlet("/DeleteAdminQuanLySanPham")
public class DeleteAdminQuanLySanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SanPhamDAO sanPhamDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAdminQuanLySanPham() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sanPhamDAO = new SanPhamDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
    
//        try {
//			sanPhamDAO.deleteSP1(id);
//			 response.sendRedirect("/WebBanHangNoiThat/adminquanlysanpham");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
       
 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
