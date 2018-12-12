package com.noithatchatluong.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.noithatchatluong.DAO.TinTucDAO;
import com.noithatchatluong.entities.TinTuc;
import com.noithatchatluong.utils.UploadFileUtils;

@WebServlet("/addnews")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50) // 50MB
public class AddNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Làm ơn hãy sửa đường dẫn này
	public static final String SAVE_DIRECTORY = "G:\\webproejct\\WebBanHangNoiThat - Copy\\WebContent\\static\\hinhdaidientintuc";
	
	public AddNewsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/addnews.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TinTucDAO tinTucDAO = new TinTucDAO();
		String tieuDe = request.getParameter("tieuDe");
		String noiDung = request.getParameter("noiDung");
		Date ngayTao = new Date();
		
		TinTuc tinTuc = new TinTuc();
		
		tinTuc.setTieuDe(tieuDe);
		tinTuc.setNoiDung(noiDung);
		tinTuc.setNgayTao(ngayTao);
		ServletContext servletContext = request.getServletContext();
		System.out.println(servletContext.getContextPath());
		Part part = request.getPart("imageFile");
		UploadFileUtils uploadFileUtils = new UploadFileUtils();
		boolean checkSuccessfulUpload = uploadFileUtils.uploadFile(part, request);
		System.out.println(checkSuccessfulUpload);
		String fileName = uploadFileUtils.getFileName();
		System.out.println(fileName);
		tinTuc.setHinhDaiDien(fileName);
		System.out.println(tinTuc.getNoiDung());
		tinTucDAO.themTinTuc(tinTuc);
		
        response.sendRedirect(request.getContextPath() + "/	");
	}
}
