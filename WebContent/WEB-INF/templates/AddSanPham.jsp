<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="AddSanPham" method="POST">
            <h1>Insert New Product</h1>
            <table>
                <tr>
                    <td>Mã sản phẩm</td>
                    <td><input type="text" disabled name="masanpham" value="${MaxMa}"></td>
                </tr>
                <tr>
                    <td>Hạng mục</td>
                    <td><select style="width: 270px;height:25px;">
                    	<c:forEach var="hangmuc" items="${listhangmuc}">
						<option value="<c:out value="${hangmuc.getiDHangMuc()}" />name="mahangmuc""><c:out value="${hangmuc.getTenHangMuc()}" /></option>
						</c:forEach>
				        </select>
				    </td>
                </tr>
                <tr>
                    <td>Tên sản phẩm</td>
                    <td><input type="text" name="tensanpham"></td>
                </tr>
                <tr>
                    <td>Đơn giá</td>
                    <td><input type="text" name="dongia"></td>
                </tr>
                <tr>
                    <td>Mô tả</td>
                    <td><input type="text" name="mota"></td>
                </tr>
                <tr>
                    <td>Khuyến mãi</td>
                    <td><input type="text" name="Khuyenmai"></td>
                </tr>
                <tr>
                    <td>Cao</td>
                    <td><input type="text" name="cao"></td>
                </tr>
                <tr>
                    <td>Dài</td>
                    <td><input type="text" name="dai"></td>
                </tr>
                <tr>
                    <td>Chất liệu</td>
                    <td><input type="text" name="chatlieu"></td>
                </tr>
                <tr>
                    <td>Xuất xứ</td>
                    <td><input type="text" name="xuatxu"></td>
                </tr>
                <tr>
                    <td>Màu sắc</td>
                    <td><input type="text" name="mausac"></td>
                </tr>
                <tr>
                    <td>Hình ảnh</td>
                    <td><input type="file" name="hinhanh"></td>
                </tr>
                <tr>
                    <td>Số lượng đã bán</td>
                    <td><input type="text" name="soluongdaban"></td>
                </tr>
                <tr>
                    <td>Ngày nhập</td>
                    <td><input type="text" name="ngaynhap"></td>
                </tr>
            	<tr>
                    <td>Đang hoạt động</td>
                    <td><input type="text" name="danghoatdong"></td>
                </tr>    
                <tr>
                

                    <td colspan="2" align="right">
                        <button type="submit" name="insert">Insert</button>
                        <button type="reset" name="reset">Reset</button>
                    </td>
                </tr>
        </form>
</body>
</html>