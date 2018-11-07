<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Thông tin cá nhân</title>
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
</head>
<style>
	@media (min-width: 992px) {
		.col-md-4 {
    		width: 25.33333%;
    	}
    	/* .col-md-8 {
    		width: 80.66667%;
    	} */
    	 .address{
    		width: 12.666667% !important;	
    	}
	}
	.editSpaceAddressInput{
		width: 83% !important;
	}
	.editSpaceOfUpdateInfButton {
		width: 20%;
	}
	#fullname {
		margin-top: -4px;
	}
	input[type="text"] {
    	height: 31px;
    	border-radius: 10px;
	}
	
}
</style>
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
										<h1>Thông tin cá nhân</h1>
										<h2 class="bread">
											<span><a href="index.html">Home</a></span> <span>Thông tin cá nhân</span>
										</h2>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>
		
		<div id = "colorlib-contact">
			<div class="container">
				<div class="row">
					<div class="col-md-10 col-md-offset-1">
						<div class="contact-wrap">
							<h3>Thông tin cá nhân</h3>
							<div class = "row">
								<input type = "hidden" id = "MaKH" name = "MaKH"/>
							</div>
							<div class = "row">
								<input type = "hidden" id = "DateRegister" name = "NgayDangKy"/>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="row form-group">
										<div class="col-md-4">
											<label for="fullname">Họ và tên </label>
										</div>
										<div class="col-md-8">
											<input type="text" id="fullname" name="fullname"
												class="form-control" value="Mai Đức Tuấn"
												readonly="readonly">
										</div>

									</div>
								</div>
								<div class="col-md-6">
									<div class="row form-group">
										<div class="col-md-4">
											<label for="fullname">Email</label>
										</div>
										<div class="col-md-8">
											<input type="text" id="fullname" name="email"
												class="form-control" value="maiductuan@gmail.com"
												readonly="readonly">
										</div>

									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="row form-group">
										<div class="col-md-4">
											<label for="fullname">Số điện thoại </label>
										</div>
										<div class="col-md-8">
											<input type="text" id="fullname" name="SDT"
												class="form-control" value="0911 066 089"
												readonly="readonly">
										</div>

									</div>
								</div>
								<div class="col-md-6">
									<div class="row form-group">
										<div class="col-md-4">
											<label for="fullname">Số người đã giới thiệu </label>
										</div>
										<div class="col-md-8">
											<input type="text" id="fullname" name="DateRegister"
												class="form-control" value="4"
												readonly="readonly">
										</div>

									</div>
								</div>
							</div>
							<div class = "row">
								<div class = "col-md-12">
									<div class="row form-group">
										<div class="col-md-4 address">
											<label for="fullname">Địa chỉ </label>
										</div>
										<div class="col-md-8 editSpaceAddressInput" id = "editSpaceAddressInput">
											<input type="text" id="fullname" name="address"
												class="form-control" value="01 Võ Văn Ngân, phường Linh Chiểu, quận Thủ Đức, TP.HCM"
												readonly="readonly">
										</div>

									</div>								
								</div>
							</div>	
							<div class = "row">
								<div class = "col-md-12">
									<div class="row form-group">
										<div class="col-md-4 editSpaceLeftOfButton">
											
										</div>									
										<div class="col-md-4 editSpaceOfUpdateInfButton">
											<button class = "btn btn-success">Cập nhật thông tin</button>
										</div>
											<div class="col-md-4">
											<button class = "btn btn-info">Đổi mật khẩu</button>
										</div>								

									</div>								
								</div>
							</div>					
						</div>
					</div>					
				</div>
			</div>
		</div>
		
		
		<jsp:include page="_footer.jsp"></jsp:include>
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
 	<script src="static/js/main.js"></script>
</body>
</html>