package com.noithatchatluong.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/getStatisticsOfProductsSold")
public class GetStatisticsOfProductsSold extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, List<Integer>> data = new HashMap<String, List<Integer>>();
		
		List<Integer> soLuongSanPhamNoiNhap = new ArrayList<Integer>();
		List<Integer> soLuongSanPhamNgoaiNhap = new ArrayList<Integer>();
		soLuongSanPhamNoiNhap.add(50);soLuongSanPhamNoiNhap.add(54);
		soLuongSanPhamNoiNhap.add(52);soLuongSanPhamNoiNhap.add(39);
		soLuongSanPhamNoiNhap.add(60);soLuongSanPhamNoiNhap.add(85);
		soLuongSanPhamNoiNhap.add(50);soLuongSanPhamNoiNhap.add(44);
		soLuongSanPhamNoiNhap.add(45);soLuongSanPhamNoiNhap.add(66);
		soLuongSanPhamNoiNhap.add(50);soLuongSanPhamNoiNhap.add(52);
		
		
		soLuongSanPhamNgoaiNhap.add(60);soLuongSanPhamNgoaiNhap.add(43);
		soLuongSanPhamNgoaiNhap.add(45);soLuongSanPhamNgoaiNhap.add(54);
		soLuongSanPhamNgoaiNhap.add(63);soLuongSanPhamNgoaiNhap.add(46);
		soLuongSanPhamNgoaiNhap.add(54);soLuongSanPhamNgoaiNhap.add(75);
		soLuongSanPhamNgoaiNhap.add(44);soLuongSanPhamNgoaiNhap.add(46);
		soLuongSanPhamNgoaiNhap.add(61);soLuongSanPhamNgoaiNhap.add(65);
		
		data.put("sanPhamNoiNhap", soLuongSanPhamNoiNhap);
		data.put("sanPhamNgoaiNhap", soLuongSanPhamNgoaiNhap);
		
		Gson gson = new Gson();

		String output = gson.toJson(data);
		
		System.out.println(output);
		
		PrintWriter out = response.getWriter();
		
		out.print(output);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
