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
												<span>
													<a href="index.html">Home</a>
												</span>
												<span>
													<a href="shop.html">Sản phẩm</a>
												</span>
												<span>Chi tiết sản phẩm</span>
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
										<li data-thumb="static/images/productimages/bango1.jpeg">
											<div class="thumb-image">
												<img src="static/images/productimages/bango1.jpeg" data-imagezoom="true" class="img-responsive"> </div>
										</li>
										<li data-thumb="static/images/productimages/bango2.jpeg">
											<div class="thumb-image">
												<img src="static/images/productimages/bango2.jpeg" data-imagezoom="true" class="img-responsive"> </div>
										</li>
										<li data-thumb="static/images/productimages/bango3.jpeg">
											<div class="thumb-image">
												<img src="static/images/productimages/bango3.jpeg" data-imagezoom="true" class="img-responsive"> </div>
										</li>
										<li data-thumb="static/images/productimages/bango4.jpeg">
											<div class="thumb-image">
												<img src="static/images/productimages/bango4.jpeg" data-imagezoom="true" class="img-responsive"> </div>
										</li>
									</ul>
								</div>

								<div class="clearfix"> </div>
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
									<h4>Bàn gỗ cao cấp</h4>
									<div class="star-on">
										<div class="clearfix"> </div>
									</div>

									<h5 class="item_price">850.000 đ</h5>
									<p>Chất liệu: gỗ tùng</p>
									<p class="khuyenmai">Khuyến mãi: giảm 10%</p>
									<p>Kích thước: 0.6 x 0.5 x 0.5 (mét)</p>
									<p>Xuất xứ: Việt Nam</p>
									<div class="available">
										<ul>
											<li>Màu sắc
												<select>
													<option>Trắng</option>
													<option>Đen</option>
													<option>Màu gỗ tự nhiên</option>
												</select>
											</li>
											<div class="clearfix"> </div>
										</ul>
									</div>
									<a href="#" class="add-cart item_add">Thêm vào giỏ hàng</a>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>

					<div class="clearfix"> </div>
				</div>
			</div>

			<div class="container">
				<div class="motasanpham">
					<h2>Mô tả</h2>
					<hr/>
					<p>Bộ bàn ghế được làm bằng gỗ tùng, với thiết kế sang trọng, sơn phủ lớp sơn bóng chống trầy, chống nước giúp bảo vệ sản
						phẩm bền vững với thời gian</p>
					<hr/>
				</div>
			</div>
			<!-- Ket Thuc -->

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


						<div class="col-md-3 text-center">
							<div class="product-entry">
								<div class="product-img" style="background-image: url(static/images/productimages/bango2.jpeg);">
									<p class="tag">
										<span class="new">New</span>
									</p>
									<div class="cart">
										<p>
											<span class="addtocart">
												<a href="#">
													<i class="icon-shopping-cart"></i>
												</a>
											</span>
											<span>
												<a href="product-detail.html">
													<i class="icon-eye"></i>
												</a>
											</span>
											<span>
												<a href="#">
													<i class="icon-heart3"></i>
												</a>
											</span>
											<span>
												<a href="add-to-wishlist.html">
													<i class="icon-bar-chart"></i>
												</a>
											</span>
										</p>
									</div>
								</div>
								<div class="desc">
									<h3>
										<a href="shop.html">Floral Dress</a>
									</h3>
									<p class="price">
										<span>$300.00</span>
									</p>
								</div>
							</div>
						</div>


						<div class="col-md-3 text-center">
							<div class="product-entry">
								<div class="product-img" style="background-image: url(static/images/productimages/bango1.jpeg);">
									<p class="tag">
										<span class="new">New</span>
									</p>
									<div class="cart">
										<p>
											<span class="addtocart">
												<a href="#">
													<i class="icon-shopping-cart"></i>
												</a>
											</span>
											<span>
												<a href="product-detail.html">
													<i class="icon-eye"></i>
												</a>
											</span>
											<span>
												<a href="#">
													<i class="icon-heart3"></i>
												</a>
											</span>
											<span>
												<a href="add-to-wishlist.html">
													<i class="icon-bar-chart"></i>
												</a>
											</span>
										</p>
									</div>
								</div>
								<div class="desc">
									<h3>
										<a href="shop.html">Floral Dress</a>
									</h3>
									<p class="price">
										<span>$300.00</span>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-3 text-center">
							<div class="product-entry">
								<div class="product-img" style="background-image: url(static/images/productimages/bango1.jpeg);">
									<p class="tag">
										<span class="new">New</span>
									</p>
									<div class="cart">
										<p>
											<span class="addtocart">
												<a href="#">
													<i class="icon-shopping-cart"></i>
												</a>
											</span>
											<span>
												<a href="product-detail.html">
													<i class="icon-eye"></i>
												</a>
											</span>
											<span>
												<a href="#">
													<i class="icon-heart3"></i>
												</a>
											</span>
											<span>
												<a href="add-to-wishlist.html">
													<i class="icon-bar-chart"></i>
												</a>
											</span>
										</p>
									</div>
								</div>
								<div class="desc">
									<h3>
										<a href="shop.html">Floral Dress</a>
									</h3>
									<p class="price">
										<span>$300.00</span>
									</p>
								</div>
							</div>
						</div>

						<div class="col-md-3 text-center">
							<div class="product-entry">
								<div class="product-img" style="background-image: url(static/images/productimages/bango1.jpeg);">
									<p class="tag">
										<span class="new">New</span>
									</p>
									<div class="cart">
										<p>
											<span class="addtocart">
												<a href="#">
													<i class="icon-shopping-cart"></i>
												</a>
											</span>
											<span>
												<a href="product-detail.html">
													<i class="icon-eye"></i>
												</a>
											</span>
											<span>
												<a href="#">
													<i class="icon-heart3"></i>
												</a>
											</span>
											<span>
												<a href="add-to-wishlist.html">
													<i class="icon-bar-chart"></i>
												</a>
											</span>
										</p>
									</div>
								</div>
								<div class="desc">
									<h3>
										<a href="shop.html">Floral Dress</a>
									</h3>
									<p class="price">
										<span>$300.00</span>
									</p>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>


		<!--  -->

		<div id="map" class="colorlib-map"></div>

		<jsp:include page="_footer.jsp"></jsp:include>
		</div>


		<div class="gototop js-top">
			<a href="#" class="js-gotop">
				<i class="icon-arrow-up2"></i>
			</a>
		</div>



	</body>

	</html>