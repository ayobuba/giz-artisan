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
  <title>Artisan Job Centre | Contact Us</title>

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

  <link rel="shortcut icon" href="<spring:url value="/resources/favicon.jpg"/>">

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
  <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">
    
   


<%@ include file="header3.jsp" %>




    <div class="main">
      <div class="container">
        
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12">
  
            <div class="content-page">
              <div class="row">
               <!--  <div class="col-md-6">
                  <div id="map" class="gmaps margin-bottom-40" style="height:200px;"></div>
                </div> -->
                <div class="col-md-9 col-sm-9">
                  <h2>Contact Us</h2>
                  <p></p>
                  
                  <!-- BEGIN FORM-->
                  <spring:url value="/contact" var="contactFormUrl"/>
                  <form:form action="${contactFormUrl }" role="form" modelAttribute="contactUs">
                  	<h5><span style="color:blue">${msg }</span></h5>
                    <div class="form-group">
                      <label for="contacts-name">Name</label>
                      <form:input path="name" type="text" class="form-control" id="contacts-name" name="name"/>
                    </div>
                    <div class="form-group">
                      <label for="contacts-email">Email</label>
                      <form:input path="email.emailAddress" type="email" class="form-control" id="contacts-email" name="email"/>
                    </div>
                    <div class="form-group">
                      <label for="contacts-message">Message</label>
                      <form:textarea path="message" class="form-control" rows="5" id="contacts-message" name="message"/>
                    </div>
                    <button type="submit" class="btn btn-primary"><i class="icon-ok"></i> Send</button>
                    <button type="reset" class="btn btn-default">Cancel</button>
                  </form:form>
                  <!-- END FORM-->
                </div>

                <div class="col-md-3 col-sm-3 sidebar2">
                  <h2>Our Contacts</h2>
                  <address>
                    <strong>Address</strong><br>
                    Top floor Dorkur Legacy House <br>
                    Plot 8150, Jonah Jang way, <br>
                    Rayfield, Jos Plateau State<br>
                    </address>
                    <address>
                    <strong>Phone</strong><br/>
                    <a href="">08111071196 or 08034519640</a>
                  </address>
                  <address>
                    <strong>Email</strong><br>
                    <a href="mailto:artisanjob@gmail.org">info@artisanjobcenter.ng</a><br>
    
                  </address>
                  <ul class="social-icons margin-bottom-40">
                    <li><a href="javascript:;" data-original-title="facebook" class="facebook"></a></li>
                    <li><a href="javascript:;" data-original-title="github" class="github"></a></li>
                    <li><a href="javascript:;" data-original-title="Goole Plus" class="googleplus"></a></li>
                    <li><a href="javascript:;" data-original-title="linkedin" class="linkedin"></a></li>
                    <li><a href="javascript:;" data-original-title="rss" class="rss"></a></li>
                  </ul>

                      
                </div>
              </div>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
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
    <script src="http://maps.google.com/maps/api/js?sensor=true" type="text/javascript"></script>
    <script src="<spring:url value="/resources/assets/plugins/gmaps/gmaps.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/assets/pages/scripts/contact-us.js"/>" type="text/javascript"></script>

    <script src="<spring:url value="/resources/assets/corporate/scripts/layout.js"/>" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initUniform();
            ContactUs.init();
            Layout.initTwitter();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>