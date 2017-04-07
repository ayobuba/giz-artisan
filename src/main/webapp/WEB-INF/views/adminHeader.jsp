
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href=" <spring:url value="/resources/admin/assets/css/maps/jquery-jvectormap-2.0.1.css"/>">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet" />
    <link href="<spring:url value="/resources/admin/assets/css/floatexamples.css"/>" rel="stylesheet" type="text/css" />

    <script src="<spring:url value="/resources/admin/assets/js/jquery.min.js"/>"></script>
    <script src="<spring:url value="/resources/admin/assets/js/nprogress.js"/>"></script>
    <script>
        NProgress.start();
    </script>
    
    <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>


<body class="nav-md">

    <div class="container body">


        <div class="main_container">

            <div class="col-md-3 left_col">
                <div class="left_col scroll-view">

                    <div class="navbar nav_title" style="border: 0;">
                        <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>AJC!</span></a>
                    </div>
                    <div class="clearfix"></div>

                    <!-- menu prile quick info -->
                    <div class="profile">
                        <div class="profile_pic">
                            <img src="images/img.jpg" alt="..." class="img-circle profile_img">
                        </div>
                        <div class="profile_info">
                            <span>Welcome,</span>
                            <h2>${admin.admin.bioData.lastName },${admin.admin.bioData.firstName }</h2>
                        </div>
                    </div>
                    <!-- /menu prile quick info -->

                    <br />

                    <!-- sidebar menu -->
                    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">

                        <div class="menu_section">
                            <h3>General</h3>
                            <ul class="nav side-menu">
                                
                                <li><a><i class="fa fa-users"></i> Manage Admin <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/admin/add"/>">Create Admin</a>
                                        </li>
                                        <li><a href="<spring:url value="/admin/view"/>">Manage Admin</a>
                                        </li>
                                       
                                    </ul>
                                </li>
                                </li>
                                <li><a><i class="fa fa-edit"></i> Manage Skill <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/skill/manage"/>">Manage Skill</a>
                                        </li>
                                                                                
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-edit"></i> Manage Client Request <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/service/allrequest"/>">All Requests</a>
                                        </li>

                                         <li><a href="<spring:url value="/service/pending-request"/>">Pending Request</a>
                                        </li>
                                        
                                        <li><a href="<spring:url value="/service/approved-request"/>">Approved Request</a>
                                        </li>

                                        
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-users"></i> Manage Experts <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                    
                                        <li><a href="<spring:url value="/experts/manage"/>">Manage Experts</a>
                                        </li>
                                        
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-users"></i> Manage Clients <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/client/manage/individuals"/>">Individuals</a></li>
                                        <li><a href="<spring:url value="/client/manage/organizations"/>">Organisations</a></li>
                                        
                                        
                                    </ul>
                                </li>
                               
                                <li><a><i class="fa fa-users"></i> Manage Absorption <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/enrol/manage/enrolments"/>">Manage Enrolments</a>
                                        </li>
                                        <li><a href="<spring:url value="/enrol/manage/interviewees"/>">Manage Interviewees</a>
                                        </li>
                                        
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-users"></i> Manage News <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/newsupdate/post"/>">Manage News</a>
                                        </li>
                                        
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-users"></i> Manage Images <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/gallery/news"/>">Manage News Images </a></li>
                                        <li><a href="<spring:url value="/gallery/gallery"/>">Manage Gallery Images</a></li>
                                        <li><a href="<spring:url value="/gallery/experts"/>">Manage Experts Images</a></li>
                                        
                                        
                                    </ul>
                                </li>
                                <li><a><i class="fa fa-users"></i> Manage Albums <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="<spring:url value="/album/manage/news"/>">Manage News Albums</a></li>
                                        <li><a href="<spring:url value="/album/manage/gallery"/>">Manage Gallery Albums</a></li>    
                                        
                                    </ul>
                                </li>
                                
                            </ul>
                        </div>
                        

                    </div>
                    <!-- /sidebar menu -->

                    <!-- /menu footer buttons -->
                    <div class="sidebar-footer hidden-small">
                        <!-- <a data-toggle="tooltip" data-placement="top" title="Settings">
                            <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                        </a> -->
                        <!-- <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                            <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                        </a>
                        <a data-toggle="tooltip" data-placement="top" title="Lock">
                            <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                        </a> -->
                        <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                            <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                        </a>
                    </div>
                    <!-- /menu footer buttons -->
                </div>
            </div>

            <!-- top navigation -->
            <div class="top_nav">

                <div class="nav_menu">
                    <nav class="" role="navigation">
                        <div class="nav toggle">
                            <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                        </div>

                        <ul class="nav navbar-nav navbar-right">
                            <li class="">
                                <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                    <img src="images/img.jpg" alt="">${admin.admin.bioData.lastName },${admin.admin.bioData.firstName }
                                    <span class=" fa fa-angle-down"></span>
                                </a>
                                <ul class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
                                    <li><a href="adminProfile.html">  Profile</a>
                                    </li>
                                    
                                    
                                    <li><a href="<spring:url value="/admin/logout"/>"><i class="fa fa-sign-out pull-right"></i> Log Out</a>
                                    </li>
                                </ul>
                            </li>

                           
                        </ul>
                    </nav>
                </div>

            </div>
            <!-- /top navigation -->