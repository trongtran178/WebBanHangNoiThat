package com.noithatchatluong.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
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

@WebServlet("/editnews")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class EditNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SAVE_DIRECTORY = "G:\\webproejct\\WebBanHangNoiThat - Copy\\WebContent\\static\\hinhdaidientintuc\\";

    public EditNewsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String maTinTuc = request.getParameter("maTinTuc");
		if (maTinTuc != null) {
			TinTucDAO tinTucDAO = new TinTucDAO();

			TinTuc tinTuc = tinTucDAO.timTinTuc(maTinTuc);
			request.setAttribute("tinTuc", tinTuc);
			
			
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/templates/editnews.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String imageSrc = request.getParameter("nameOfImageAvatar");
		System.out.println(request.getParameter("tieuDe"));
		System.out.println(imageSrc + " day la src image");
		
		String tieuDe = request.getParameter("tieuDe");
		String noiDung = request.getParameter("noiDung");
		
		System.out.println(request.getParameter("maTinTuc"));
		TinTucDAO tinTucDAO = new TinTucDAO();
		
		TinTuc tinTuc = tinTucDAO.timTinTuc(request.getParameter("maTinTuc"));
		tinTuc.setTieuDe(tieuDe);
		tinTuc.setNoiDung(noiDung);
		
		//Hình đại diện tin tức thay đổi
		if(!imageSrc.contains(tinTuc.getHinhDaiDien())) {
			Part part = request.getPart("imageFile");
			UploadFileUtils uploadFileUtils = new UploadFileUtils();
			boolean checkSuccessfulUpload = uploadFileUtils.uploadFile(part, request);
			System.out.println(checkSuccessfulUpload);
			String fileName = uploadFileUtils.getFileName();
			System.out.println(fileName);
			
			String tenHinhDaiDienCu = tinTuc.getHinhDaiDien();			
			File fileAnhCuCanXoa = new File(SAVE_DIRECTORY + tenHinhDaiDienCu);
			File fileAnhCuCanXoa2 = new File(request.getServletContext().getRealPath("") + "static\\hinhdaidientintuc\\" +  File.separator + tenHinhDaiDienCu);
			if(fileAnhCuCanXoa.delete())
				System.out.println("Hình cũ đã xóa");
			else
				System.out.println("Hình cũ chưa xóa được");
			if(fileAnhCuCanXoa2.delete())
				System.out.println("Hình cũ cũ đã xóa");
			else
				System.out.println("Hình cũ cũ chưa xóa được");			
			tinTuc.setHinhDaiDien(fileName);
			
		}
		tinTucDAO.capNhatTinTuc(tinTuc);
		response.sendRedirect(request.getContextPath() + "/adminvietbaidangtin");
		
		
		
		//kiem tra xem có thay đổi ảnh không ?
		//System.out.println(imageSrc.contains(tinTuc.getHinhDaiDien()) + "    ket qua la day !!!");
		
		/*File filetemp =  new File("G:/webproejct/WebBanHangNoiThat - Copy/WebContent/static/hinhdaidientintuc/1544372976141-temp.png");
		if(filetemp.delete()) {
			System.out.println(" da xoa file ");
		} else {
			System.out.println("chua xoa sc");
		}*/
		
		
	}

}
