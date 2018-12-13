package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Convert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.HangMuc;
import com.noithatchatluong.model.HinhAnh;
import com.noithatchatluong.model.SanPham;
import com.noithatchatluong.utils.UploadFileUtils;

/**
 * Servlet implementation class AddSanPham
 */
@WebServlet("/AddSanPham")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class AddSanPham extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SanPhamDAO sanPhamDAO;
    UploadFileUtils uploadFileUtils;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSanPham() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        
        try {
        	
        		
//        	SanPhamDAO spDao = new SanPhamDAO();
//        	int res = spDao.MaxMa();
//        	System.out.println(res);
//        	request.setAttribute("maxMa", res);
			getMaxId(request, response);
			getListHangMuc(request, response);
        	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/templates/AddSanPham.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		sanPhamDAO=new SanPhamDAO();
				
		 int idHinhAnh;
		
		 
		 
		 int id=Integer.parseInt(request.getParameter("masanpham"));	
	        String mahangmuc=request.getParameter("mahangmuc");
	        String masanpham ="SP"+ request.getParameter("masanpham");
	        String tensanpham=request.getParameter("tensanpham");
	        double dongia=Double.parseDouble(request.getParameter("dongia"));
	        String mota=request.getParameter("mota");
	        Double khuyenmai=Double.parseDouble(request.getParameter("khuyenmai"));
	        Float cao= Float.valueOf(request.getParameter("cao"));
	        Float dai= Float.valueOf(request.getParameter("dai"));
	        Float rong= Float.valueOf(request.getParameter("rong"));
	        String chatlieu=request.getParameter("chatlieu");
	        String xuatxu=request.getParameter("xuatxu");
	        String mausac=request.getParameter("mausac");
	        
	        int soluongdaban=Integer.parseInt(request.getParameter("soluongdaban"));
	        Date ngaynhap = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	        int danghoatdong=Integer.parseInt(request.getParameter("danghoatdong")); 
	        
	        String maHinhAnh="hinh"+id;
	        
	        //System.out.println(request.getParameter("masanpham"));
	        javax.servlet.http.Part part = request.getPart("hinhcha"),part2=request.getPart("hinhcon1"),part3=request.getPart("hinhcon2"),part4=request.getPart("hinhcon3");
	        
	        uploadFileUtils = new UploadFileUtils();
	        String hinhcha="",hinhcon1="",hinhcon2="",hinhcon3="";
	        
	        if(uploadFileUtils.uploadFile(part, request))
	        {
	        	hinhcha=uploadFileUtils.getFileName();
	        }
	        if(uploadFileUtils.uploadFile(part2, request))
	        {
	        	hinhcon1=uploadFileUtils.getFileName();
	        }
	        if(uploadFileUtils.uploadFile(part3, request))
	        {
	        	hinhcon2=uploadFileUtils.getFileName();
	        }
	        if(uploadFileUtils.uploadFile(part4, request))
	        {
	        	hinhcon3=uploadFileUtils.getFileName();
	        }
	        System.out.println(hinhcha);
	        System.out.println(hinhcon1);
	        System.out.println(hinhcon2);
	        System.out.println(hinhcon3);
	        
	        SanPham sanPham=new SanPham(id, mahangmuc, tensanpham, dongia, mota, khuyenmai, cao, dai, rong, chatlieu, xuatxu, mausac, maHinhAnh, soluongdaban, ngaynhap, danghoatdong);
			
			//HinhAnh hinhAnh4=new HinhAnh(idHinhAnh, maHinhAnh, hinhcha, hinhcon4);
	        
	        sanPhamDAO= new SanPhamDAO();
	        
	    
	        try {
	        	if(sanPhamDAO.AddSP(sanPham))
	        	{
	        		
	        		sanPhamDAO=new SanPhamDAO();
	    	        try {
	    	        	
	    				idHinhAnh = sanPhamDAO.GetMaxIDHinhAnh();
	    				HinhAnh hinhAnh1=new HinhAnh(idHinhAnh, maHinhAnh, hinhcha, hinhcon1);
	    				sanPhamDAO.Addha(hinhAnh1);
	    				
	    				idHinhAnh = sanPhamDAO.GetMaxIDHinhAnh();
	    				HinhAnh hinhAnh2=new HinhAnh(idHinhAnh, maHinhAnh, hinhcha, hinhcon2);
	    				sanPhamDAO.Addha(hinhAnh2);
	    				
	    				idHinhAnh = sanPhamDAO.GetMaxIDHinhAnh();
	    				HinhAnh hinhAnh3=new HinhAnh(idHinhAnh, maHinhAnh, hinhcha, hinhcon3);
	    				sanPhamDAO.Addha(hinhAnh3);
	    			} catch (SQLException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	        		response.sendRedirect("adminquanlysanpham");
	        	}	
//	        	
	        
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//doGet(request, response);
		
	}
	private void getMaxId(HttpServletRequest request, HttpServletResponse response) throws SQLException
	{
		sanPhamDAO = new SanPhamDAO();
		int id=sanPhamDAO.GetMaxID();
		request.setAttribute("MaxID", id);
		System.out.println(id);
		 
	}
	private void getListHangMuc(HttpServletRequest request, HttpServletResponse response) throws SQLException
	{
		sanPhamDAO = new SanPhamDAO();
		List<HangMuc> listhangmuc =sanPhamDAO.GetListHangMuc();
		request.setAttribute("listhangmuc", listhangmuc);
		
	}
	
	

}
