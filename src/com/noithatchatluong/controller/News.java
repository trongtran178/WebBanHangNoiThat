package com.noithatchatluong.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;

import com.noithatchatluong.DAO.TinTucDAO;
import com.noithatchatluong.entities.TinTuc;
import com.noithatchatluong.utils.PaginationResult;

@WebServlet("/News")
public class News extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public News() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TinTucDAO tinTucDAO = new TinTucDAO();
		int page = 1;
		String pageParameter = request.getParameter("page");
		if(pageParameter != null)
			page = Integer.parseInt(pageParameter);
		String tieuDe = null;
		final int maxResult = 10;
		final int maxNavigationPage = 10;
		PaginationResult<TinTuc> paginationTinTuc = tinTucDAO.layTatCaTinTuc(page, maxResult , maxNavigationPage, tieuDe);
		request.setAttribute("paginationTinTuc", paginationTinTuc);
		
		for(TinTuc tinTuc : paginationTinTuc.getList()) {
			tinTuc.setNoiDung(Jsoup.parse(tinTuc.getNoiDung()).text());
		}
		
		List<TinTuc> listTinTuc = tinTucDAO.layTatCaTinTuc(null);
		
		
		
		if(listTinTuc.size() >= 4) {
			for(int i = 4; i < listTinTuc.size(); i++) {
				listTinTuc.remove(i);
				i--;
			}
		}
		for(TinTuc tinTuc : listTinTuc) {
			System.out.println(tinTuc.getNoiDung());
			System.out.println();			System.out.println();
			System.out.println();

			tinTuc.setNoiDung(Jsoup.parse(tinTuc.getNoiDung()).text());
			System.out.println(tinTuc.getNoiDung());
		}
		
		request.setAttribute("listTinTucMoi", listTinTuc);
		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/tintuc.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

