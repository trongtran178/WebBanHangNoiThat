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
import com.noithatchatluong.model.SanPham;

@WebServlet("/adminquanlysanpham")
public class AdminQuanLySanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SanPhamDAO sanPhamDAO;
       
    public AdminQuanLySanPham() {
        super();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String action = request.getServletPath();
    	System.out.println(action);
    	
    	
    	try {
			listSP(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void listSP(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

		sanPhamDAO = new SanPhamDAO();
		
        List<SanPham> listSP =sanPhamDAO.getSanPham();
        		
        
        for(SanPham sp : listSP) {
        	System.out.println(sp.getHinhAnh());
        }
        request.setAttribute("listSP", listSP);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/templates/admin_quanlysanpham.jsp");
        dispatcher.forward(request, response);
    }
	private void deleteSP(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
		sanPhamDAO = new SanPhamDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        sanPhamDAO.DeleteSP(id);
        response.sendRedirect("/WEB-INF/templates/admin_quanlysanpham.jsp");
     }
	private void updateSP(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
		sanPhamDAO =new SanPhamDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        SanPham sanpham=sanPhamDAO.getSanPhambyID(id);
        request.setAttribute("id", id);
        response.sendRedirect("/WEB-INF/templates/admin_quanlysanpham.jsp");
     }
	
	
	
}
