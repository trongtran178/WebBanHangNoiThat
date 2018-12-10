<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Đăng ký</title>
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
										<h1>Đăng ký</h1>
										<h2 class="bread">
											<span><a href="index.html">Home</a></span> <span>Đăng ký</span>
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
							<h3>Đăng ký</h3>
							<form method="POST" action="register" id = "registerForm">
								<div class="row form-group">
								<!-- 	<div class="col-md-6 padding-bottom">
										<label for="fname">Tên</label> 
										<input type="text" id="fname" name = "fname" class="form-control" placeholder="Nhập tên của bạn">
									</div> -->
									<div class="col-md-12">
										<label for="fullname">Họ và tên </label> 
										<input type="text" id="fullname" name = "fullname" class="form-control" placeholder="Nhập họ tên của bạn">
									</div>
								</div>

								<div class="row form-group">
									<div class="col-md-12">
										<label for="email">Email</label>
										 <input type="text" id="email" name = "email" class="form-control" placeholder="Nhập địa chỉ email của bạn">
										 <div id = "checkEmail" style = "color: red; font-weight: bold;"></div>
									</div>
								</div>

								<div class="row form-group">
									<div class="col-md-12">
										<label for="password">Mật khẩu</label> 
										<input type="password" name = "password" id="password" class="form-control" placeholder="Nhập mật khẩu">
									</div>
								</div>
								<div class="row form-group">
									<div class="col-md-12">
										<label for="confirmpassword">Xác nhận mật khẩu</label> 
										<input type="password" name = "confirmpassword" id="comfirmpassword" class="form-control" placeholder="Xác nhận mật khẩu">
									</div>
								</div>
								<div class="row form-group">
									<div class="col-md-12">
										<label for="address">Địa chỉ</label> 
										<input type="text" name = "address" id="address" class="form-control" placeholder="Nhập địa chỉ">
									</div>
								</div>
								<div class="row form-group">
									<div class="col-md-12">
										<label for="phonenumber">Số điện thoại</label> 
										<input type="text" name = "phonenumber" id="phonenumber" class="form-control" placeholder="Nhập số điện thoại">
									</div>
								</div>
								<div class="form-group text-center">
									<input id = "register" type="submit" value="Đăng ký" class="btn btn-primary">
								</div>
								<div class="col-md-12" style = "text-align:center;">
									Nếu bạn có tài khoản, click <a href = "login">vào đây</a> để đăng nhập
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
	<script type="text/javascript">
		$(document).ready(function() {
			$("#registerForm").validate({
				rules: {
					fullname: "required",
					email: {
						required: true,
						email: true	
					},
					password: {
						required: true,
						minlength: 6,
						maxlength: 18
					},
					confirmpassword: {
						required: true,
						minlength: 6,
						maxlength: 18,
						equalTo: "#password"
					},
					address: "required",
					phonenumber: {
						required: true,
						number: true
					}					
				},
				messages: {
					fullname: "Vui lòng nhập họ và tên của bạn.",				
					email: {
						 required: "Vui lòng nhập email !",
						 email: "Vui lòng nhập email chính xác !"
					},
					password: {
						required: "Vui lòng nhập mật khẩu",
						minlength: "Mật khẩu không được ít hơn 6 kí tự",
						maxlength: "Mật khẩu không được vượt quá 18 kí tự"
					},
					address: "Vui lòng nhập địa chỉ",
					phonenumber: {
						required: "Vui lòng nhập số điện thoại.",
						number: "Vui lòng nhập số điện thoại chính xác",
					}
				}
				 	
			});
		});
	</script>
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
 	<script src="static/js/utils.js"></script>

<!-- 	<script src="static/js/additional-methods.js"></script>
	<script src="static/js/additional-methods.min.js"></script> -->
	
	<!-- Google Map -->
<!-- 	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="static/js/google_map.js"></script> -->
	<!-- Main -->
	<script src="static/js/main.js"></script>
	
<!-- 	kiem tra email da ton tai chưa -->
	<script>
		window.onload = initPage;
		
		function initPage() {
			document.getElementById("register").disabled = true;
		}
		
		
		var emailValid = true;
	
		$("#email").blur(function() {
			document.getElementById("email").className = "form-control thinking";
			emailRequest = createRequest();
			if(emailRequest === null) {
				alert("Trình duyệt không hỗ trợ XHR!");
			} else {
				var getEmail = document.getElementById("email").value;
				var email = escape(getEmail);
				//alert(window.location.origin);
				var url = "/WebBanHangNoiThat2/checkEmail?email=" + email;
				emailRequest.onreadystatechange = showEmailStatus;
				emailRequest.open("GET", url, true);
				emailRequest.send(null);
			}
		});
		
		function showEmailStatus() {
			if(emailRequest.readyState == 4) {
				if(emailRequest.status == 200) {
					if(emailRequest.responseText == "ok") {
						document.getElementById("email").className = "form-control approved";
						emailValid = true;
						document.getElementById("checkEmail").innerHTML = "";

						//alert(emailValid);
					} else {
						document.getElementById("email").className = "form-control denied";
						document.getElementById("checkEmail").innerHTML = "Email đã tồn tại, xin vui lòng nhập email khác !";
						document.getElementById("email").focus();
						document.getElementById("email").select();
						emailValid = false;
						//alert(emailValid);

					}
					checkCorrectEmail();
				}
			}
		}
		function checkCorrectEmail() {
			if(emailValid) {
				document.getElementById("register").disabled = false;
			} else {
				document.getElementById("register").disabled = true;

			}
		}
		
		
	</script>

	
	
	
	
</body>
</html>