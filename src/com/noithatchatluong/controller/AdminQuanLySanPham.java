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
            switch (action) {
            case "/new":
                //showNewForm(request, response);
                break;
            case "/insert":
                //insertBook(request, response);
                break;
            case "/adminquanlysanpham/delete":
            {
            	System.out.println("delete");
                deleteSP(request, response);
                break;
            }
            case "/edit":
                //showEditForm(request, response);
                break;
            case "/update":
                //updateBook(request, response);
                break;
            default:
            {
            	System.out.println("đã vào");
                listSP(request, response);
                break;
            }
                
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
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
        	System.out.println(sp.getMaHinhAnh());
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
        SanPham sanPham = new SanPham(id);
        //sanPhamDAO.deleteSP(sanPham);
        response.sendRedirect("/WEB-INF/templates/admin_quanlysanpham.jsp");
 
    }
	
	
}
