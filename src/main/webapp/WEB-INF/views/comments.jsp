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
  <title>Artisan Job Centre | Comments</title>

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

  <link rel="shortcut icon" href="favicon.ico">

  <!-- Fonts START -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
  <!-- Fonts END -->

  <!-- Global styles START -->          
  <link href="<spring:url value="/resources/assets/plugins/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/plugins/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
  <!-- Global styles END --> 
   
  <!-- Page level plugin styles START -->
  <link href="<spring:url value="/resources/assets/plugins/fancybox/source/jquery.fancybox.css"/>" rel="stylesheet">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="<spring:url value="/resources/assets/pages/css/components.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style-responsive.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/themes/red.css"/>" rel="stylesheet" id="style-color">
  <link href="<spring:url value="/resources/assets/corporate/css/custom.css"/>" rel="stylesheet">
  <!-- Theme styles END -->


  <script type="text/javascript">

function toggleDiv(divId) {

   $("#"+divId).toggle();
}

 </script>

</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">
  
   


<%@ include file="header3.jsp" %>




     
    <div class="main">
      <div class="container">
       
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
          
            <div class="content-page">
              <div class="row">
                <!-- BEGIN LEFT SIDEBAR -->            
                <div class="col-md-9 col-sm-9 blog-item">
                  
                  
                  <h2>Comments</h2>



                  <div class="comments">



                  <!-- START LOOP COMMENT HERE -->
                 

                    <div class="media">                    
                      <a href="javascript:;" class="pull-left">
                      <img src="" alt="" class="media-object">
                      </a>
                      <div class="media-body">
                        <h4 class="media-heading">Comment Title Here <span>5 hours ago / <a href="javascript:toggleDiv('showhide');">Reply</a></span></h4>
                        <p>Comment Body Here</p>
                        <!-- Nested media object -->

                        <div style="display:none;" id="showhide">
                        <form method="Post" action="">
                            <textarea name="comments" cols="40"></textarea><br/><input type="submit" value="submit">
                        </form>
                          </div>



                          <!-- START LOOP REPLY HERE -->


                         

                        <div class="media">
                          <a href="javascript:;" class="pull-left">
                          <img src="" alt="" class="media-object">
                          </a>
                          <div class="media-body">
                            <h4 class="media-heading">Reply Title Here <span>17 hours ago </span></h4>
                            <p>Reply Body Here</p>
                          </div>
                        </div>




                          

                        <!-- EMD LOOP REPLY HERE -->




                        <!--end media-->  
                      </div>
                    </div>
                    <!--end media-->


                    <!-- END LOOP COMMENT HERE -->

                    


                    
                    <!--end media-->
                  </div>

                  <div class="post-comment padding-top-40">
                    <h3>Leave a Comment</h3>
                    <form role="form" method="POST" action="">
                      <div class="form-group">
                        <label>Title</label>
                        <input class="form-control" type="text">
                      </div>

                      

                      <div class="form-group">
                        <label>Message</label>
                        <textarea class="form-control" rows="8"></textarea>
                      </div>
                      <p><input class="btn btn-primary" type="submit" value="Post a Comment"></p>
                    </form>
                  </div>                      
                </div>
                <!-- END LEFT SIDEBAR -->

                <!-- BEGIN RIGHT SIDEBAR -->            
                <div class="col-md-3 col-sm-3 blog-sidebar">
                  <!-- CATEGORIES START -->
                  <h3 class="no-top-space">Comment Categories</h3>
                  <ul class="nav sidebar-categories margin-bottom-40">
                    <li><a href="javascript:;">Populate Comment Category Here</a></li>
                    
                  </ul>
                  <!-- CATEGORIES END -->

                  <!-- BEGIN RECENT NEWS -->                            
                  <h3>Recent Comments</h3>
                  <div class="recent-news margin-bottom-10">
                    <div class="row margin-bottom-10">
                      <div class="col-md-3">
                        <img class="img-responsive" alt="" src="">                        
                      </div>
                      <div class="col-md-9 recent-news-inner">
                        <h3><a href="javascript:;"></a></h3>
                        <p>Populate Recent Comments</p>
                      </div>                        
                    </div>
                   
                  </div>
                  <!-- END RECENT NEWS -->                            

                 

                 
                  
                </div>
                <!-- END RIGHT SIDEBAR -->            
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

    <script src="<spring:url value="/resources/assets/corporate/scripts/layout.js"/>" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initTwitter();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>