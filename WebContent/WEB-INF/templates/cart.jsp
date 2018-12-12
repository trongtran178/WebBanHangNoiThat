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
		.labelTen {
	width: 19.33333% !important;
}

.inputNhapTen {
	width: 74.666667% !important;
}

#TenKhachHang {
	margin-top: -5px;
	border-radius: 6px;
}

@media ( min-width : 992px) {
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
										<h1>Giỏ hàng</h1>
										<h2 class="bread">
											<span> <a href="index.html">Home</a>
											</span> <span> <a href="shop.html">Sản phẩm</a>
											</span> <span>Giỏ hàng</span>
										</h2>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>
		<c:choose>
			<c:when test="${not empty danhSachItem.getItems()}">
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
										<h3>Kiểm tra</h3>
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
								<c:forEach items="${danhSachItem.getItems()}" var="item">
									<div class="product-cart" id="<c:out value='${item.getSanPham().getMaSanPham()}'/>">
										<div class="one-forth">
											<div class="product-img" style="background-image: url(static/images/productimages/<c:out value='${item.getSanPham().getDanhSachHinhAnh().get(0)}'/>);">
											</div>
											<div class="display-tc">
												<h3>
													<c:out value='${item.getSanPham().getTenSanPham()}' />
												</h3>
											</div>
										</div>
										<div class="one-eight text-center">
											<div class="display-tc">
												<span class="price" id="donGia-<c:out value='${item.getSanPham().getMaSanPham()}'/>" data-donGia="<c:out value='${item.getSanPham().getDonGia()}'/>">
													<c:out value='${item.getSanPham().getDonGia()}' /> đ</span>
											</div>
										</div>
										<div class="one-eight text-center">
											<div class="display-tc">
												<input type="number" name="quantity" onchange="TinhTongTien(event)" data-parent-id="<c:out value='${item.getSanPham().getMaSanPham()}'/>"
												 class="form-control input-number text-center" value="<c:out value='${item.getSoLuong()}'/>" min="1" max="100">
											</div>
										</div>
										<div class="one-eight text-center">
											<div class="display-tc">
												<span class="price khuyenMai" id="khuyenMai-<c:out value='${item.getSanPham().getMaSanPham()}'/>"
												 data-khuyenMai="<c:out value='${item.getKhuyenMai()}'/>">
													<c:out value='${item.getKhuyenMai()}' />%</span>
											</div>
										</div>
										<div class="one-eight text-center">
											<div class="display-tc">
												<span class="price tongTien" id="tongTien-<c:out value='${item.getSanPham().getMaSanPham()}'/>"
												 data-tongTien="<c:out value='${item.getTongTien()}'/>">
													<c:out value='${item.getTongTien()}' /></span> đ
											</div>
										</div>
										<div class="one-eight text-center">
											<div class="display-tc">
												<button class="btn btn-danger button-xoa" style="padding: 0px 5px; border-radius: 5px;" data-parent-id="<c:out value='${item.getSanPham().getMaSanPham()}'/>">x</button>
											</div>
										</div>
									</div>
								</c:forEach>

							</div>
						</div>
						<div class="row">
							<div class="col-md-1"></div>
							<div class="col-md-10 col-md-offset-1">
								<div class="total-wrap">
									<div class="row">
										<a href="products">
											<div class="col-md-3 editSpaceOfMuaThemButton">
												<button style="border-radius: 7px;" type="button" class="btn btn-info">Mua thêm</button>
											</div>
										</a>

										<c:choose>
											<c:when test="${empty sessionScope.email}">
												<div class="col-md-3">
													<button style="border-radius: 7px;" type="button" class="btn btn-success" data-toggle="modal" data-target="#CustomerInformationModal">Thanh
														toán</button>
												</div>
											</c:when>

											<c:otherwise>
												<form action="thanhtoan" method="GET">
													<div class="col-md-3">
														<input type="submit" value="Thanh toán" style="border-radius: 7px;" type="button" class="btn btn-success">
													</div>
												</form>
											</c:otherwise>
										</c:choose>

										<div class="modal fade" id="CustomerInformationModal" aria-labelledby="gridSystemModalLabel" role="dialog">
											<div class="modal-dialog" role="document">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal" aria-label="Close">&times;</button>
														<h4 class="modal-title">
															<i class="fa fa-info-circle iconThongTinKhachHang" style="font-size: 20px; color: blue;"></i>Nhập thông
															tin
															quý khách
														</h4>
													</div>
													<div class="modal-body">
														<form>
															<div class="form-group">
																<label for="TenKhachHang" class="control-label">Họ
																	và tên:</label> <input type="text" class="form-control" id="TenKhachHang" placeholder="Nhập họ và tên...">
															</div>
															<div class="form-group">
																<label for="Email" class="control-label">Email:</label> <input type="email" class="form-control" id="TenKhachHang"
																 placeholder="Nhập email...">
															</div>
															<div class="form-group">
																<label for="Address" class="control-label">Địa
																	chỉ:</label> <input type="email" class="form-control" id="address" placeholder="Nhập địa chỉ...">
															</div>
															<div class="form-group">
																<label for="SDT" class="control-label">Số điện
																	thoại:</label> <input type="text" class="form-control" id="phonenumber" placeholder="Nhập số điện thoại">
															</div>

														</form>



													</div>
													<div class="modal-footer">
														<button style="border-radius: 7px;" type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
														<button style="border-radius: 7px;" type="button" class="btn btn-info">Lưu thông tin</button>
													</div>
												</div>
											</div>
										</div>
										<div class="col-md-6 text-center">
											<div class="total">
												<div class="sub">
													<p>
														<span>Tổng tiền sản phẩm:</span> <span id="tongTienChuaKhuyenMai">
															<c:out value='${danhSachItem.getTongTienChuaKhuyenMai()}' /> đ</span>
													</p>
													<p>
														<span>Phí vận chuyển:</span> <span style="color: red;">Free
															ship</span>
													</p>
													<p>
														<span>Tổng tiền khuyến mãi:</span> <span id="tongTienKhuyenMai">
															<c:out value='${danhSachItem.getTongTienKhuyenMai()}' /></span>
													</p>
												</div>
												<div class="grand-total">
													<p>
														<span> <strong>Tổng:</strong>
														</span> <span id="tongTienPhaiTra">
															<c:out value='${danhSachItem.getTongTien()}' /> đ</span>
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
						<c:if test="${not empty danhSachItem.getSanPhamLienQuan()}">
							<div class="row">
								<div class="col-md-6 col-md-offset-3 text-center colorlib-heading">
									<h2>
										<span>Sản phẩm liên quan</span>
									</h2>
									<p>Có thể bạn cũng muốn xem những sản phẩm này.</p>
								</div>
							</div>
						</c:if>


						<div class="row">

							<c:forEach items="${danhSachItem.getSanPhamLienQuan()}" var="sanPham">
								<div class="col-md-3 text-center">
									<div class="product-entry">
										<div class="product-img" style="background-image: url(static/images/productimages/${sanPham.getDanhSachHinhAnh().get(0)});">
											<p class="tag">
												<span class="new">New</span>
											</p>
											<div class="cart">
												<p>
													<span class="addtocart"> <a href="addtocart?maSanPham=${sanPham.getMaSanPham()}">
															<i class="icon-shopping-cart"></i>
														</a>
													</span> <span> <a href="product-detail?maSanPham=${sanPham.getMaSanPham()}">
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

						</div>
					</div>
				</div>
			</c:when>

			<c:otherwise>
				<div style="text-align: center;">
					<h2>Bạn chưa có sản phẩm nào trong giỏ hàng!</h2>
					<h3><a href="products">Xem sảm phẩm ngay!</a></h3>
				</div>
			</c:otherwise>
		</c:choose>

	</div>


	<!--  -->

	<!-- <div id="map" class="colorlib-map"></div> -->

	<jsp:include page="_footer.jsp"></jsp:include>
	</div>


	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>

	<div id="ThucHienLenh" style="font-size: 1px">Xin chao cac ban</div>

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
	<script>
		function TinhTongTien(event) {
			let parentid = event.target.getAttribute("data-parent-id");
			let soLuong = event.target.value;
			let donGia = document.getElementById("donGia-" + parentid)
				.getAttribute("data-donGia");
			let khuyenMai = document.getElementById("khuyenMai-" + parentid)
				.getAttribute("data-khuyenMai");
			let tongTien = document.getElementById("tongTien-" + parentid);

			tongTien.innerHTML = donGia * soLuong * (1.0 - khuyenMai / 100.0);

			let idSanPham = parentid.substring(2);
			let xhr = new XMLHttpRequest();
			xhr.onreadystatechange = function () {
				if (this.readyState == 4 && this.status == 200) {
					let chuoi = this.responseText;
					let mangGia = chuoi.split("-");
					document.getElementById("tongTienChuaKhuyenMai").innerHTML = mangGia[0];
					document.getElementById("tongTienKhuyenMai").innerHTML = mangGia[1];
					document.getElementById("tongTienPhaiTra").innerHTML = mangGia[2];
				}
			}
			xhr.open("POST", "cart", true);
			xhr.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded")
			xhr.send("maSanPham=" + idSanPham + "&action=sua&soLuong=" +
				soLuong);

		}

		$(document)
			.ready(
				function () {

					$(".button-xoa")
						.click(
							function (e) {

								var parentid = e.target
									.getAttribute("data-parent-id");

								$("#" + parentid).remove();

								let idSanPham = parentid
									.substring(2);
								let xhr = new XMLHttpRequest();
								xhr.onreadystatechange = function () {
									if (this.readyState == 4 &&
										this.status == 200) {
										let chuoi = this.responseText;
										let mangGia = chuoi
											.split("-");
										document
											.getElementById("tongTienChuaKhuyenMai").innerHTML = mangGia[0];
										document
											.getElementById("tongTienKhuyenMai").innerHTML = mangGia[1];
										document
											.getElementById("tongTienPhaiTra").innerHTML = mangGia[2];
									}
								}
								xhr.open("POST", "cart", true);
								xhr
									.setRequestHeader(
										"Content-type",
										"application/x-www-form-urlencoded")
								xhr.send("maSanPham=" +
									idSanPham +
									"&action=xoa");
							});

				});
	</script>
</body>

</html>