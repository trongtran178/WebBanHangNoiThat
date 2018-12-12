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
	<title>Quên mật khẩu</title>
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
		#colorlib-hero {
		margin-bottom: 2em;
	}
    label.error {
        display: inline-block;
        color:red;
        width: 200px;
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
					<li style="background-image: url(static/images/cover-img-1.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
									<div class="slider-text-inner text-center">
										<h1>Thông báo reset password</h1>
										<h2 class="bread">
											<span><a href="index.html">Home</a></span> <span>Thông báo reset password</span>
										</h2>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>

		<div id="colorlib-contact">
			<div class="container">
				<div class="row">
					<div class="col-md-10 col-md-offset-1">
						<div class="contact-wrap">
							<c:choose>
								<c:when test="${not empty resetEmail}">
									<h3>Thông báo kiểm tra email</h3>
									<p>Để đảm bảo vấn đề bảo mật, một email xác nhận đã được gửi tới email ${resetEmail} của bạn.</p>
									<p>Vui lòng kiểm tra hộp thư email và click vào link đính kèm để đặt lại mật khẩu.</p>
									<p>Xin cám ơn!</p>
								</c:when>
								<c:otherwise>
									<h3>Email bạn đã nhập chưa được đăng ký!</h3>
									<h3><a href = "register">Đăng ký ngay!</a></h3>
								</c:otherwise>
							</c:choose>

						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="map" class="colorlib-map"></div>

		<jsp:include page="_footer.jsp"></jsp:include>
	</div>


	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>

	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
	<!-- jQuery -->
	<script src="static/js/jquery.min.js"></script>>
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
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="static/js/google_map.js"></script>
	<!-- Main -->
	<script src="static/js/main.js"></script>
</body>

</html>