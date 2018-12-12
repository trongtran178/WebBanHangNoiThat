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
<!-- Left Sidebar - style you can find in sidebar.scss  -->
<!-- ============================================================== -->
<aside class="left-sidebar" data-sidebarbg="skin5">
	<!-- Sidebar scroll-->
	<div class="scroll-sidebar">
		<!-- Sidebar navigation-->
		<nav class="sidebar-nav">
			<ul id="sidebarnav">
				<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminthongke"
					 aria-expanded="false"> <i class="mdi mdi-av-timer"></i> <span class="hide-menu">Thống
							kê</span>
					</a></li>
				<c:if test="${admin.getQuyenHan() ne 'ModQLBV' }">
					<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminquanlysanpham"
						 aria-expanded="false"> <i class="mdi mdi-account-network"></i> <span class="hide-menu">Sản
								phẩm</span>
						</a></li>
				</c:if>

				<c:if test="${admin.getQuyenHan() ne 'ModQLBV' }">
					<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminquanlydonhang"
						 aria-expanded="false"> <i class="mdi mdi-arrange-bring-forward"></i> <span class="hide-menu">Hóa
								đơn</span>
						</a></li>
				</c:if>
				<c:if test="${admin.getQuyenHan() ne 'ModQLSP' }">
					<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminvietbaidangtin"
						 aria-expanded="false"> <i class="mdi mdi-border-none"></i> <span class="hide-menu">Tin
								tức</span>
						</a></li>
				</c:if>

				<c:if test="${admin.getQuyenHan() eq 'Admin' }">
					<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminquanlymod"
						 aria-expanded="false"> <i class="mdi mdi-face"></i> <span class="hide-menu">Moderator</span>
						</a></li>
				</c:if>
				<c:if test="${admin.getQuyenHan() ne 'ModQLBV' }">
					<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminquanlykhachhang"
						 aria-expanded="false"> <i class="mdi mdi-file"></i> <span class="hide-menu">Khách
								hàng</span>
						</a></li>
				</c:if>


				<li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="adminlogout"
					 aria-expanded="false"> <i class="mdi mdi-alert-outline"></i> <span class="hide-menu">Đăng
							xuất</span>
					</a></li>
			</ul>
		</nav>
		<!-- End Sidebar navigation -->
	</div>
	<!-- End Sidebar scroll-->
</aside>
<!-- ============================================================== -->
<!-- End Left Sidebar - style you can find in sidebar.scss  -->
<!-- ============================================================== -->