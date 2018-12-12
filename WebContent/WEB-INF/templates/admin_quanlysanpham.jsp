<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html dir="ltr" lang="en">
    
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="static/admin/assets/images/favicon.png">
        <title>Nice admin Template - The Ultimate Multipurpose admin template</title>
        <!-- Custom CSS -->
        <link href="static/admin/dist/css/style.min.css" rel="stylesheet">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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
        <div id="main-wrapper" data-navbarbg="skin6" data-theme="light" data-layout="vertical" data-sidebartype="full" data-boxed-layout="full">
            <!-- ============================================================== -->
            <!-- Topbar header - style you can find in pages.scss -->
            <!-- ============================================================== -->
            <header class="topbar" data-navbarbg="skin6">
                <nav class="navbar top-navbar navbar-expand-md navbar-light">
                    <div class="navbar-header" data-logobg="skin5">
                        <!-- This is for the sidebar toggle which is visible on mobile only -->
                        <a class="nav-toggler waves-effect waves-light d-block d-md-none" href="javascript:void(0)">
                            <i class="ti-menu ti-close"></i>
                        </a>
                        <!-- ============================================================== -->
                        <!-- Logo -->
                        <!-- ============================================================== -->
                        <div class="navbar-brand">
                            <a href="index.html" class="logo">
                                <!-- Logo icon -->
                                <b class="logo-icon">
                                    <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
                                    <!-- Dark Logo icon -->
                                    <img src="static/admin/assets/images/logo-icon.png" alt="homepage" class="dark-logo" />
                                    <!-- Light Logo icon -->
                                    <img src="static/admin/assets/images/logo-light-icon.png" alt="homepage" class="light-logo" />
                                </b>
                                <!--End Logo icon -->
                                <!-- Logo text -->
                                <span class="logo-text">
                                    <!-- dark Logo text -->
                                    <img src="static/admin/assets/images/logo-text.png" alt="homepage" class="dark-logo" />
                                    <!-- Light Logo text -->
                                    <img src="static/admin/assets/images/logo-light-text.png" class="light-logo" alt="homepage" />
                                </span>
                            </a>
                        </div>
                        <!-- ============================================================== -->
                        <!-- End Logo -->
                        <!-- ============================================================== -->
                        <!-- ============================================================== -->
                        <!-- Toggle which is visible on mobile only -->
                        <!-- ============================================================== -->
                        <a class="topbartoggler d-block d-md-none waves-effect waves-light" href="javascript:void(0)" data-toggle="collapse" data-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="ti-more"></i>
                        </a>
                    </div>
                    <!-- ============================================================== -->
                    <!-- End Logo -->
                    <!-- ============================================================== -->
                    <div class="navbar-collapse collapse" id="navbarSupportedContent" data-navbarbg="skin6">
                        <!-- ============================================================== -->
                        <!-- toggle and nav items -->
                        <!-- ============================================================== -->
                        <ul class="navbar-nav float-left mr-auto">
                            <!-- ============================================================== -->
                            <!-- Search -->
                            <!-- ============================================================== -->
                            <li class="nav-item search-box">
                                <a class="nav-link waves-effect waves-dark" href="javascript:void(0)">
                                    <div class="d-flex align-items-center">
                                        <i class="mdi mdi-magnify font-20 mr-1"></i>
                                        <div class="ml-1 d-none d-sm-block">
                                            <span>Search</span>
                                        </div>
                                    </div>
                                </a>
                                <form class="app-search position-absolute">
                                    <input type="text" class="form-control" placeholder="Search &amp; enter">
                                    <a class="srh-btn">
                                        <i class="ti-close"></i>
                                    </a>
                                </form>
                            </li>
                        </ul>
                        <!-- ============================================================== -->
                        <!-- Right side toggle and nav items -->
                        <!-- ============================================================== -->
                        <ul class="navbar-nav float-right">
                            <!-- ============================================================== -->
                            <!-- User profile and search -->
                            <!-- ============================================================== -->
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-muted waves-effect waves-dark pro-pic" href="" data-toggle="dropdown" aria-haspopup="true"
                                    aria-expanded="false">
                                    <img src="static/admin/assets/images/users/1.jpg" alt="user" class="rounded-circle" width="31">
                                </a>
                                <div class="dropdown-menu dropdown-menu-right user-dd animated">
                                    <a class="dropdown-item" href="javascript:void(0)">
                                        <i class="ti-user m-r-5 m-l-5"></i> My Profile</a>
                                    <a class="dropdown-item" href="javascript:void(0)">
                                        <i class="ti-wallet m-r-5 m-l-5"></i> My Balance</a>
                                    <a class="dropdown-item" href="javascript:void(0)">
                                        <i class="ti-email m-r-5 m-l-5"></i> Inbox</a>
                                </div>
                            </li>
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
            <jsp:include page="_admin_pageleft.jsp"></jsp:include>
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
                            <h4 class="page-title">Quản lý sản phẩm</h4>
                        </div>
                        <div class="col-7 align-self-center">
                            <div class="d-flex align-items-center justify-content-end">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item">
                                            <a href="#">Home</a>
                                        </li>
                                        <li class="breadcrumb-item active" aria-current="page">Danh sách sản phẩm</li>
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- End Bread crumb and right sidebar toggle -->
                <!-- ============================================================== -->
                <!-- ============================================================== -->
                <!-- Container fluid  -->
                <!-- ============================================================== -->
                <div class="container-fluid">
                    <!-- ============================================================== -->
                    <!-- Start Page Content -->
                    <!-- ============================================================== -->
                    <div class="row">
                        <!-- Quản lý hóa đơn -->
                        <div class="col-12">
                            <h2>Danh sách sản phẩm</h2>
    
                            <div class="card">
                                <div class="table-responsive m-t-20">
                                    <table class="table table-bordered table-responsive-lg table-striped table-hover">
                                        <thead>
                                            <tr>
                                                <th scope="col">STT</th>
                                                <th scope="col">Mã SP</th>
                                                <th scope="col">Tên sản phẩm</th>
                                                <th scope="col">Giá</th>
                                                <th scope="col">Phân loại</th>
                                                <th scope="col">Mô tả</th>
                                                <th scope="col">Khuyến mãi</th>
                                                <th scope="col">Cao</th>
                                                <th scope="col">Dài</th>
                                                <th scope="col">Rộng</th>
                                                <th scope="col">Chất liệu</th>
                                                <th scope="col">Xuất xứ</th>
                                                <th scope="col">Màu Sắc</th>
                                                <th scope="col">Hình ảnh</th>
                                                <th scope="col">SL đã bán</th>
                                                <th scope="col">Ngày nhập</th>
                                                <th scope="col">Đang hoạt động</th>
                                                <th scope="col">Xóa</th>
                                                <th scope="col">Sửa</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>SP0001</td>
                                                <td>Bàn gỗ</td>
                                                <td>3.400.000 đ</td>
                                                <td>Nhà bếp</td>
                                                <td>Bền đẹp sử dụng được lâu</td>
                                                <td>sale 50%</td>
                                                <td>1,2 m</td>
                                                <td>2 m</td>
                                                <td>1,5m</td>
                                                <td>Gỗ</td>
                                                <td>Tây Nguyên</td>
                                                <td>Màu xám</td>
                                                <td></td>
                                                <td>4</td>
                                                <td>20/10/2018</td>
                                                <td>True</td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Xóa</button></td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Sửa</button></td>
                                            </tr>
                                            <tr>
                                                <th scope="row">2</th>
                                                <td>SP0002</td>
                                                <td>Bàn gỗ</td>
                                                <td>3.400.000 đ</td>
                                                <td>Nhà bếp</td>
                                                <td>Bền đẹp sử dụng được lâu</td>
                                                <td>sale 50%</td>
                                                <td>1,2 m</td>
                                                <td>2 m</td>
                                                <td>1,5m</td>
                                                <td>Gỗ</td>
                                                <td>Tây Nguyên</td>
                                                <td>Màu xám</td>
                                                <td></td>
                                                <td>4</td>
                                                <td>20/10/2018</td>
                                                <td>True</td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Xóa</button></td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Sửa</button></td>
                                            </tr>
                                            <tr>
                                                <th scope="row">3</th>
                                                <td>SP0003</td>
                                                <td>Bàn gỗ</td>
                                                <td>3.400.000 đ</td>
                                                <td>Nhà bếp</td>
                                                <td>Bền đẹp sử dụng được lâu</td>
                                                <td>sale 50%</td>
                                                <td>1,2 m</td>
                                                <td>2 m</td>
                                                <td>1,5m</td>
                                                <td>Gỗ</td>
                                                <td>Tây Nguyên</td>
                                                <td>Màu xám</td>
                                                <td></td>
                                                <td>4</td>
                                                <td>20/10/2018</td>
                                                <td>True</td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Xóa</button></td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Sửa</button></td>
                                            </tr>
                                            <tr>
                                            	<th scope="row">4</th>
                                                <td>SP0004</td>
                                                <td>Bàn gỗ</td>
                                                <td>3.400.000 đ</td>
                                                <td>Nhà bếp</td>
                                                <td>Bền đẹp sử dụng được lâu</td>
                                                <td>sale 50%</td>
                                                <td>1,2 m</td>
                                                <td>2 m</td>
                                                <td>1,5m</td>
                                                <td>Gỗ</td>
                                                <td>Tây Nguyên</td>
                                                <td>Màu xám</td>
                                                <td></td>
                                                <td>4</td>
                                                <td>20/10/2018</td>
                                                <td>True</td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Xóa</button></td>
                                                <td style="text-align: center;"><button class = "btn btn-danger">Sửa</button></td>
                                                </tr>
                                        </tbody>
                                    </table>
                                    <td style="text-align: center;"><button class = "btn btn-danger">Thêm</button></td>
                                </div>
                            </div>
                        </div>
    
                        <!-- Quản lý chi tiết hóa đơn -->
    
                           
                        <!-- <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Breakpoint Specific</h4>
                                    <h6 class="card-subtitle">Use <code>.table-responsive{-sm|-md|-lg|-xl}</code> as needed to create responsive tables up to a particular breakpoint. From that breakpoint and up, the table will behave normally and not scroll horizontally.</h6>
                                    <div class="table-responsive-sm">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="table-responsive-md">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="table-responsive-lg">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="table-responsive-xl">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> -->
    
                        <!-- ============================================================== -->
                        <!-- End PAge Content -->
                        <!-- ============================================================== -->
                        <!-- ============================================================== -->
                        <!-- Right sidebar -->
                        <!-- ============================================================== -->
                        <!-- .right-sidebar -->
                        <!-- ============================================================== -->
                        <!-- End Right sidebar -->
                        <!-- ============================================================== -->
                    </div>
                    <!-- ============================================================== -->
                    <!-- End Container fluid  -->
                    <!-- ============================================================== -->
                    <!-- ============================================================== -->
                    <!-- footer -->
                    <!-- ============================================================== -->
                    <footer class="footer text-center">
                        All Rights Reserved by Nice admin. Designed and Developed by
                        <a href="https://wrappixel.com">WrapPixel</a>.
                    </footer>
                    <!-- ============================================================== -->
                    <!-- End footer -->
                    <!-- ============================================================== -->
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
            <script src="static/admin/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
            <!-- slimscrollbar scrollbar JavaScript -->
            <script src="static/admin/assets/extra-libs/sparkline/sparkline.js"></script>
            <!--Wave Effects -->
            <script src="static/admin/dist/js/waves.js"></script>
            <!--Menu sidebar -->
            <script src="static/admin/dist/js/sidebarmenu.js"></script>
            <!--Custom JavaScript -->
            <script src="static/admin/dist/js/custom.min.js"></script>
    </body>
    
    </html>