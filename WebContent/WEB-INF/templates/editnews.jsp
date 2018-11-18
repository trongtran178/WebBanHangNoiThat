<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr" lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="static/ckeditor/ckeditor.js"></script>
<meta name="description" content="">
<meta name="author" content="">
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="../../assets/images/favicon.png">
<title>Trang sửa tin tức</title>
<!-- Custom CSS -->
<link href="static/admin/dist/css/style.min.css" rel="stylesheet">

<!-- chỗ này add link của biểu đồ -->


<link href="vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
<!-- NProgress -->
<link href="vendors/nprogress/nprogress.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="build/css/custom.min.css" rel="stylesheet">

<!-- chỗ này kết thúc link của biểu đồ -->
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<style>
	body {
	    color: #73879C;
	    background: #f4f4f4;
	    font-family: "Helvetica Neue", Roboto, Arial, "Droid Sans", sans-serif;
	    font-size: 13px;
	    font-weight: 400;
	    line-height: 1.471;
	}
</style>
</head>

<body>
	<!-- ============================================================== -->
	<!-- Preloader - style you can find in spinners.css -->
	<!-- ============================================================== -->
	<div class="preloader">
		<div class="lds-ripple">
			<div class="lds-pos"></div>
			<div class="lds-pos"></div>
		</div>
	</div>
	<!-- ============================================================== -->
	<!-- Main wrapper - style you can find in pages.scss -->
	<!-- ============================================================== -->
	<div id="main-wrapper" data-navbarbg="skin6" data-theme="light"
		data-layout="vertical" data-sidebartype="full"
		data-boxed-layout="full">
		<!-- ============================================================== -->
		<!-- Topbar header - style you can find in pages.scss -->
		<!-- ============================================================== -->
		<header class="topbar" data-navbarbg="skin6">
			<nav class="navbar top-navbar navbar-expand-md navbar-light">
				<div class="navbar-header" data-logobg="skin5">
					<!-- This is for the sidebar toggle which is visible on mobile only -->
					<a class="nav-toggler waves-effect waves-light d-block d-md-none"
						href="javascript:void(0)"> <i class="ti-menu ti-close"></i>
					</a>
					<!-- ============================================================== -->
					<!-- Logo -->
					<!-- ============================================================== -->
					<div class="navbar-brand">
						<a href="index.html" class="logo"> <!-- Logo icon --> <b
							class="logo-icon"> <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
								<!-- Dark Logo icon --> <img src="static/admin/assets/images/logo-icon.png"
								alt="homepage" class="dark-logo" /> <!-- Light Logo icon --> <img
								src="static/admin/assets/images/logo-light-icon.png" alt="homepage"
								class="light-logo" />
						</b> <!--End Logo icon --> <!-- Logo text --> <span class="logo-text">
								<!-- dark Logo text --> <img src="static/admin/assets/images/logo-text.png"
								alt="homepage" class="dark-logo" /> <!-- Light Logo text --> <img
								src="static/admin/assets/images/logo-light-text.png" class="light-logo"
								alt="homepage" />
						</span>
						</a>
					</div>
					<!-- ============================================================== -->
					<!-- End Logo -->
					<!-- ============================================================== -->
					<!-- ============================================================== -->
					<!-- Toggle which is visible on mobile only -->
					<!-- ============================================================== -->
					<a class="topbartoggler d-block d-md-none waves-effect waves-light"
						href="javascript:void(0)" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation"> <i class="ti-more"></i>
					</a>
				</div>
				<!-- ============================================================== -->
				<!-- End Logo -->
				<!-- ============================================================== -->
				<div class="navbar-collapse collapse" id="navbarSupportedContent"
					data-navbarbg="skin6">
					<!-- ============================================================== -->
					<!-- toggle and nav items -->
					<!-- ============================================================== -->
					<ul class="navbar-nav float-left mr-auto">
						<!-- ============================================================== -->
						<!-- Search -->
						<!-- ============================================================== -->
						<li class="nav-item search-box"><a
							class="nav-link waves-effect waves-dark"
							href="javascript:void(0)">
								<div class="d-flex align-items-center">
									<i class="mdi mdi-magnify font-20 mr-1"></i>
									<div class="ml-1 d-none d-sm-block">
										<span>Search</span>
									</div>
								</div>
						</a>
							<form class="app-search position-absolute">
								<input type="text" class="form-control"
									placeholder="Search &amp; enter"> <a class="srh-btn">
									<i class="ti-close"></i>
								</a>
							</form></li>
					</ul>
					<!-- ============================================================== -->
					<!-- Right side toggle and nav items -->
					<!-- ============================================================== -->
					<ul class="navbar-nav float-right">
						<!-- ============================================================== -->
						<!-- User profile and search -->
						<!-- ============================================================== -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle text-muted waves-effect waves-dark pro-pic"
							href="" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"><img
								src="static/admin/assets/images/users/1.jpg" alt="user"
								class="rounded-circle" width="31"></a>
							<div class="dropdown-menu dropdown-menu-right user-dd animated">
								<a class="dropdown-item" href="javascript:void(0)"><i
									class="ti-user m-r-5 m-l-5"></i> My Profile</a> <a
									class="dropdown-item" href="javascript:void(0)"><i
									class="ti-wallet m-r-5 m-l-5"></i> My Balance</a> <a
									class="dropdown-item" href="javascript:void(0)"><i
									class="ti-email m-r-5 m-l-5"></i> Inbox</a>
							</div></li>
						<!-- ============================================================== -->
						<!-- User profile and search -->
						<!-- ============================================================== -->
					</ul>
				</div>
			</nav>
		</header>
		<!-- ============================================================== -->
		<!-- End Topbar header -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<aside class="left-sidebar" data-sidebarbg="skin5">
            <!-- Sidebar scroll-->
            <div class="scroll-sidebar">
                <!-- Sidebar navigation-->
                <nav class="sidebar-nav">
                    <ul id="sidebarnav">
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="index.html" aria-expanded="false">
                                <i class="mdi mdi-av-timer"></i>
                                <span class="hide-menu">Thống kê</span>
                            </a>
                        </li>
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="pages-profile.html" aria-expanded="false">
                                <i class="mdi mdi-account-network"></i>
                                <span class="hide-menu">Sản phẩm</span>
                            </a>
                        </li>
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="form-basic.html" aria-expanded="false">
                                <i class="mdi mdi-arrange-bring-forward"></i>
                                <span class="hide-menu">Hóa đơn</span>
                            </a>
                        </li>
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="table-basic.html" aria-expanded="false">
                                <i class="mdi mdi-border-none"></i>
                                <span class="hide-menu">Tín tức</span>
                            </a>
                        </li>
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="icon-material.html" aria-expanded="false">
                                <i class="mdi mdi-face"></i>
                                <span class="hide-menu">Moderator</span>
                            </a>
                        </li>
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="starter-kit.html" aria-expanded="false">
                                <i class="mdi mdi-file"></i>
                                <span class="hide-menu">Khách hàng</span>
                            </a>
                        </li>
                        <li class="sidebar-item">
                            <a class="sidebar-link waves-effect waves-dark sidebar-link" href="error-404.html" aria-expanded="false">
                                <i class="mdi mdi-alert-outline"></i>
                                <span class="hide-menu">Đăng xuất</span>
                            </a>
                        </li>
                    </ul>
                </nav>
                <!-- End Sidebar navigation -->
            </div>
            <!-- End Sidebar scroll-->
        </aside>
		<!-- ============================================================== -->
		<!-- End Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page wrapper  -->
		<!-- ============================================================== -->
		<div class="page-wrapper">
			<!-- ============================================================== -->
			<!-- Bread crumb and right sidebar toggle -->
			<!-- ============================================================== -->
			<div class="page-breadcrumb">
				<div class="row">
					<div class="col-5 align-self-center">
						<h4 class="page-title">Viết bài đăng tin</h4>
					</div>
					<div class="col-7 align-self-center">
						<div class="d-flex align-items-center justify-content-end">
							<nav aria-label="breadcrumb">
								<ol class="breadcrumb">
									<li class="breadcrumb-item"><a href="#">Home</a></li>
									<li class="breadcrumb-item active" aria-current="page">Đăng tin</li>
								</ol>
							</nav>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-12 col-md-offset-0">
				<form action="/admin/editNews" method="POST"
					enctype="multipart/form-data">
					<div class="">
						<input type="hidden" name="id" />
					</div>
					<label>Tiêu đề</label> <input value = "MOCHI – Ý TƯỞNG THIẾT KẾ CHUỖI CỬA HÀNG BÁNH NHẬT ĐỘC ĐÁO" style = "border-radius: 5px;" class = "form-control" type="text" name="title" /> <br>
					<label>Nội dung</label>
					<textarea class="ckeditor" id="editor" name="content" cols="80"
						rows="10">Thiết kế cửa hàng Nhật,  món ăn Nhật dường như không còn xa lạ với mọi người, nhất là đối với những ai đã, đang và sẽ kinh doanh cửa hàng, tiệm bánh.  Có khá nhiều phong cách thiết kế nội thất cửa hàng như phong cách thiết kế hiện đại, phong cách cổ điển…nhưng có thể thấy nhà hàng, cửa hàng kiểu nhật đang khá được ưa chuộng trên thị trường khi mà càng ngày càng xuất hiện nhiều dạng chuỗi hệ thống thương hiệu bánh, nhượng quyền. Hãy cùng Starlight tìm hiểu về không gian nội thất cửa hàng mochi – ý tưởng thiết kế chuỗi cửa hàng bánh nhật độc đáo trong bài chia sẻ dưới đây.<br>
						June
19
2018
207
0
MOCHI – Ý TƯỞNG THIẾT KẾ CHUỖI CỬA HÀNG BÁNH NHẬT ĐỘC ĐÁO
By OanhIn STARLIGHT, THI CÔNG NỘI THẤT, THIẾT KẾ NỘI THẤT, THIẾT KẾ NỘI THẤT NHÀ HÀNG
MOCHI – Ý TƯỞNG THIẾT KẾ CHUỖI CỬA HÀNG BÁNH NHẬT ĐỘC ĐÁO
Thiết kế cửa hàng Nhật,  món ăn Nhật dường như không còn xa lạ với mọi người, nhất là đối với những ai đã, đang và sẽ kinh doanh cửa hàng, tiệm bánh.  Có khá nhiều phong cách thiết kế nội thất cửa hàng như phong cách thiết kế hiện đại, phong cách cổ điển…nhưng có thể thấy nhà hàng, cửa hàng kiểu nhật đang khá được ưa chuộng trên thị trường khi mà càng ngày càng xuất hiện nhiều dạng chuỗi hệ thống thương hiệu bánh, nhượng quyền. Hãy cùng Starlight tìm hiểu về không gian nội thất cửa hàng mochi – ý tưởng thiết kế chuỗi cửa hàng bánh nhật độc đáo trong bài chia sẻ dưới đây.

mochi-y-tuong-thiet-ke-chuoi-cua-hang-banh-doc-dao

Mochi là thương hiệu bánh nhật khá nổi tiếng trên thị trường với sự phát triển về thương hiệu và thị phần, chuỗi cửa hàng ngày càng mở rộng trong các trung tâm thương mại lớn, trong các khu đô thị, trên các tuyến phố lớn tại Việt Nam. Mochi Sweet tại Vạn Hạnh Mall Hồ Chí Minh được thiết kế và thi công nhanh chóng chính xác bởi Starlight.<br>
Thương hiệu bánh nhật không chỉ được nhắc đến với sản phẩm của chính họ mà còn ấn tượng với khách hàng bởi không gian nội thất được thiết kế hiện đại, độc đáo.<br>

	
					</textarea>
					<br> 
					<span>File đính kèm : </span>
					<input type = "file"/>
					<br><br><br>
					<!-- <button class = "btn btn-primary" type="submit">Sửa tin tức</button> -->
					<button class = "btn btn-primary" type="submit">Sửa tin tức</button>
					 <br> <br>
				</form>

			</div>
		</div>
		<!-- ============================================================== -->
		<!-- End Page wrapper  -->
		<!-- ============================================================== -->
	</div>
	<!-- ============================================================== -->
	<!-- End Wrapper -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- All Jquery -->
	<!-- ============================================================== -->
	<script src="static/admin/assets/libs/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap tether Core JavaScript -->
	<script src="static/admin/assets/libs/popper.js/dist/umd/popper.min.js"></script>
	<script
		src="static/admin/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- slimscrollbar scrollbar JavaScript -->
	<script src="static/admin/assets/extra-libs/sparkline/sparkline.js"></script>
	<!--Wave Effects -->
	<script src="static/admin/dist/js/waves.js"></script>
	<!--Menu sidebar -->
	<script src="static/admin/dist/js/sidebarmenu.js"></script>
	<!--Custom JavaScript -->
	<script src="static/admin/dist/js/custom.min.js"></script>

	<!-- chỗ này add js biểu đô -->
	<!-- jQuery -->
	<script src="vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="vendors/nprogress/nprogress.js"></script>
	<!-- Chart.js -->
	<script src="vendors/Chart.js/dist/Chart.min.js"></script>

	<script>
		CKEDITOR.replace("editor");
	</script>

	<!-- Custom Theme Scripts -->
	<script src="build/js/custom.min.js"></script>

	<!-- Chart.js -->
	<script>
		/*Chart.defaults.global.legend = {
		  enabled: false
		};*/

		// Line chart
		var ctx = document.getElementById("lineChart");
		var lineChart = new Chart(ctx, {
			type : 'line',
			data : {
				labels : [ "January", "February", "March", "April", "May",
						"June", "July" ],
				datasets : [ {
					label : "số lượng sản phẩm",
					backgroundColor : "rgba(38, 185, 154, 0.31)",
					borderColor : "rgba(38, 185, 154, 0.7)",
					pointBorderColor : "rgba(38, 185, 154, 0.7)",
					pointBackgroundColor : "rgba(38, 185, 154, 0.7)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(22,22,22,1)",
					pointBorderWidth : 3,
					data : [ 50, 50, 50, 39, 20, 85, 7 ]
				}, {
					label : "số lượng hóa đơn",
					backgroundColor : "rgba(3, 88, 106, 0.3)",
					borderColor : "rgba(3, 88, 106, 0.70)",
					pointBorderColor : "rgba(3, 88, 106, 0.70)",
					pointBackgroundColor : "rgba(3, 88, 106, 0.70)",
					pointHoverBackgroundColor : "#fff",
					pointHoverBorderColor : "rgba(151,187,205,1)",
					pointBorderWidth : 1,
					data : [ 82, 23, 66, 9, 99, 4, 2 ]
				} ]
			},
		});

		// Bar chart
		var ctx = document.getElementById("mybarChart");
		var mybarChart = new Chart(ctx, {
			type : 'bar',
			data : {
				labels : [ "January", "February", "March", "April", "May",
						"June", "July" ],
				datasets : [ {
					label : 'Yes - of Votes',
					backgroundColor : "#26B99A",
					data : [ 51, 30, 40, 28, 92, 50, 45 ]
				}, {
					label : 'No - of Votes',
					backgroundColor : "#03586A",
					data : [ 41, 56, 25, 48, 72, 34, 12 ]
				} ]
			},

			options : {
				scales : {
					yAxes : [ {
						ticks : {
							beginAtZero : true
						}
					} ]
				}
			}
		});

		// Doughnut chart
		var ctx = document.getElementById("canvasDoughnut");
		var data = {
			labels : [ "Dark Grey", "Purple Color", "Gray Color",
					"Green Color", "Blue Color" ],
			datasets : [ {
				data : [ 120, 50, 140, 180, 100 ],
				backgroundColor : [ "#455C73", "#9B59B6", "#BDC3C7", "#26B99A",
						"#3498DB" ],
				hoverBackgroundColor : [ "#34495E", "#B370CF", "#CFD4D8",
						"#36CAAB", "#49A9EA" ]

			} ]
		};

		var canvasDoughnut = new Chart(ctx, {
			type : 'doughnut',
			tooltipFillColor : "rgba(51, 51, 51, 0.55)",
			data : data
		});

		// Radar chart
		var ctx = document.getElementById("canvasRadar");
		var data = {
			labels : [ "Eating", "Drinking", "Sleeping", "Designing", "Coding",
					"Cycling", "Running" ],
			datasets : [ {
				label : "My First dataset",
				backgroundColor : "rgba(3, 88, 106, 0.2)",
				borderColor : "rgba(3, 88, 106, 0.80)",
				pointBorderColor : "rgba(3, 88, 106, 0.80)",
				pointBackgroundColor : "rgba(3, 88, 106, 0.80)",
				pointHoverBackgroundColor : "#fff",
				pointHoverBorderColor : "rgba(220,220,220,1)",
				data : [ 65, 59, 90, 81, 56, 55, 40 ]
			}, {
				label : "My Second dataset",
				backgroundColor : "rgba(38, 185, 154, 0.2)",
				borderColor : "rgba(38, 185, 154, 0.85)",
				pointColor : "rgba(38, 185, 154, 0.85)",
				pointStrokeColor : "#fff",
				pointHighlightFill : "#fff",
				pointHighlightStroke : "rgba(151,187,205,1)",
				data : [ 28, 48, 40, 19, 96, 27, 100 ]
			} ]
		};

		var canvasRadar = new Chart(ctx, {
			type : 'radar',
			data : data,
		});

		// Pie chart
		var ctx = document.getElementById("pieChart");
		var data = {
			datasets : [ {
				data : [ 120, 50, 140, 180, 100 ],
				backgroundColor : [ "#455C73", "#9B59B6", "#BDC3C7", "#26B99A",
						"#3498DB" ],
				label : 'My dataset' // for legend
			} ],
			labels : [ "Dark Gray", "Purple", "Gray", "Green", "Blue" ]
		};

		var pieChart = new Chart(ctx, {
			data : data,
			type : 'pie'/*,
															        options: {
															          legend: false
															        }*/
		});

		// PolarArea chart
		var ctx = document.getElementById("polarArea");
		var data = {
			datasets : [ {
				data : [ 120, 50, 140, 180, 100 ],
				backgroundColor : [ "#455C73", "#9B59B6", "#BDC3C7", "#26B99A",
						"#3498DB" ],
				label : 'My dataset'
			} ],
			labels : [ "Dark Gray", "Purple", "Gray", "Green", "Blue" ]
		};

		var polarArea = new Chart(ctx, {
			data : data,
			type : 'polarArea',
			options : {
				scale : {
					ticks : {
						beginAtZero : true
					}
				}
			}
		});
	</script>
	<!-- chỗ này add js biểu đô -->



</body>

</html>
