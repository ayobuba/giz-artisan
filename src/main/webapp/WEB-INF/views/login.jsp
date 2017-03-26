<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<!--
Template: Metronic Frontend Freebie - Responsive HTML Template Based On Twitter Bootstrap 3.3.4
Version: 1.0.0
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase Premium Metronic Admin Theme: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>Artisan Job Centre | Client Login</title>

  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

  <meta content="Metronic Shop UI description" name="description">
  <meta content="Metronic Shop UI keywords" name="keywords">
  <meta content="keenthemes" name="author">

  <meta property="og:site_name" content="-CUSTOMER VALUE-">
  <meta property="og:title" content="-CUSTOMER VALUE-">
  <meta property="og:description" content="-CUSTOMER VALUE-">
  <meta property="og:type" content="website">
  <meta property="og:image" content="-CUSTOMER VALUE-"><!-- link to image for socio -->
  <meta property="og:url" content="-CUSTOMER VALUE-">

  <link rel="shortcut icon" href="assets/images/favicon.jpg">

  <!-- Fonts START -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->

  <!-- Global styles START -->          
  <link href="<spring:url value="/resources/assets/plugins/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/plugins/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
  <!-- Global styles END --> 
   
  <!-- Page level plugin styles START -->
  <link href="<spring:url value="/resources/assets/plugins/fancybox/source/jquery.fancybox.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/plugins/uniform/css/uniform.default.css"/>" rel="stylesheet" type="text/css">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="<spring:url value="/resources/assets/pages/css/components.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style-responsive.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/themes/red.css"/>" rel="stylesheet" id="style-color">
  <link href="<spring:url value="/resources/assets/corporate/css/custom.css"/>" rel="stylesheet">

  <link rel="stylesheet" href="<spring:url value="/resources/assets/pages/css/login.css"/>">

  <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">
   
   

<%@ include file="header3.jsp" %>







   <div class="main">
      <div class="container">
        
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN SIDEBAR -->
          <div class="sidebar col-md-3 col-sm-3">
            
          </div>
          <!-- END SIDEBAR -->

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-9">
          
            <div class="content-form-page">
             
                <div class="col-md-7 col-sm-7">
                  


                <div class="row">
    
    <div class="tab-content">





        <div id="individual" class="tab-pane active">
        	<spring:url value="/client/individual/login" var="clientIndUrl"/>
            <form:form action="${clientIndUrl}" class="form-signin" method="Post" modelAttribute="individualCommand">
            <h5 style="color:red;">${msg}</h5>
                <p class="text-muted text-center btn-block btn btn-primary btn-rect">
                   Client Login (individual)
                </p>
                <form:input path="client.login.username" type="text" placeholder="Username" class="form-control" name="userName" required="required"/>
                <form:input path="client.login.password" type="password" placeholder="Password" class="form-control" name="password" required="required"/>
                <button class="btn text-muted text-center btn-primary" type="submit">Login</button>
                 Don't have Account? <a class="" href="artisanRegistration.html">Register</a>
            </form:form>
        </div>





        <div id="forgot" class="tab-pane">
            <form action="" class="form-signin" method="Post">
                <p class="text-muted text-center btn-block btn btn-primary btn-rect">Enter your email address</p>
                <input type="email"  required="required" placeholder="Your E-mail"  class="form-control" />
                <br />
                <button class="btn text-muted text-center btn-primary" type="submit">Recover Password</button>
            </form>
        </div>






        <div id="organization" class="tab-pane">
        <spring:url value="/client/organization/login" var="orgIndUrl"/>
            <form:form action="${orgIndUrl }" class="form-signin" method="Post" modelAttribute="organizationCommand"> 
            <h5 style="color:red;">${msg}</h5>
                <p class="text-muted text-center btn-block btn btn-primary btn-rect">
                    Client Login (Organization)
                </p>
                <form:input path="client.login.username" type="text" placeholder="Username" class="form-control" name="userName" required="required"/>
                <form:input path="client.login.password" type="password" placeholder="Password" class="form-control" name="password" required="required"/>
                <button class="btn text-muted text-center btn-primary" type="submit">Login</button>
                Don't have Account? <a class="" href="clientRegistration.html">Register</a>
            </form:form>

        </div>
    </div>
    <div class="text-center">
        <ul class="list-inline">
            <a class="text-muted" href="#individual" data-toggle="tab">Login (Individual)</a>|
            <a class="text-muted" href="#organization" data-toggle="tab">Login (Organization)</a>|
            <a class="text-muted" href="#forgot" data-toggle="tab">Forgot Password</a>
            
        </ul>
    </div>


</div>













                </div>
                <div class="col-md-4 col-sm-4 pull-right">
                  
                </div>
              </div>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
      </div>
    </div>





<%@ include file="footer3.jsp" %>



    <script src="<spring:url value="/resources/assets/plugins/jquery.min.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/assets/plugins/jquery-migrate.min.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/assets/plugins/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>      
    <script src="<spring:url value="/resources/assets/corporate/scripts/back-to-top.js"/>" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="<spring:url value="/resources/assets/plugins/fancybox/source/jquery.fancybox.pack.js"/>" type="text/javascript"></script><!-- pop up -->
    <script src="<spring:url value="/resources/assets/plugins/uniform/jquery.uniform.min.js"/>" type="text/javascript"></script>

    <script src="<spring:url value="/resources/assets/corporate/scripts/layout.js"/>" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initUniform();
            Layout.initTwitter();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>