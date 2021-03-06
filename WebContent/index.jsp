<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<html>
	<meta charset="UTF-8">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Trang chủ</title>
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

		<link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">

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
			<%-- <%@ include file="/WEB-INF/static/css/animate
 .css "%
><%@ include file="/WEB-INF/static/css/flexslider
 .css "%
><%@ include file="/WEB-INF/static/css/icomoon
 .css "%
>--%><%-- <%@ include file="/WEB-INF/static/css/bootstrap
 .css "%
>--%>
		</style>
		
		<script>
		window.location.href = "home";
		</script>
	</head>

	<body>
		<div class="colorlib-loader"></div>

		<div id="page">
			<jsp:include page="WEB-INF/templates/_menu.jsp"></jsp:include>
			<aside id="colorlib-hero">
				<div class="flexslider">
					<ul class="slides">
						<li style="background-image: url(static/images/slideimages/slide1.jpg);">
							<div class="overlay"></div>
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6 col-md-offset-3 col-md-pull-2 col-sm-12 col-xs-12 slider-text">
										<div class="slider-text-inner">
											<div class="desc">
												<h1 class="head-1">Nột thất</h1>
												<h2 class="head-2">Chất lượng</h2>
												<h2 class="head-3">Sang trọng</h2>
												<p class="category">
													<span>Nhiều sản phẩm mới &amp; giá cả hợp lý</span>
												</p>
												<p>
													<a href="#" class="btn btn-primary">Shop Collection</a>
												</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</li>
						<li style="background-image: url(static/images/slideimages/slide2.jpg);">
							<div class="overlay"></div>
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6 col-md-offset-3 col-md-pull-2 col-sm-12 col-xs-12 slider-text">
										<div class="slider-text-inner">
											<div class="desc">
												<h1 class="head-1">Đa dạng</h1>
												<h2 class="head-2">Khuyến mãi</h2>
												<h2 class="head-3">Giảm 15% hôm nay</h2>
												<p class="category">
													<span>Nột thất chất lượng &amp; nhiều mẫu mã</span>
												</p>
												<p>
													<a href="#" class="btn btn-primary">Shop Collection</a>
												</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</li>
						<li style="background-image: url(static/images/slideimages/slide3.jpg);">
							<div class="overlay"></div>
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 slider-text">
										<div class="slider-text-inner">
											<div class="desc">
												<h1 class="head-1">Nguồn gốc rõ ràng</h1>
												<h2 class="head-2">Hàng chính hiệu</h2>
												<h2 class="head-3">Bền - đẹp </h2>
												<p class="category">
													<span>Công ty uy tín &amp; có thâm niên</span>
												</p>
												<p>
													<a href="#" class="btn btn-primary">Shop Collection</a>
												</p>
											</div>
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
				<!--  -->
				<div class="row">
					<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
						<h2>
							<span>Hàng mới về</span>
						</h2>
					</div>
				</div>

				<div class="row">
					<c:if test="${not empty danhSachSanPhamMoi}">
						<c:forEach items="${danhSachSanPhamMoi}" var="sanPham">
							<div class="col-md-3 text-center">
								<div class="product-entry">
									<div class="product-img"
										style="background-image: url(static/images/productimages/${sanPham.getDanhSachHinhAnh().get(0)});">
										<p class="tag">
											<span class="new">New</span>
										</p>
										<div class="cart">
											<p>
												<span class="addtocart"> <a
													href="addtocart?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
														<i class="icon-shopping-cart"></i>
												</a>
												</span> <span> <a
													href="product-detail?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
														<i class="icon-eye"></i>
												</a>
												</span>
											</p>
										</div>
									</div>
									<div class="desc">
										<h3>
											<a href="product-detail.html">${sanPham.getTenSanPham()}</a>
										</h3>
										<p class="price">
											<span>${sanPham.getDonGia()}</span>
										</p>
									</div>
								</div>
							</div>
						</c:forEach>
					</c:if>

					<div class="row">
						<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
							<h2>
								<span>Hàng khuyến mãi</span>
							</h2>
						</div>
					</div>
					<div class="row">
						<c:if test="${not empty danhSachSanPhamKhuyenMai}">
							<c:forEach items="${danhSachSanPhamKhuyenMai}" var="sanPham">
								<div class="col-md-3 text-center">
									<div class="product-entry">
										<div class="product-img"
											style="background-image: url(static/images/productimages/${sanPham.getDanhSachHinhAnh().get(0)});">
											<p class="tag">
												<span class="new">New</span>
											</p>
											<div class="cart">
												<p>
													<span class="addtocart"> <a
														href="addtocart?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
															<i class="icon-shopping-cart"></i>
													</a>
													</span> <span> <a
														href="product-detail?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
															<i class="icon-eye"></i>
													</a>
													</span>
												</p>
											</div>
										</div>
										<div class="desc">
											<h3>
												<a href="product-detail?maSanPham=${sanPham.getMaSanPhamMaHoa()}">${sanPham.getTenSanPham()}</a>
											</h3>
											<p class="price">
												<span>${sanPham.getDonGia()}</span>
											</p>
										</div>
									</div>
								</div>
							</c:forEach>
						</c:if>

						<div class="row">
							<div
								class="col-md-6 col-md-offset-3 text-center colorlib-heading">
								<h2>
									<span>Bán chạy nhất</span>
								</h2>
							</div>
						</div>
						<c:if test="${not empty danhSachSanPhamBanChay}">
							<c:forEach items="${danhSachSanPhamBanChay}" var="sanPham">
								<div class="col-md-3 text-center">
									<div class="product-entry">
										<div class="product-img"
											style="background-image: url(static/images/productimages/${sanPham.getDanhSachHinhAnh().get(0)});">
											<p class="tag">
												<span class="new">New</span>
											</p>
											<div class="cart">
												<p>
													<span class="addtocart"> <a
														href="addtocart?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
															<i class="icon-shopping-cart"></i>
													</a>
													</span> <span> <a
														href="product-detail?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
															<i class="icon-eye"></i>
													</a>
													</span>
												</p>
											</div>
										</div>
										<div class="desc">
											<h3>
												<a href="product-detail.html">${sanPham.getTenSanPham()}</a>
											</h3>
											<p class="price">
												<span>${sanPham.getDonGia()}</span>
											</p>
										</div>
									</div>
								</div>
							</c:forEach>
						</c:if>

					</div>

					<!--  -->

				</div>
			<jsp:include page="WEB-INF/templates/_footer.jsp"></jsp:include>
		</div>

		<div class="gototop js-top">
			<a href="#" class="js-gotop">
				<i class="icon-arrow-up2"></i>
			</a>
		</div>

		<!-- jQuery -->
		<script src="static/js/jquery.min.js"></script>
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
		<!-- Stellar Parallax -->
		<script src="static/js/jquery.stellar.min.js"></script>
		<!-- Main -->
		<script src="static/js/main.js"></script>

	</body>

	</html>