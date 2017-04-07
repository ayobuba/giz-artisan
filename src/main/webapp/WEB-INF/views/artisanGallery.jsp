<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>GIZ! | Artisan Gallery</title>

    <!-- Bootstrap core CSS -->

    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet">





    <!-- Global styles START -->          
  <link href="<spring:url value="/resources/admin/assets/plugins/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/admin/assets/plugins/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
  <!-- Global styles END --> 
   
  <!-- Page level plugin styles START -->
  <link href="<spring:url value="/resources/admin/assets/plugins/fancybox/source/jquery.fancybox.css"/>" rel="stylesheet">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="<spring:url value="/resources/admin/assets/pages/css/components.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/admin/assets/corporate/css/style.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/admin/assets/pages/css/gallery.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/admin/assets/corporate/css/style-responsive.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/admin/assets/corporate/css/themes/red.css"/>" rel="stylesheet" id="style-color">
  <link href="<spring:url value="/resources/admin/assets/corporate/css/custom.css"/>" rel="stylesheet">
  <!-- Theme styles END -->


    <script src="<spring:url value="/resources/admin/assets/js/jquery.min.js"/>"></script>

    





        <!-- HEADER HERE -->







            <!-- page content -->
            <div class="right_col" role="main">

                <div class="">
                    <div class="page-title">
                        <div class="title_left">
                            <h3> Artisan Media Gallery </h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="x_panel">
                                
                                <div class="x_content">

                                    <div class="row">



                                    <!-- LOOP START HERE -->






                                        <div class="col-md-55">
                                            <div class="thumbnail">
                                                <div class="image view view-first">
                                                    <a data-rel="fancybox-button" title="" href="images/4 .jpg" class="fancybox-button">
                                                    <img alt="" src="images/4.jpg" class="img-responsive" style="width: 100%; display: block;">
                                                     <div class="zoomix"><i class="fa fa-search"></i></div>
                                               
                                                    <div class="mask no-caption">
                                                        <div class="tools tools-bottom zoomix">
                                                        <i class="fa fa-search"></i>
                                                           
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="caption" align="center">
                                                    <p><strong>{{Full Name of Artisan}}</strong></p>
                                                    <p>{{Skill}}</p>
                                                </div>
                                            </div>
                                        </div>




                                        <!-- LOOP ENDS HERE -->





                                         


                                        

                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>





                <!-- FOOTER HERE ->







            </div>
            <!-- /page content -->
        </div>

    </div>

    <div id="custom_notifications" class="custom-notifications dsp_none">
        <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
        </ul>
        <div class="clearfix"></div>
        <div id="notif-group" class="tabbed_notifications"></div>
    </div>

    <script src="<spring:url value="/resources/admin/assets/js/bootstrap.min.js"/>"></script>

    <!-- chart js -->
    <script src="<spring:url value="/resources/admin/assets/js/chartjs/chart.min.js"/>"></script>
    <!-- bootstrap progress js -->
    <script src="<spring:url value="/resources/admin/assets/js/progressbar/bootstrap-progressbar.min.js"/>"></script>
    <script src="<spring:url value="/resources/admin/assets/js/nicescroll/jquery.nicescroll.min.js"/>"></script>
    <!-- icheck -->
    <script src="<spring:url value="/resources/admin/assets/js/icheck/icheck.min.js"/>"></script>

    <script src="<spring:url value="/resources/admin/assets/js/custom.js"/>"></script>



     <script src="<spring:url value="/resources/admin/assets/plugins/jquery.min.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/admin/assets/plugins/jquery-migrate.min.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/admin/assets/plugins/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>      
    <script src="<spring:url value="/resources/admin/assets/corporate/scripts/back-to-top.js"/>" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="<spring:url value="/resources/admin/assets/plugins/fancybox/source/jquery.fancybox.pack.js"/>" type="text/javascript"></script><!-- pop up -->

    <script src="<spring:url value="/resources/admin/assets/corporate/scripts/layout.js"/>" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();    
            Layout.initTwitter();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->

</body>

</html>