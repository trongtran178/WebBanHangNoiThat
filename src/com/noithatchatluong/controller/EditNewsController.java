package com.noithatchatluong.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editnews")
public class EditNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditNewsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/admin_vietbai_dangtin.jsp");
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/editnews.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
