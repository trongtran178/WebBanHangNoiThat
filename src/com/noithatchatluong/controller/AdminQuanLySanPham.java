package com.noithatchatluong.controller;

import java.io.IOException;
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
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/admin_quanlysanpham.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private void listSP(HttpServletRequest request, HttpServletResponse response)
	{
		List<SanPham>listSP=(list)sanPhamDAO.loadData();
		
	}

}
