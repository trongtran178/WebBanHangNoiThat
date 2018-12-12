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
<script type="text/javascript" src="static/ckeditor/samples/js/sample.js"></script>
<script type="text/javascript" src="static/ckeditor/samples/css/sample.css"></script>
<link rel="stylesheet" href="toolbarconfigurator/lib/codemirror/neo.css">
<meta name="description" content="">
<meta name="author" content="">
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="../../assets/images/favicon.png">
<title>Trang thêm tin tức</title>
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

.Choicefile {
	display: block;
	background: #0877D8;
	border: 1px solid #fff;
	color: #fff;
	width: 100px;
	text-align: center;
	text-decoration: none;
	cursor: pointer;
	padding: 5px 0px;
}

#imageFile, .removeimg {
	display: none;
}

#thumbbox {
	position: relative;
	width: 100px;
}

.removeimg {
	background:
		url("http://png-3.findicons.com/files/icons/2181/34al_volume_3_2_se/24/001_05.png")
		repeat scroll 0 0 transparent;
	height: 24px;
	position: absolute;
	right: 5px;
	top: 5px;
	width: 24px;
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
				<form action="addnews" method="POST"
					enctype="multipart/form-data">
					<div class="">
						<input type="hidden" name="id" />
					</div>
					<label>Tiêu đề</label> <input placeholder = "Tiêu đề phải lớn hơn 20 kí tự" style = "border-radius: 5px;" class = "form-control" type="text" name="tieuDe" id = "tieuDe" /> <br>
					<label>Nội dung</label>
					<textarea class="ckeditor" id="editor" name="noiDung" cols="80"
						rows="10"></textarea>
					<br> 
					<span>Hình đại diện : </span>
					
						<div id="myfileupload">
							<input type="file" id="imageFile" name="imageFile"
								accept="image/*" onchange="readURL(this);" />
						</div>
						<div id="thumbbox">
							<img height="300" width="300" alt="Thumb image" id="thumbimage"
								style="display: none" /> <a class="removeimg"
								href="javascript:"></a>
						</div>
						<div id="boxchoice">
							<a href="javascript:" class="Choicefile">Chọn file</a>
							<p style="clear: both"></p>
						</div>
						<label class="filename"></label>
					
					<br><br><br>
					<!-- <button class = "btn btn-primary" type="submit">Sửa tin tức</button> -->
					<button class = "btn btn-primary" type="submit">Thêm tin tức</button>
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
		initSample();
	</script>

	<!-- Custom Theme Scripts -->
	<script src="build/js/custom.min.js"></script>
	
	<!-- //Xử lý xem ảnh trước -->
	<script type="text/javascript">
		function  readURL(input,thumbimage) {
		   if  (input.files && input.files[0]) { //Sử dụng  cho Firefox - chrome
		   	var  reader = new FileReader();
		   	reader.onload = function (e) {
		   		$("#thumbimage").attr('src', e.target.result);
		   	}
		   	reader.readAsDataURL(input.files[0]);
		   }
		    else  { // Sử dụng cho IE
		    	$("#thumbimage").attr('src', input.value);

		    }
		    $("#thumbimage").show();
		    $('.filename').text($("#imageFile").val());
		    $('.Choicefile').css('background', '#C4C4C4');
		    $('.Choicefile').css('cursor', 'default');
		    $(".removeimg").show();
		    $(".Choicefile").unbind('click'); //Xóa sự kiện  click trên nút .Choicefile

		}
		$(document).ready(function () {
		   $(".Choicefile").bind('click', function  () { //Chọn file khi .Choicefile Click
		   	$("#imageFile").click();

		   });
		   $(".removeimg").click(function () {//Xóa hình  ảnh đang xem
			 document.getElementById("imageFile").value = null;
			 $("#imageFile").val(null);

		   	$("#thumbimage").attr('src', '').hide();
		   	$("#myfileupload").html('<input type="file" id="imageFile" name = "imageFile" onchange="readURL(this);" />');
		   	$(".removeimg").hide();
		      $(".Choicefile").bind('click', function  () {//Tạo lại sự kiện click để chọn file
		      	$("#imageFile").click();
		      });
		      $('.Choicefile').css('background','#0877D8');
		      $('.Choicefile').css('cursor', 'pointer');
		      $(".filename").text("");
		      //this.formChonHinh.reset();
		  });
		})		

	</script>	



</body>

</html>
