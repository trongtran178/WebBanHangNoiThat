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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
	.labelTen{
		width: 19.33333% !important;
	}
	.inputNhapTen{
		width: 74.666667% !important;
	}
	#TenKhachHang{
		margin-top: -5px;
		border-radius: 6px;
	}
	@media (min-width: 992px) {
		.editSpaceOfMuaThemButton {
			width: 14% !important;
		}
	}
	
.total-wrap .form-control {
    height: 40px;
    border: 1px solid #f0f0f0 !important;
    margin-bottom: 10px;
     text-align: left; 
}
	.iconThongTinKhachHang {
		font-size: 20px;
		color: blue;
		margin-right: 10px;
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
							<div class="col-md-6 col-md-offset-3 col-sm-12 col-xs-12 slider-text">
								<div class="slider-text-inner text-center">
									<h1>Giỏ hàng</h1>
									<h2 class="bread">
										<span>
											<a href="index.html">Home</a>
										</span>
										<span>
											<a href="shop.html">Sản phẩm</a>
										</span>
										<span>Giỏ hàng</span>
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
			<div class="row row-pb-md">
				<div class="col-md-10 col-md-offset-1">
					<div class="process-wrap">
						<div class="process text-center active">
							<p>
								<span>01</span>
							</p>
							<h3>Giỏ hàng</h3>
						</div>
						<div class="process text-center">
							<p>
								<span>02</span>
							</p>
							<h3>Kiểm tra </h3>
						</div>
						<div class="process text-center">
							<p>
								<span>03</span>
							</p>
							<h3>Đặt hàng</h3>
						</div>
					</div>
				</div>
			</div>
			<div class="row row-pb-md">
				<div class="col-md-10 col-md-offset-1">
					<div class="product-name">
						<div class="one-forth text-center">
							<span>Chi tiết sản phẩm</span>
						</div>
						<div class="one-eight text-center">
							<span>Đơn giá</span>
						</div>
						<div class="one-eight text-center">
							<span>Số lượng</span>
						</div>
						<div class="one-eight text-center">
							<span>Khuyến mãi</span>
						</div>
						<div class="one-eight text-center">
							<span>Tổng tiền</span>
						</div>
						<div class="one-eight text-center">
							<span>Xóa</span>
						</div>
					</div>

					<div class="product-cart" id="product-card-1">
						<div class="one-forth">
							<div class="product-img" style="background-image: url(static/images/productimages/bango1.jpeg);">
							</div>
							<div class="display-tc">
								<h3>Bộ bàn ăn</h3>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">850.000 đ</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<input type="number" id="quantity" name="quantity" class="form-control input-number text-center" value="1" min="1" max="100">
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">5%</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">850.000 đ</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<button class="btn btn-danger button-xoa" style="padding: 0px 5px; border-radius: 5px;" data-parent-id="product-card-1">x</button>
							</div>
						</div>
					</div>

					<div class="product-cart" id="product-card-2">
						<div class="one-forth">
							<div class="product-img" style="background-image: url(static/images/productimages/bango1.jpeg);">
							</div>
							<div class="display-tc">
								<h3>Bộ bàn ăn</h3>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">850.000 đ</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<input type="number" id="quantity" name="quantity" class="form-control input-number text-center" value="1" min="1" max="100">
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">5%</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">850.000 đ</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<button class="btn btn-danger button-xoa" style="padding: 0px 5px; border-radius: 5px;" data-parent-id="product-card-2">x</button>
							</div>
						</div>
					</div>

					<div class="product-cart" id="product-card-3">
						<div class="one-forth">
							<div class="product-img" style="background-image: url(static/images/productimages/bango1.jpeg);">
							</div>
							<div class="display-tc">
								<h3>Bộ bàn ăn</h3>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">850.000 đ</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<input type="number" id="quantity" name="quantity" class="form-control input-number text-center" value="1" min="1" max="100">
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">5%</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<span class="price">850.000 đ</span>
							</div>
						</div>
						<div class="one-eight text-center">
							<div class="display-tc">
								<button class="btn btn-danger button-xoa" style="padding: 0px 5px; border-radius: 5px;" data-parent-id="product-card-3">x</button>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="row">
				<div class = "col-md-1">
				
				</div>
				<div class="col-md-10 col-md-offset-1">
					<div class="total-wrap">
						<div class="row">
							<div class="col-md-3 editSpaceOfMuaThemButton">
								<button style = "border-radius: 7px;" type="button" class="btn btn-info">Mua thêm</button>
							</div>
							<div class="col-md-3">
								<button style = "border-radius: 7px;" type="button" class="btn btn-success" data-toggle="modal" data-target="#CustomerInformationModal">Thanh toán</button>
							</div>
							<div class = "modal fade" id = "CustomerInformationModal" aria-labelledby="gridSystemModalLabel" role="dialog">
								<div class = "modal-dialog" role="document">
									<div class = "modal-content">
										<div class = "modal-header">
								          <button type="button" class="close" data-dismiss="modal" aria-label="Close">&times;</button>
								          <h4 class="modal-title"><i class = "fa fa-info-circle iconThongTinKhachHang" style = "font-size: 20px; color: blue;"></i>Nhập thông tin quý khách</h4>											
										</div>
										<div class = "modal-body">
											<form>
									          <div class="form-group">
									            <label for="TenKhachHang" class="control-label">Họ và tên:</label>
									            <input type="text" class="form-control" id="TenKhachHang" placeholder="Nhập họ và tên...">
									          </div>	
									          <div class="form-group">
									            <label for="Email" class="control-label">Email:</label>
									            <input type="email" class="form-control" id="TenKhachHang" placeholder ="Nhập email...">
									          </div>
									          <div class="form-group">
									            <label for="Address" class="control-label">Địa chỉ:</label>
									            <input type="email" class="form-control" id="address" placeholder ="Nhập địa chỉ...">
									          </div>									          
									          <div class="form-group">
									            <label for="SDT" class="control-label">Số điện thoại:</label>
									            <input type="text" class="form-control" id="phonenumber" placeholder="Nhập số điện thoại">
									          </div>
									           									        									          																				
											</form>
											
															

										</div>
										<div class="modal-footer">
									        <button style = "border-radius: 7px;" type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
									        <button style = "border-radius: 7px;" type="button" class="btn btn-info">Lưu thông tin</button>
									      </div>										
									</div>
								</div>
							</div>
							<div class="col-md-6 text-center">
								<div class="total">
									<div class="sub">
										<p>
											<span>Tổng tiền sản phẩm:</span>
											<span>$200.00</span>
										</p>
										<p>
											<span>Phí vận chuyển:</span>
											<span>$0.00</span>
										</p>
										<p>
											<span>Tổng tiền khuyến mãi:</span>
											<span>$45.00</span>
										</p>
									</div>
									<div class="grand-total">
										<p>
											<span>
												<strong>Tổng:</strong>
											</span>
											<span>$450.00</span>
										</p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

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

		<!-- <div id="map" class="colorlib-map"></div> -->

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
	<script>
		$(document).ready(function () {

			$(".button-xoa").click(function (e) {
				var parentid = e.target.getAttribute("data-parent-id");
				$("#" + parentid).remove();
			});
		});
	</script>
</body>
</html>