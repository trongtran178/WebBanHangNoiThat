<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!-- Khai báo sử dụng JSTL Core Tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.noithatchatluong.DAO.*"%>
<%@ page import="com.noithatchatluong.model.*"%>
<%@ page import="com.noithatchatluong.entities.*"%>
<%@ page import="com.noithatchatluong.controller.ProductsController"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="javax.servlet.http.HttpServlet"%>

<!DOCTYPE html>
<nav class="colorlib-nav" role="navigation">
	<div class="top-menu">
		<div class="container">
			<div class="row">
				<div class="col-xs-2">
					<div id="colorlib-logo">
						<a href="index.html">NTCL</a>
					</div>
				</div>
				<div class="col-xs-10 text-right menu-1">
					<ul>
						<li class="active"><a href="home">Home</a></li>
						<li class="has-dropdown"><a href="products">Sản phẩm</a>
							<ul class="dropdown">
								<li><a href="chitietsanpham">Chi tiết sản phẩm</a></li>
								<li><a href="cart">Giỏ hàng</a></li>
								<li><a href="checkout.html">Checkout</a></li>
								<li><a href="order-complete.html">Order Complete</a></li>
								<li><a href="add-to-wishlist.html">Wishlist</a></li>
							</ul></li>
						<li><a href="News">Blog</a></li>
						<li><a href="AboutUs">Về chúng tôi</a></li>
						<li><a href="contact">Liên hệ</a></li>
						<li><a href="cart"><i class="icon-shopping-cart"></i>
								Cart [<c:choose>
							<c:when test="${empty sessionScope.order}">
								<c:out value="0" />
							</c:when>

							<c:otherwise>
								<c:out value="${sessionScope.order.getItems().size()}" />
							</c:otherwise>
						</c:choose>]</a></li>
						<c:choose>
							<c:when test="${empty sessionScope.email}">
								<li><a href="login">Đăng nhập</a></li>
								<li><a href="register">Đăng ký</a></li>
							</c:when>

							<c:otherwise>
								<li><a href="personalinformation">Tài khoản</a></li>
								<li><a href="logout">Đăng xuất</a></li>
							</c:otherwise>
						</c:choose>

					</ul>
				</div>
			</div>
		</div>
	</div>
</nav>