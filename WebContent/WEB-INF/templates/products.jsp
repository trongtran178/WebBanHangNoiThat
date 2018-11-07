<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	<jsp:include page = "_menu.jsp"></jsp:include>
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
											<span><a href="index.html">Home</a></span> <span>Sản phẩm</span>
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
							<div class="col-md-4 text-center">
								<div class="product-entry">
									<div class="product-img" style="background-image: url(static/images/BanLamViec.jpg);">
										<p class="tag"><span class="new">New</span></p>
										<div class="cart">
											<p>
												<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
												<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
											</p>
										</div>
									</div>
									<div class="desc">
										<h3><a href="product-detail.html">Bàn làm việc phổ thông</a></h3>
										<p class="price"><span>700.000 VNĐ</span></p>
									</div>
								</div>
							</div>
							<div class="col-md-4 text-center">
								<div class="product-entry">
									<div class="product-img" style="background-image: url(static/images/pi3.jpg);">
										<p class="tag"><span class="new">New</span></p>
										<div class="cart">
											<p>
												<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
												<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
											</p>
										</div>
									</div>
									<div class="desc">
										<h3><a href="product-detail.html">Giường ngủ tinh tế</a></h3>
										<p class="price"><span>15.000.000 VNĐ</span> <span class="sale">18.000.000 VNĐ</span> </p>
									</div>
								</div>
							</div>
							<div class="col-md-4 text-center">
								<div class="product-entry">
									<div class="product-img" style="background-image: url(static/images/giuong2.jpg);">
										<p class="tag"><span class="new">New</span></p>
										<div class="cart">
											<p>
												<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
												<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
											</p>
										</div>
									</div>
									<div class="desc">
										<h3><a href="product-detail.html">Giường ngủ cơ bản</a></h3>
										<p class="price"><span>10.000.000 VNĐ/span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/sofa1.jpg);">
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Ghế sofa tinh tế</a></h3>
											<p class="price"><span>8.000.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/tantrachair.jpg);">
											<p class="tag"><span class="sale">Sale</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Ghế tập Yoga</a></h3>
											<p class="price"><span>15.000.000 VNĐ</span> <span class="sale">$300.00</span> </p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/ban3.jpg);">
											<p class="tag"><span class="new">New</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Bàn cổ điển</a></h3>
											<p class="price"><span>1.200.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/ban4.jpg);">
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Bàn phong cách ngày xửa ngày xưa</a></h3>
											<p class="price"><span>900.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/ban5.jpg);">
											<p class="tag"><span class="new">New</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Bàn học sáng tạo</a></h3>
											<p class="price"><span>800.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/ban6.jpg);">
											<p class="tag"><span class="new">New</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Bàn học tập trung</a></h3>
											<p class="price"><span>1.200.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/giuong3.jpg);">
											<p class="tag"><span class="new">New</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Giường ngủ chất lượng cao</a></h3>
											<p class="price"><span>15.000.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/giuong4.png);">
											<p class="tag"><span class="new">New</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Giường ngủ hiện đại</a></h3>
											<p class="price"><span>13.000.000 VNĐ</span></p>
										</div>
									</div>
								</div>
								<div class="col-md-4 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/giuong5.jpg);">
											<p class="tag"><span class="new">New</span></p>
											<div class="cart">
												<p>
													<span class="addtocart"><a href="cart.html"><i class="icon-shopping-cart"></i></a></span> 
													<span><a href="product-detail.html"><i class="icon-eye"></i></a></span> 
													
												</p>
											</div>
										</div>
										<div class="desc">
											<h3><a href="product-detail.html">Giường ngủ sang trọng</a></h3>
											<p class="price"><span>15.000.000 VNĐ</span></p>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<ul class="pagination">
										<li class="disabled"><a href="#">&laquo;</a></li>
										<li class="active"><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">&raquo;</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-md-2 col-md-pull-10">
							<div class="sidebar">
								<div class="side">
									<h2>Hạng mục sản phẩm</h2>
									<div class="fancy-collapse-panel">
										<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
											<div class="panel panel-default">
												<div class="panel-heading" role="tab" id="headingOne">
													<h4 class="panel-title">
														<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Bàn
														</a>
													</h4>
												</div>
												<div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
													<div class="panel-body">
														<ul>
															<li><a href="#">Bàn ăn</a></li>
															<li><a href="#">Bàn làm việc</a></li>
															<li><a href="#">Bàn văn phòng</a></li>
															<li><a href="#">Bàn học</a></li>
														</ul>
													</div>
												</div>
											</div>

											<div class="panel panel-default">
												<div class="panel-heading" role="tab" id="headingTwo">
													<h4 class="panel-title">
														<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">Ghế
														</a>
													</h4>
												</div>
												<div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
													<div class="panel-body">
														<ul>
															<li><a href="#">Ghế sofa</a></li>
															<li><a href="#">Ghế ăn</a></li>
															<li><a href="#">Ghế gỗ</a></li>
															<li><a href="#">Ghế bành</a></li>
															<li><a href="#">Ghế thư giãn</a></li>
															<li><a href="#">Ghế văn phòng</a></li>
														</ul>
													</div>
												</div>
											</div>
											<div class="panel panel-default">
												<div class="panel-heading" role="tab" id="headingThree">
													<h4 class="panel-title">
														<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">Nội thất văn phòng
														</a>
													</h4>
												</div>
												<div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
													<div class="panel-body">
														<ul>
															<li><a href="#">Bàn làm việc</a></li>
															<li><a href="#">Ghế văn phòng & ghế dài</a></li>
														<!-- <li><a href="#">Ghế gỗ</a></li>
														<li><a href="#">Ghế bành</a></li>
														<li><a href="#">Ghế thư giãn</a></li>
														<li><a href="#">Ghế văn phòng</a></li> -->
													</ul>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingFour">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">Đồ trang trí
													</a>
												</h4>
											</div>
											<div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
												<div class="panel-body">
													<ul>
														<li><a href="#">Khung ảnh</a></li>
														<li><a href="#">Tranh ảnh</a></li>
														<li><a href="#">Đồng hồ</a></li>
														<li><a href="#">Hoa & cây cảnh nhân tạo</a></li>
													</ul>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingFive">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">Dụng cụ nhà bếp
													</a>
												</h4>
											</div>
											<div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
												<div class="panel-body">
													<ul>
														<li><a href="#">Tiện ích sắp xếp nhà bếp</a></li>
														<li><a href="#">Dụng cụ sơ chế</a></li>
														<li><a href="#">Jacket</a></li>
														<!-- <li><a href="#">Shoes</a></li> -->
													</ul>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading" role="tab" id="headingSix">
												<h4 class="panel-title">
													<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseSix" aria-expanded="false" aria-controls="collapseSix">Nội thất bếp
													</a>
												</h4>
											</div>
											<div id="collapseSix" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSix">
												<div class="panel-body">
													<ul>
														<li><a href="#">Tiện ích lưu trữ nhà bếp</a></li>
														<li><a href="#">Nội thất bếp</a></li>
			                                 	<!-- <li><a href="#">Jacket</a></li>
			                                 		<li><a href="#">Shoes</a></li> -->
			                                 	</ul>
			                                 </div>
			                             </div>
			                         </div>	
			                         <div class="panel panel-default">
			                         	<div class="panel-heading" role="tab" id="headingSeven">
			                         		<h4 class="panel-title">
			                         			<a class = "collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseSeven" aria-expanded="false" aria-controls="collapseSeven">Tủ quần áo & Tiện ích phòng ngủ
			                         			</a>
			                         		</h4>
			                         	</div>
			                         	<div id="collapseSeven" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingSeven">
			                         		<div class="panel-body">
			                         			<ul>
			                         				<li><a href="#">Tủ ngăn kéo</a></li>
			                         				<li><a href="#">Bàn trang điểm</a></li>
			                         				<li><a href="#">Ghế ngủ</a></li>
			                         				<!-- <li><a href="#">Bàn học</a></li> -->
			                         			</ul>
			                         		</div>
			                         	</div>
			                         </div>		
			                         
			                     </div>
			                 </div>
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
			             						<select name="people" id="people" class="form-control">
			             							<option value="#">100.000</option>
			             							<option value="#">200.000</option>
			             							<option value="#">500.000</option>
			             							<option value="#">1.000.000</option>
			             							<option value="#">2.000.000</option>
			             						</select>
			             					</div>
			             				</div>
			             			</div>
			             			<div class="col-md-12">
			             				<div class="form-group">
			             					<label for="guests">Đến:</label>
			             					<div class="form-field">
			             						<i class="icon icon-arrow-down3"></i>
			             						<select name="people" id="people" class="form-control">
			             							<option value="#">3.000.000</option>
			             							<option value="#">5.000.000</option>
			             							<option value="#">10.000.000</option>
			             							<option value="#">15.000.000</option>
			             							<option value="#">20.000.000</option>
			             						</select>
			             					</div>
			             				</div>
			             			</div>
			             		</div>
			             	</form>
			             </div>
			             <div class="side">
			             	<h2>Color</h2>
			             	<div class="color-wrap">
			             		<p class="color-desc">
			             			<a href="#" class="color color-1"></a>
			             			<a href="#" class="color color-2"></a>
			             			<a href="#" class="color color-3"></a>
			             			<a href="#" class="color color-4"></a>
			             			<a href="#" class="color color-5"></a>
			             		</p>
			             	</div>
			             </div>
			             <div class="side">
			             	<h2>Size</h2>
			             	<div class="size-wrap">
			             		<p class="size-desc">
			             			<a href="#" class="size size-1">xs</a>
			             			<a href="#" class="size size-2">s</a>
			             			<a href="#" class="size size-3">m</a>
			             			<a href="#" class="size size-4">l</a>
			             			<a href="#" class="size size-5">xl</a>
			             			<a href="#" class="size size-5">xxl</a>
			             		</p>
			             	</div>
			             </div>
			         </div>
			     </div>
			 </div>
			</div>
		</div>

		<!-- <div id="map" class="colorlib-map"></div> -->

		<jsp:include page = "_footer.jsp"></jsp:include>
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
	<!-- <script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
	<script src="static/js/google_map.js"></script> -->
	<!-- Main -->
	<script src="static/js/main.js"></script>
</body>
</html>