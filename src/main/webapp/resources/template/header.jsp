<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
</head>


<body class="hero-content-dark footer-dark">

<div class="page-wrapper">
    <div class="header-wrapper">
    <div class="header">
        <div class="header-top">
            <div class="container">
                <div class="header-brand">
                    <div class="header-logo">
                        <a href="index">
                            <i class=""><img src="assets/images/gizImages/logo.png"></i>
                            <span class="header-logo-text">ARTISANS JOB CENTRE<span class="header-logo-highlight"><br> The Creative Team
                        </a>
                    </div><!-- /.header-logo-->

                    <div class="header-slogan">
                        <span class="header-slogan-slash">/</span>
                        <span class="header-slogan-text">…construction services redefined</span>
                    </div><!-- /.header-slogan-->
                </div><!-- /.header-brand -->

                <ul class="header-actions nav nav-pills">
                    <li><a href="login"></a></li>
                    <li><a href="clientRegistration"></a></li>
                    <li><a href="hireArtisan" class="primary">Hire an artisan</a></li>
                </ul><!-- /.header-actions -->
 
                <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target=".header-nav">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div><!-- /.container -->
        </div><!-- /.header-top -->

        <div class="header-bottom">
            <div class="container">
                <ul class="header-nav nav nav-pills collapse">
                    <li class="active">
                        <a href="index">Home</a>
                    </li>

                    <li >
                        <a href="#">Artisan Job Center<i class="fa fa-chevron-down"></i></a>

                        <ul class="sub-menu">
                           
                            <li><a href="companyProfile">Our Profile</a></li>
                            <li><a href="skills">Our Skills</a></li>
                        
                        </ul>
                    </li>

                   <!--  <li >
                        <a href="#">Positions <i class="fa fa-chevron-down"></i> </a>
                        <ul class="sub-menu">
                            <li><a href="positions.php">Position Listing</a></li>
                            <li><a href="position-detail.php">Position Detail</a></li>
                        </ul>
                    </li> -->

                    <li >
                        <a href="#">Client <i class="fa fa-chevron-down"></i></a>

                        <ul class="sub-menu">
                            <!-- <li><a href="login.php">Look for an artisan</a></li>
                            <li><a href="login.php">Update Profile</a></li> -->
                            <li><a href="hireArtisan">Hire an Artisan</a></li>
                        </ul><!-- /.sub-menu -->
                    </li>

                    <li >
                        <a href="#">Blog<i class="fa fa-chevron-down"></i></a>

                        <ul class="sub-menu">
                            <li><a href="comments">Comments</a></li>
                           
                        </ul>
                    </li>
                </ul>

                
            </div><!-- /.container -->
        </div><!-- /.header-bottom -->
    </div><!-- /.header -->
</div><!-- /.header-wrapper-->
