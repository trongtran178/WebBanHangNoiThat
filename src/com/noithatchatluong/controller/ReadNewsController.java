package com.noithatchatluong.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.DAO.TinTucDAO;
import com.noithatchatluong.entities.TinTuc;

@WebServlet(urlPatterns = "/readnews")
public class ReadNewsController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String maTinTuc = request.getParameter("maTinTuc");
		System.out.println(maTinTuc);
		if(maTinTuc.isEmpty()) {
			
		}
		TinTucDAO tinTucDAO = new TinTucDAO();
		TinTuc tinTuc = tinTucDAO.timTinTuc(maTinTuc);
		List<TinTuc> listTinTuc = tinTucDAO.layTatCaTinTuc(null);
		
		if(listTinTuc.size() >= 4) {
			for(int i = 4; i < listTinTuc.size(); i++) {
				listTinTuc.remove(i);
				i--;
			}
		}
		
		request.setAttribute("tinTuc", tinTuc);
		request.setAttribute("listTinTuc", listTinTuc);
		
		for(TinTuc tinTuct : listTinTuc) {
			System.out.println(tinTuct.getTieuDe());
		}
		
		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/readnews.jsp");

		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
