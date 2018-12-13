<%@page import="com.noithatchatluong.model.HinhAnh"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.noithatchatluong.jdbc.DAO.SanPhamDAO"%>
<%@page import="com.noithatchatluong.model.SanPham"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="UpdateSP" method="POST" enctype = "multipart/form-data" >
            <h1>Update Product</h1>
            <table>
                <tr>
                    <td>Mã sản phẩm</td>
                    <td><input type="hidden"  name="masanpham" style="width: 270px;height:25px;" value="${sanpham.getId()}"></td>
                </tr>
                <tr>
                    <td>Mã hinh</td>
                    <td><input type="hidden"  name="mahinhanh" style="width: 270px;height:25px;" value="${sanpham.getHinhAnh()}"></td>
                </tr>
                <tr>
                    <td>Hạng mục</td>
                    <td><select style="width: 270px;height:25px;" name="mahangmuc">
                    	<c:forEach var="hangmuc" items="${listhangmuc}">
						<option value="<c:out value="${sanpham.getMaHangMuc()}" />"><c:out value="${hangmuc.getTenHangMuc()}" /></option>
						</c:forEach>
				        </select>
				    </td>
                </tr>
                <tr>
                    <td>Tên sản phẩm</td>
                    <td><input type="text" name="tensanpham"style="width: 270px;height:25px;" value="${sanpham.getTenSanPham()}"></td>
                </tr>
                <tr>
                    <td>Đơn giá</td>
                    <td><input type="text" name="dongia"style="width: 270px;height:25px;" value="${sanpham.getDonGia()}"></td>
                </tr>
                <tr>
                    <td>Mô tả</td>
                    <td><input type="text" name="mota"style="width: 270px;height:25px;" value="${sanpham.getMoTa()}"></td>
                </tr>
                <tr>
                    <td>Khuyến mãi</td>
                    <td><input type="text" name="khuyenmai"style="width: 270px;height:25px;" value="${sanpham.getKhuyenMai()}"></td>
                </tr>
                <tr>
                    <td>Cao</td>
                    <td><input type="text" name="cao"style="width: 270px;height:25px;" value="${sanpham.getCao()}"></td>
                </tr>
                <tr>
                    <td>Rộng</td>
                    <td><input type="text" name="rong"style="width: 270px;height:25px;" value="${sanpham.getRong()}"></td>
                </tr>
                <tr>
                    <td>Dài</td>
                    <td><input type="text" name="dai"style="width: 270px;height:25px;" value="${sanpham.getDai()}"></td>
                </tr>
                <tr>
                    <td>Chất liệu</td>
                    <td><input type="text" name="chatlieu"style="width: 270px;height:25px;" value="${sanpham.getChatLieu()}"></td>
                </tr>
                <tr>
                    <td>Xuất xứ</td>
                    <td><input type="text" name="xuatxu"style="width: 270px;height:25px;" value="${sanpham.getXuatXu()}"></td>
                </tr>
                <tr>
                    <td>Màu sắc</td>
                    <td><input type="text" name="mausac"style="width: 270px;height:25px;" value="${sanpham.getMauSac()}"></td>
                </tr>
                <tr>
                    <td>Hình cha</td>
                    <td><input type="file" name="hinhcha"style="width: 270px;height:25px;" ><img src="static/images/${hinhanh.getHinhCha()}" width="100dp" height="100dp"></td>
                </tr>
                <tr>

                <tr>
                    <td>Số lượng đã bán</td>
                    <td><input type="text" name="soluongdaban"style="width: 270px;height:25px;" value="${sanpham.getSoLuongDaBan()}"></td>
                </tr>
                
            	<tr>
                    <td>Đang hoạt động</td>
                    <td><input type="text" name="danghoatdong"style="width: 270px;height:25px;" value="${sanpham.getDangHoatDong()}"></td>
                </tr>    
                <tr>
                

                    <td colspan="2" align="right">
                        <button type="submit" name="update">Update</button>
                        <button type="reset" name="reset">Reset</button>
                    </td>
                </tr>
                </table>
        </form>
</body>
</html>