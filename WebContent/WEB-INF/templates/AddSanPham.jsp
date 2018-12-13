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
		<form action="AddSanPham" method="POST" enctype = "multipart/form-data" >
            <h1>Insert New Product</h1>
            <table>
                <tr>
                    
                    <td><input type="hidden"  name="masanpham" value="${MaxID}"></td>
                </tr>
                <tr>
                    <td>Hạng mục</td>
                    <td><select style="width: 270px;height:25px;" name="mahangmuc">
                    	<c:forEach var="hangmuc" items="${listhangmuc}">
						<option value="<c:out value="${hangmuc.getiDHangMuc()}" />"><c:out value="${hangmuc.getTenHangMuc()}" /></option>
						</c:forEach>
				        </select>
				    </td>
                </tr>
                <tr>
                    <td>Tên sản phẩm</td>
                    <td><input type="text" name="tensanpham"style="width: 270px;height:25px;" value="sạ"></td>
                </tr>
                <tr>
                    <td>Đơn giá</td>
                    <td><input type="text" name="dongia"style="width: 270px;height:25px;" value="12"></td>
                </tr>
                <tr>
                    <td>Mô tả</td>
                    <td><input type="text" name="mota"style="width: 270px;height:25px;" value="sadjhd"></td>
                </tr>
                <tr>
                    <td>Khuyến mãi</td>
                    <td><input type="text" name="khuyenmai"style="width: 270px;height:25px;" value="12"></td>
                </tr>
                <tr>
                    <td>Cao</td>
                    <td><input type="text" name="cao"style="width: 270px;height:25px;" value="12"></td>
                </tr>
                <tr>
                    <td>Rộng</td>
                    <td><input type="text" name="rong"style="width: 270px;height:25px;" value="23"></td>
                </tr>
                <tr>
                    <td>Dài</td>
                    <td><input type="text" name="dai"style="width: 270px;height:25px;" value="12"></td>
                </tr>
                <tr>
                    <td>Chất liệu</td>
                    <td><input type="text" name="chatlieu"style="width: 270px;height:25px;" value="ádas"></td>
                </tr>
                <tr>
                    <td>Xuất xứ</td>
                    <td><input type="text" name="xuatxu"style="width: 270px;height:25px;" value="sds"></td>
                </tr>
                <tr>
                    <td>Màu sắc</td>
                    <td><input type="text" name="mausac"style="width: 270px;height:25px;" value="ứad"></td>
                </tr>
                <tr>
                    <td>Hình cha</td>
                    <td><input type="file" name="hinhcha" style="width: 270px;height:25px;"></td>
                </tr>
                <tr>
                    <td>Hình con 1</td>
                    <td><input type="file" name="hinhcon1" style="width: 270px;height:25px;"></td>
                </tr>
                <tr>
                    <td>Hình con 2</td>
                    <td><input type="file" name="hinhcon2" style="width: 270px;height:25px;"></td>
                </tr>
                <tr>
                    <td>Hình con 3</td>
                    <td><input type="file" name="hinhcon3"style="width: 270px;height:25px;"></td>
                </tr>
                <tr>
                    <td>Số lượng đã bán</td>
                    <td><input type="text" name="soluongdaban" value="21" style="width: 270px;height:25px;"></td>
                </tr>
                <tr>
                    <td>Ngày nhập</td>
                    <td><input type="date" name="ngaynhap" style="width: 270px;height:25px;" ></td>
                </tr>
            	<tr>
                    <td>Đang hoạt động</td>
                    <td><input type="text" name="danghoatdong" value="1"style="width: 270px;height:25px;"></td>
                </tr>    
                <tr>
                

                    <td colspan="2" align="right">
                        <button type="submit" name="insert">Insert</button>
                        <button type="reset" name="reset">Reset</button>
                    </td>
                </tr>
                </table>
        </form>
</body>
</html>