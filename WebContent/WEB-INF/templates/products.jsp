<%@ page language="java" contentType="text/html; charset=UTF-8 "
	pageEncoding="UTF-8"%>
<!-- Khai báo sử dụng JSTL Core Tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.noithatchatluong.DAO.*"%>
<%@ page import="com.noithatchatluong.model.*"%>
<%@ page import="com.noithatchatluong.entities.*"%>
<%@ page import="com.noithatchatluong.controller.ProductsController" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Sản phẩm của chúng tôi</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700"
	rel="stylesheet">
<script src="static/js/jquery-3.1.1.js	"></script>
<!-- Animate.css -->
<link rel="stylesheet" href="static/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="static/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="static/css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="static/css/magnific-popup.css">

<!-- Flexslider  -->
<link rel="stylesheet" href="static/css/flexslider.css">

<!-- Owl Carousel -->
<link rel="stylesheet" href="static/css/owl.carousel.min.css">
<link rel="stylesheet" href="static/css/owl.theme.default.min.css">

<!-- Date Picker -->
<link rel="stylesheet" href="static/css/bootstrap-datepicker.css">
<!-- Flaticons  -->
<link rel="stylesheet" href="static/fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
<link rel="stylesheet" href="static/css/style.css">

<!-- Modernizr JS -->
<script src="static/js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<style>
.panel-heading a:after {
	font-family: "icomoon";
	content: "\e994";
	position: absolute;
	right: -5px;
	font-size: 11px;
	font-weight: 400;
	top: 50%;
	line-height: 1;
	margin-top: -8px;
}

.panel-heading a {
	padding: 10px 0;
	display: block;
	width: 100%;
	font-size: 15px;
	text-transform: uppercase;
	background: transparent;
	color: #FFC300;
	position: relative;
	-webkit-box-shadow: none !important;
	-moz-box-shadow: none !important;
	-ms-box-shadow: none !important;
	-o-box-shadow: none !important;
	box-shadow: none !important;
}

.panel-body ul li {
	font-size: 14px;
	margin-bottom: 7px;
}

.sidebar .colorlib-form-2 .form-group .form-field .form-control {
	padding-right: 30px;
}
</style>
</head>
<body>
	<div class="colorlib-loader"></div>

	<div id="page">
		<jsp:include page="_menu.jsp"></jsp:include>
		<aside id="colorlib-hero" class="breadcrumbs">
			<div class="flexslider">
				<ul class="slides">
					<li style="background-image: url(static/images/cover-img-2.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div
									class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
									<div class="slider-text-inner text-center">
										<h1>Sản phẩm</h1>
										<h2 class="bread">
											<span><a href="index.html">Home</a></span> <span>Sản
												phẩm</span>
										</h2>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>
		<div class="colorlib-shop">
		
		
			<div class="container">
				<div class="row">
					<div class="col-md-10 col-md-push-2">
						<div class="row row-pb-lg">
						<c:forEach items="${paginationResultThongTinSanPham.getList()}" var = "thongTinSanPham">
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img"
											style="background-image: url(static/images/${thongTinSanPham.hinhDaiDien});">
											<p class="tag">
												<span class="new">New</span>
											</p>
											<div class="cart">
												<p>
													<span class="addtocart">
														<a href="cart.html">
															<i class="icon-shopping-cart"></i>
														</a>
													</span> 
													<span>
														<a href="product-detail?maSanPham=${thongTinSanPham.maSanPham}">
															<i class="icon-eye"></i>
														</a>
													</span>
												</p>
											</div>
										</div>
										<div class="desc">
											<h3>
												<a href="product-detail.html">${thongTinSanPham.tenSanPham}</a>
											</h3>
											<p class="price">
												<span>${thongTinSanPham.donGia}</span>
											</p>
										</div>
									</div>
								</div>
									</c:forEach>
						</div>
						<c:if test="${paginationResultThongTinSanPham.totalPages > 1}">
							<div class="row">
								<div class="col-md-12">
									<ul class="pagination">
									<c:forEach items = "${paginationResultThongTinSanPham.navigationPages }" var = "page">
										<c:if test="${page != -1}">
											<li><a href = "products?page=${page}">${page}</a></li>
										</c:if>
										<c:if test="${page == -1}">
											<span>...</span>
										</c:if>
									</c:forEach>
										<!-- <li class="disabled"><a href="#">&laquo;</a></li>
										<li class="active"><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">&raquo;</a></li> -->
									</ul>
								</div>
							</div>
						</c:if>


					</div>
					<div class="col-md-2 col-md-pull-10">
						<div class="sidebar">
							<div class="side">
								<h2>Hạng mục sản phẩm</h2>
							<%-- 	<c:forEach items = "${requestScope.listHangMucSanPham }" var = "hangMucSanPham"> --%>
								<div class="fancy-collapse-panel">
									<div class="panel-group" id="accordion" role="tablist"
										aria-multiselectable="true">
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingOne">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne" aria-expanded="true"
														aria-controls="collapseOne">Bàn </a>
												</h4>
											</div>
											<div id="collapseOne" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingOne">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 1}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>

										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingTwo">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse"
														data-parent="#accordion" href="#collapseTwo"
														aria-expanded="false" aria-controls="collapseTwo">Ghế
													</a>
												</h4>
											</div>
											<div id="collapseTwo" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingTwo">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 2}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>	
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingThree">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse"
														data-parent="#accordion" href="#collapseThree"
														aria-expanded="false" aria-controls="collapseThree">NỆM & GIƯỜNG NGỦ</a>
												</h4>
											</div>
											<div id="collapseThree" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingThree">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 3}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingFour">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse"
														data-parent="#accordion" href="#collapseFour"
														aria-expanded="false" aria-controls="collapseFour">Đồ
														trang trí </a>
												</h4>
											</div>
											<div id="collapseFour" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingFour">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 4}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingFive">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse"
														data-parent="#accordion" href="#collapseFive"
														aria-expanded="false" aria-controls="collapseFive">Dụng
														cụ nhà bếp </a>
												</h4>
											</div>
											<div id="collapseFive" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingFive">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 5}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingSix">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse"
														data-parent="#accordion" href="#collapseSix"
														aria-expanded="false" aria-controls="collapseSix">Nội
														thất bếp </a>
												</h4>
											</div>
											<div id="collapseSix" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingSix">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 6}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingSeven">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse"
														data-parent="#accordion" href="#collapseSeven"
														aria-expanded="false" aria-controls="collapseSeven">Tủ
														quần áo & Tiện ích phòng ngủ </a>
												</h4>
											</div>
											<div id="collapseSeven" class="panel-collapse collapse"
												role="tabpanel" aria-labelledby="headingSeven">
												<div class="panel-body">
													<c:forEach items="${requestScope.listHangMucSanPham }"
														var="hangMucSanPham">
														<c:if test="${hangMucSanPham.IDHangMuc == 7}">
															<ul>
																<c:forEach items="${hangMucSanPham.listHangMucCon}"
																	var="hangMucConBan">
																	<li><a href="products?tenHangMuc=${hangMucConBan.tenHangMuc}">${hangMucConBan.tenHangMuc}</a></li>
																</c:forEach>
															</ul>
														</c:if>
													</c:forEach>
												</div>
											</div>
										</div>

									</div>
								</div>
								<%-- </c:forEach> --%>
							</div>
							<div class="side">
								<h2>Phạm vị giá tiền</h2>
								<form method="post" class="colorlib-form-2">
									<div class="row">
										<div class="col-md-12">
											<div class="form-group">
												<label for="guests">Giá từ:</label>
												<div class="form-field">
													<i class="icon icon-arrow-down3"></i> 
													<select name="people"
														id="giaTu" class="form-control">
														<option value="100000">100.000</option>
														<option value="200000">200.000</option>
														<option value="50000">500.000</option>
														<option value="1000000">1.000.000</option>
														<option value="200000">2.000.000</option>
													</select>
												</div>
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<label for="guests">Đến:</label>
												<div class="form-field">
													<i class="icon icon-arrow-down3"></i> 
													<select name="people"
														id="giaDen" class="form-control">
														<option value="3000000">3.000.000</option>
														<option value="5000000">5.000.000</option>
														<option value="10000000">10.000.000</option>
														<option value="15000000">15.000.000</option>
														<option value="20000000">20.000.000</option>
													</select>
												</div>
											</div>
										</div>
										<div class = col-md-12>				
											<a href = "#" class = "btn btn-primary" id = "locSanPhamTheoGia">Lọc giá</a>
											<a href = "products" class = "btn btn-primary">Mặc định</a>
										</div>
									</div>
								</form>
							</div>
							<div class="side">
								<h2>Màu sắc</h2>
								<div class="color-wrap">
									<p class="color-desc">
										<%-- <a href="products?page=<%=request.getParameter("page")%>&mauSac=Đen" class="color color-1"></a> 							
										<a href="products?page=<%=request.getParameter("page")%>&mauSac=Nâu" class="color color-2"></a>  --%>
									<%-- 	<c:if test="<%=request.getParameter("page") != null %>">
											<a href="products?p.age=${page}" class="color color-3"></a>
											<a href="products?page=${page}" class="color color-4"></a> 
											<a href="products?page=${page}" class="color color-5"></a>											
										</c:if> --%>
										<c:choose>
											<c:when test="${not empty param.page}">
												<a href="products?mauSac=Đen" class="color color-1"></a>
												<a href="products?mauSac=Nâu" class="color color-2"></a>
												<a href="products?mauSac=Xanh biển" class="color color-3"></a>
												<a href="products?mauSac=Xám" class="color color-4"></a>
												<a href="products?mauSac=Đỏ" class="color color-5"></a>
												<a href="products?mauSac=Vàng" class="color color-6"></a>
												<a href="products" class = "btn btn-primary">Mặc định</a>
												
												
												
												<%-- <a href="products?page=<%=request.getParameter("page")%>&mauSac=Nâu" class="color color-4"></a> 
												<a href="products?page=<%=request.getParameter("page")%>&mauSac=Tím" class="color color-5"></a>														
												<a href="products?page=${page}" class="color color-4"></a> 
												<a href="products?page=${page}" class="color color-5"></a>	 --%>										
											</c:when>
											<c:when test="${empty param.page }">
												<a href="products?mauSac=Đen" class="color color-1"></a>
												<a href="products?mauSac=Nâu" class="color color-2"></a>
												<a href="products?mauSac=Xanh biển" class="color color-3"></a>
												<a href="products?mauSac=Xám" class="color color-4"></a>
												<a href="products?mauSac=Đỏ" class="color color-5"></a>
												<a href="products?mauSac=Vàng" class="color color-6"></a>
												<a href="products" class = "btn btn-primary">Mặc định</a>
												
												<%-- <a href="products?mauSac=Nâu" class="color color-4"></a> 
												<a href="mauSac=Tím" class="color color-5"></a>														
												<a href="products?page=${page}" class="color color-4"></a> 
												<a href="products?page=${page}" class="color color-5"></a>	 --%>											
											</c:when>
										</c:choose>
										
										
										<%-- <a href="products?page=${page}" class="color color-3"></a>
										<a href="products?page=${page}" class="color color-4"></a> 
										<a href="products?page=${page}" class="color color-5"></a> --%>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			
	
			
		</div>

		<!-- <div id="map" class="colorlib-map"></div> -->

		<jsp:include page="_footer.jsp"></jsp:include>
	</div>


	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript"
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
	<!-- jQuery -->
	<script src="static/js/jquery.min.js"></script>
	>
	<!-- jQuery Easing -->
	<script src="static/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="static/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="static/js/jquery.waypoints.min.js"></script>
	<!-- Flexslider -->
	<script src="static/js/jquery.flexslider-min.js"></script>
	<!-- Owl carousel -->
	<script src="static/js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="static/js/jquery.magnific-popup.min.js"></script>
	<script src="static/js/magnific-popup-options.js"></script>
	<!-- Date Picker -->
	<script src="static/js/bootstrap-datepicker.js"></script>
	<!-- <script src="static/js/jquery-3.1.1.js	"></script> -->
	<!-- Stellar Parallax -->
	<script src="static/js/jquery.stellar.min.js"></script>
	<script src="static/js/jquery.validate.min.js"></script>
	<script src="static/js/jquery.validate.js"></script>

	<!-- 	<script src="static/js/additional-methods.js"></script>
	<script src="static/js/additional-methods.min.js"></script> -->

	<!-- Google Map -->
	<!-- <script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="static/js/google_map.js"></script> -->
	<!-- Main -->
	<script src="static/js/main.js"></script>
	
	<script>
		
	</script>
	
	<script>
		
		document.getElementById("locSanPhamTheoGia").onclick = function() {
			var giaTu = document.getElementById("giaTu").value;
			var giaDen = document.getElementById("giaDen").value;
			if(giaTu === null && giaDen === null) 
				return;		
			document.getElementById("locSanPhamTheoGia").href = "products?giaTu=" + giaTu + "&giaDen=" + giaDen;
			
		}
		
	
		/* function locSanPhamTheoGia() {
			var giaTu = document.getElementById("giaTu").value;
			var giaDen = document.getElementById("giaDen").value;
			if(giaTu !== null && giaDen !== null) {
				refreshPage();
			}
		}
		
		function refreshPage() {
			var giaTu = document.getElementById("giaTu").value;
			var giaDen = document.getElementById("giaDen").value;
			setTimeout(refreshPage, 1000);
			$.get('products?giaTu=' + giaTu + '&giaDen=' + giaDen, function(data) {
					
			});
		} */
		
		
	</script>
</body>
</html>