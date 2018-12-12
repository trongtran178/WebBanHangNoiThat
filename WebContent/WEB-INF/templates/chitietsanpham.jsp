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
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Store Template</title>
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
	<link href="static/chitietsanpham/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<script src="static/chitietsanpham/js/jquery.min.js"></script>

	<link href="static/chitietsanpham/css/style.css" rel="stylesheet" type="text/css" media="all" />
	<script src="static/chitietsanpham/js/imagezoom.js"></script>
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
	<!-- Google Map -->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="static/js/google_map.js"></script>
	<!-- Main -->
	<script src="static/js/main.js"></script>

</head>

<body>
	<div class="colorlib-loader"></div>

	<div id="page">
		<jsp:include page="_menu.jsp"></jsp:include>
		<aside id="colorlib-hero" class="breadcrumbs">
			<div class="flexslider">
				<ul class="slides">
					<li style="background-image: url(static/images/cover-img-1.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
									<div class="slider-text-inner text-center">
										<h1>Chi tiết sản phẩm</h1>
										<h2 class="bread">
											<span> <a href="index.html">Home</a>
											</span> <span> <a href="shop.html">Sản phẩm</a>
											</span> <span>Chi tiết sản phẩm</span>
										</h2>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>



		<!-- Bat Dau -->
		<div class="product">
			<div class="container">

				<div class="product-price1">
					<div class="top-sing">
						<div class="col-md-7 single-top">
							<div class="flexslider">
								<ul class="slides">
									<c:if test="${not empty sanPham.getDanhSachHinhAnh()}">
										<c:forEach items="${sanPham.getDanhSachHinhAnh()}" var="hinhAnh">
											<c:if test="${not empty sanPham.getDanhSachHinhAnh().get(0)}">
												<li data-thumb="static/images/productimages/<c:out value='${hinhAnh}'/>">
													<div class="thumb-image">
														<img src="static/images/productimages/<c:out value='${hinhAnh}'/>" data-imagezoom="true" class="img-responsive">
													</div>
												</li>
											</c:if>
										</c:forEach>
									</c:if>

								</ul>
							</div>

							<div class="clearfix"></div>
							<!-- slide -->


							<!-- FlexSlider -->
							<script defer src="static/chitietsanpham/js/jquery.flexslider.js"></script>
							<link rel="stylesheet" href="static/chitietsanpham/css/flexslider.css" type="text/css" media="screen" />

							<script>
								// Can also be used with $(document).ready()
								$(window).load(function () {
									$('.flexslider').flexslider({
										animation: "slide",
										controlNav: "thumbnails"
									});
								});
							</script>

						</div>

						<div class="col-md-5 single-top-in simpleCart_shelfItem">
							<div class="single-para ">
								<h4>
									<c:out value='${sanPham.getTenSanPham()}' />
								</h4>
								<div class="star-on">
									<div class="clearfix"></div>
								</div>

								<h5 class="item_price">
									<c:out value='${sanPham.getDonGia()}' />
									đ
								</h5>
								<p>
									Chất liệu:
									<c:out value='${sanPham.getChatLieu()}' />
								</p>
								<p class="khuyenmai">
									Khuyến mãi:
									<c:out value='${sanPham.getKhuyenMai()}' />
								</p>
								<p>
									Kích thước:
									<c:out value='${sanPham.getCao()}' />
									x
									<c:out value='${sanPham.getDai()}' />
									x
									<c:out value='${sanPham.getRong()}' />
									(mét)
								</p>
								<p>
									Xuất xứ:
									<c:out value='${sanPham.getXuatXu()}' />
								</p>
								<div class="available">
									<ul>
										<p>
											Màu sắc:
											<c:out value='${sanPham.getMauSac()}' />
										</p>
										<!-- <li>Màu sắc <select>
												<option>Trắng</option>
												<option>Đen</option>
												<option>Màu gỗ tự nhiên</option>
										</select>
										</li> -->
										<div class="clearfix"></div>
									</ul>
								</div>
								<a href="addtocart?maSanPham=${sanPham.getMaSanPhamMaHoa()}" class="add-cart item_add">Thêm vào giỏ hàng</a>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>

				<div class="clearfix"></div>
			</div>
		</div>

		<div class="container">
			<div class="motasanpham">
				<h2>Mô tả</h2>
				<hr />
				<p>
					<c:out value='${sanPham.getMoTa()}' />
				</p>
				<hr />
			</div>
		</div>
		<!-- Ket Thuc -->

		<!-- Start Comment -->


		<div class="container">
			<div class="motasanpham">
				<h2>Bình luận</h2>
				<hr>
				<div id = "binhLuan">
				<c:if test="${not empty danhSachBinhLuan}">
					<c:forEach items="${danhSachBinhLuan}" var="binhLuan">
						<p>
							<form>				
									<div class="row form-group">
										<div class="col-md-12">
											<label for="${binhLuan.getMaBinhLuan()}">${binhLuan.getEmail()}</label>
											<input style="font-size: 15px;" type = "text"  name="${binhLuan.getMaBinhLuan()}" id="${binhLuan.getMaBinhLuan()}"  class="form-control" value = "${binhLuan.getNoiDung()}" readonly>
											<p style="font-size: 12px;">(${binhLuan.getThoiGian()})</p>
										</div>
									</div>
									
								</form>
						</p>
					</c:forEach>
					<hr />
				</c:if>
			</div>
			</div>
		</div>

		<div class="col-md-10 col-md-offset-1">
			<div class="contact-wrap">
				<form action="product-detail" method="POST">

					<c:choose>
						<c:when test="${empty email}">
							<div class="row form-group">
								<div class="col-md-12">
									<label for="email">Email</label> <input type="text" id="email" name="email" class="form-control" placeholder="Nhập địa chỉ email của bạn hoặc đăng nhập">
								</div>
							</div>
						</c:when>
						<c:otherwise>
							<input type="hidden" id="email" name="email" class="form-control" value="${email}">
						</c:otherwise>
					</c:choose>
					<input type="hidden" id="maSanPham" name="maSanPham" class="form-control" value="${sanPham.getMaSanPham()}">
					<input type="hidden" id="maSanPhamMaHoa" name="maSanPhamMaHoa" class="form-control" value="${sanPham.getMaSanPhamMaHoa()}">

					<div class="row form-group">
						<div class="col-md-12">
							<label for="message">Bình luận</label>
							<textarea name="message" id="message" cols="30" rows="10" class="form-control" placeholder="Nhập bình luận của bạn..."></textarea>
						</div>
					</div>
					<div class="form-group text-center">
						<input type="submit" value="Bình luận" class="btn btn-primary">
					</div>
				</form>
			</div>
		</div>
		<!-- End Comment -->

		<div class="colorlib-shop">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
						<h2>
							<span>Sản phẩm liên quan</span>
						</h2>
						<p>Có thể bạn cũng muốn xem những sản phẩm này.</p>
					</div>
				</div>



				<div class="row">

					<c:if test="${not empty danhSachSanPhamLienQuan}">
						<c:forEach items="${danhSachSanPhamLienQuan}" var="sanPham">
							<div class="col-md-3 text-center">
								<div class="product-entry">
									<div class="product-img" style="background-image: url(static/images/productimages/${sanPham.getDanhSachHinhAnh().get(0)});">
										<p class="tag">
											<span class="new">New</span>
										</p>
										<div class="cart">
											<p>
												<span class="addtocart"> <a href="addtocart?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
														<i class="icon-shopping-cart"></i>
													</a>
												</span> <span> <a href="product-detail?maSanPham=${sanPham.getMaSanPhamMaHoa()}">
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


				</div>
			</div>
		</div>
	</div>


	<!--  -->

	<div id="map" class="colorlib-map"></div>

	<jsp:include page="_footer.jsp"></jsp:include>
	</div>


	<div class="gototop js-top">
		<a href="#" class="js-gotop"> <i class="icon-arrow-up2"></i>
		</a>
	</div>



</body>

</html>