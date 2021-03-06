<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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

<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700"
	rel="stylesheet">

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

</head>
<body>
	<div class="colorlib-loader"></div>

	<div id="page">
	<jsp:include page = "_menu.jsp"></jsp:include>
		<aside id="colorlib-hero" class="breadcrumbs">
			<div class="flexslider">
				<ul class="slides">
					<li style="background-image: url(static/images/cover-img-1.jpg);">
						<div class="overlay"></div>
						<div class="container-fluid">
							<div class="row">
								<div
									class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
									<div class="slider-text-inner text-center">
										<h1>Liên hệ</h1>
										<h2 class="bread">
											<span><a href="index.html">Home</a></span> <span>Liên hệ</span>
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
						<h3>Thông tin liên hệ</h3>
						<div class="row contact-info-wrap">
							<div class="col-md-3">
								<p>
									<span><i class="icon-location"></i></span> 01 Võ Văn Ngân, Linh Chiểu, Thủ Đức
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-phone3"></i></span> <a
										href="tel://1234567920">+ 0169696969</a>
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-paperplane"></i></span> <a
										href="mailto:info@yoursite.com">EmiriSuzuhara@gmail.com</a>
								</p>
							</div>
							<div class="col-md-3">
								<p>
									<span><i class="icon-globe"></i></span> <a href="#">noithatchatluong.com</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-10 col-md-offset-1">
						<div class="contact-wrap">
							<h3>Liên hệ với chúng tôi</h3>
							<form action="#">
								<div class="row form-group">
									<div class="col-md-6 padding-bottom">
										<label for="fname">Tên</label> <input type="text"
											id="fname" class="form-control" placeholder="Nhập tên của bạn">
									</div>
									<div class="col-md-6">
										<label for="lname">Họ</label> <input type="text"
											id="lname" class="form-control" placeholder="Nhập họ của bạn">
									</div>
								</div>

								<div class="row form-group">
									<div class="col-md-12">
										<label for="email">Email</label> <input type="text" id="email"
											class="form-control" placeholder="Nhập địa chỉ email của bạn">
									</div>
								</div>

								<div class="row form-group">
									<div class="col-md-12">
										<label for="subject">Tiêu đề</label> <input type="text"
											id="subject" class="form-control"
											placeholder="Nhập tiêu đề của tin nhắn">
									</div>
								</div>

								<div class="row form-group">
									<div class="col-md-12">
										<label for="message">Tin nhắn</label>
										<textarea name="message" id="message" cols="30" rows="10"
											class="form-control" placeholder="Nhắn gì đó với chúng tôi"></textarea>
									</div>
								</div>
								<div class="form-group text-center">
									<input type="submit" value="Send Message"
										class="btn btn-primary">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>


		<jsp:include page = "_footer.jsp"></jsp:include>
	</div>


	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
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
	<!-- Google Map -->
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="static/js/google_map.js"></script>
	<!-- Main -->
	<script src="static/js/main.js"></script>
</body>
</html>