package com.noithatchatluong.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noithatchatluong.jdbc.DAO.SanPhamDAO;
import com.noithatchatluong.model.HangMuc;
import com.noithatchatluong.model.HinhAnh;
import com.noithatchatluong.model.SanPham;
import com.noithatchatluong.utils.UploadFileUtils;

/**
 * Servlet implementation class UpdateSP
 */
@WebServlet("/UpdateSP")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class UpdateSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
     SanPhamDAO sanPhamDAO;
     UploadFileUtils uploadFileUtils;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
    		System.out.println(id);
    		sanPhamDAO =new SanPhamDAO();
    		SanPham sanPham=sanPhamDAO.getSanPhambyID(id);
    	
    		HinhAnh hinhAnh=sanPhamDAO.getHinhAnhbyID(sanPham.getHinhAnh());
    		
    		request.setAttribute("sanpham", sanPham);
    		request.setAttribute("hinhanh", hinhAnh);
    	
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/templates/updateSP.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sanPhamDAO=new SanPhamDAO();
		
		
	
		
	
		
	
		

			
		 
		     int id=Integer.parseInt(request.getParameter("masanpham"));
		     System.out.println(id);
		     String mahinhanh=request.getParameter("mahinhanh");
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
	        String maHinhAnh="hinh"+id;
	        int soluongdaban=Integer.parseInt(request.getParameter("soluongdaban"));
	        Date ngaynhap = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	        int danghoatdong=Integer.parseInt(request.getParameter("danghoatdong")); 
	        
	        javax.servlet.http.Part part = request.getPart("hinhcha");
	        uploadFileUtils = new UploadFileUtils();
	        String hinhcha="",hinhcon1="",hinhcon2="",hinhcon3="";
	        
	        if(uploadFileUtils.uploadFile(part, request))
	        {
	        	try {
	    			
	    			
	    			
		        	hinhcha=uploadFileUtils.getFileName();
		        	HinhAnh ha=new HinhAnh( hinhcha, hinhcha,mahinhanh);
		        	sanPhamDAO.Updateha(ha);
		        	System.out.println(hinhcha);
		        	System.out.println(maHinhAnh);
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	        	
	        	
	        }else
	        {
	        	System.out.println("k ddc roi");
	        }
	        
	     
	        SanPham sp=new SanPham(mahangmuc, tensanpham, dongia, mota, khuyenmai, cao, dai, rong, chatlieu, xuatxu, mausac, soluongdaban, danghoatdong, id);
	        sanPhamDAO=new SanPhamDAO();
	 
	        try {
				if(sanPhamDAO.UpdateSP(sp))
				{
					System.out.println("Khong sadsjas");

					response.sendRedirect("adminquanlysanpham");
				} else {
					System.out.println("Khong sua duojc");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        	
	       
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
