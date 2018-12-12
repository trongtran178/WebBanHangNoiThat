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
import com.noithatchatluong.utils.PaginationResult;

@WebServlet("/adminvietbaidangtin")
public class AdminVietBaiDangTin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SAVE_DIRECTORY = "static/hinhdaidientintuc";

	public AdminVietBaiDangTin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("admin") == null) {
			response.sendRedirect("adminlogin");
		} else {
			TinTucDAO tinTucDAO = new TinTucDAO();
			int page = 1;
			String pageParameter = request.getParameter("page");
			if (pageParameter != null) {
				page = Integer.parseInt(pageParameter);
			}
			String tieuDe = null;
			final int maxResult = 10;
			final int maxNavigationPage = 10;
			PaginationResult<TinTuc> paginationTinTuc = tinTucDAO.layTatCaTinTuc(page, maxResult, maxNavigationPage,
					tieuDe);
			request.setAttribute("paginationTinTuc", paginationTinTuc);
			System.out.println(request.getServletContext().getRealPath(""));
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/templates/admin_vietbai_dangtin2.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
