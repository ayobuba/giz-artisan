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
  <title>Artisan Job Centre| Our Experts</title>

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
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="<spring:url value="/resources/assets/pages/css/components.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/pages/css/portfolio.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style-responsive.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/themes/red.css"/>" rel="stylesheet"/>
  <link href="<spring:url value="/resources/assets/corporate/css/custom.css"/>" rel="stylesheet">
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
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <h1>Meet the Professional Artisans</h1>
            <div class="content-page">
                <div class="filter-v1">
                  <ul class="mix-filter">
                    <li data-filter="all" class="filter active">All Artisans</li>
                    <li data-filter="category_1" class="filter">Carpentry</li>
                    <li data-filter="category_2" class="filter">Electricals</li>
                    <li data-filter="category_3" class="filter">Iron Bending</li>
                    <li data-filter="category_4" class="filter">Plumbing</li>
                    <li data-filter="category_5" class="filter">POP Installing</li>
                    <li data-filter="category_6" class="filter">Mansonry</li>
                    <li data-filter="category_7" class="filter">Tiling</li>
                    <li data-filter="category_8" class="filter">Aluminum Work Installation</li>
                    <li data-filter="category_9" class="filter">Building Sculpting</li>
                   
                  </ul>
                              <div class="row mix-grid thumbnails">
                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                       <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Abel.png"/>" class="img-responsive">
                                       <div class="mix-details">
                                          <h4>Abel Chun</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Abel Chun" href="<spring:url value="/resources/assets/pages/images/Carpenters/Abel.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>
                                       </div>           
                                    </div>                       
                                  </div>





                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                       <div class="mix-inner">
                                          <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Choji.png"/>" class="img-responsive">
                                          <div class="mix-details">
                                             <h4>Choji Dauda Dalyop</h4>
                                             <h4>Electrician</h4>
                                             <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                             <a data-rel="fancybox-button" title="Choji Dauda Dalyop" href="<spring:url value="/resources/assets/pages/images/Electricians/Choji.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>
                                          </div>               
                                       </div>                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                       <div class="mix-inner">
                                          <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Adamu.png"/>" class="img-responsive">
                                          <div class="mix-details">
                                             <h4>Adamu Ibrahim</h4>
                                             <h4>Iron Bender</h4>
                                           <!--   <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                             <a data-rel="fancybox-button" title="Adamu Ibrahim" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Adamu.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>
                                          </div>              
                                      </div>      
                                  </div>






                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                       <div class="mix-inner">
                                         <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Abu.png"/>" class="img-responsive">
                                         <div class="mix-details">
                                             <h4>Abu Luka</h4>
                                             <h4>Carpenter</h4>
                                             <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                             <a data-rel="fancybox-button" title="Abu Luka" href="<spring:url value="/resources/assets/pages/images/Carpenters/Abu.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                         </div>                  
                                      </div>                      
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Edio.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Edio Gabriel</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Edio Gabriel" href="<spring:url value="/resources/assets/pages/images/Electricians/Edio.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>     
                                      </div>                                   
                                  </div>


                                



                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Dung.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Dung Augustine</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Dung Augustine" href="<spring:url value="/resources/assets/pages/images/Carpenters/Dung.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>     
                                      </div>                                   
                                  </div>


                            


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Festus.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Festus Raymond N</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Festus raymond N" href="<spring:url value="/resources/assets/pages/images/Electricians/Festus.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>



                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Amos.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Amos Bwode</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Amos Bwode" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Amos.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>



                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Dagul.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Dagul Turbe</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Dagul Turbe" href="<spring:url value="/resources/assets/pages/images/Carpenters/Dagul.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>   
                                      </div>                                     
                                  </div>



                                  <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Dachung.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Dachung Ishaya</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Dachung Ishaya" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Dachung.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>



                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Hilary.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Hilary Pam Dung</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Hilary Pam Dung" href="<spring:url value="/resources/assets/pages/images/Electricians/Hilary.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>



                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Elisha.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Elisha Choji</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Elisha Choji" href="<spring:url value="/resources/assets/pages/images/Carpenters/Elisha.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>
                                      </div> 
                                      </div>                                       
                                  </div>



                                  <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Fedrick.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Federick John Tok</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Federick John Tok" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Fedrick.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Hassan.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Hassan Adamu</h4>
                                          <h4>Capenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Hassan Adamu" href="<spring:url value="/resources/assets/pages/images/Carpenters/Hassan.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Davou.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Davou Pwajok</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Davou Pwajok" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Davou.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Isa.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Isa Haruna</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Isa Haruna" href="<spring:url value="/resources/assets/pages/images/Electricians/Isa.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Emma.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Emma Galadima</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Emma Galadima" href="<spring:url value="/resources/assets/pages/images/Carpenters/Emma.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Danjuma.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Danjuma Ngoden</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Danjuma Ngoden" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Danjuma.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/James.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>James Odeh Joseph</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="James Odeh Joseph" href="<spring:url value="/resources/assets/pages/images/Electricians/James.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Ezekiel.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Ezekiel Waklet</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Ezekiel Waklet" href="<spring:url value="/resources/assets/pages/images/Carpenters/Ezekiel.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Emmanuel.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Emmanuel Peter Bini</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Emmanuel Peter Bini" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Emmanuel.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Bitrus.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Bitrus John</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Bitrus John" href="<spring:url value="/resources/assets/pages/images/Carpenters/Bitrus.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Kefas.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Kefas Longs</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Kefas Longs" href="<spring:url value="/resources/assets/pages/images/Carpenters/Kefas.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                    <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Henry.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Henry Mungaka</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Henry Mungaka" href="<spring:url value="/resources/assets/pages/images/Carpenters/Henry.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>



                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Linus.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Linus Ajang</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Linus Ajang" href="<spring:url value="/resources/assets/pages/images/Carpenters/Linus.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Martins.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Martins Nyam</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Martins Nyam" href="<spring:url value="/resources/assets/pages/images/Carpenters/Martins.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Michael.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Michael Joseph Dung</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Michael Joseph Dung" href="<spring:url value="/resources/assets/pages/images/Carpenters/Michael.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Monday.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Monday Teme</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Monday Teme" href="<spring:url value="/resources/assets/pages/images/Carpenters/Monday.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Pam.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Pam Dalyop</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Pam Dalyop" href="<spring:url value="/resources/assets/pages/images/Carpenters/Pam.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Rwang.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Rwang Samuel</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Rwang Samuel" href="<spring:url value="/resources/assets/pages/images/Carpenters/Rwang.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Silas.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Silas Shekari</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Silas Shekari" href="<spring:url value="/resources/assets/pages/images/Carpenters/Silas.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Yilkat.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Yilkat Dauda Gokir</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Yilkat Dauda Gokir" href="<spring:url value="/resources/assets/pages/images/Carpenters/Yilkat.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                   <div class="col-md-3 col-sm-4 mix category_1" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Carpenters/Yilnung.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Yilnung Poki</h4>
                                          <h4>Carpenter</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Yilnung Poki" href="<spring:url value="/resources/assets/pages/images/Carpenters/Yilnung.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Kaze.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Kaze K. Pam</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Kaze K. Pam" href="<spring:url value="/resources/assets/pages/images/Electricians/Kaze.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Luka.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Luka N. Azi</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Luka N. Azi" href="<spring:url value="/resources/assets/pages/images/Electricians/Luka.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Mark.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Mark T. Bobai</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Mark T. Bobai" href="<spring:url value="/resources/assets/pages/images/Electricians/Mark.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Michael.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Michael Buki</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Michael Buki" href="<spring:url value="/resources/assets/pages/images/Electricians/Michael.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Mugane.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Mugane Istifanus</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Mugane Istifanus" href="<spring:url value="/resources/assets/pages/images/Electricians/Mugane.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Musa.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Musa Fidelis Stephen</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Musa Fidelis Stephen" href="<spring:url value="/resources/assets/pages/images/Electricians/Musa.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                      <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Nash.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Nash Hwere Ibrahim</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Nash Hwere Ibrahim" href="<spring:url value="/resources/assets/pages/images/Electricians/Nash.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Samson.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Samson Jang D.</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Samson Jang D." href="<spring:url value="/resources/assets/pages/images/Electricians/Solomon.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>
                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Solomon.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Solomon Gyang D.</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Solomon Gyang D." href="<spring:url value="/resources/assets/pages/images/Electricians/Solomon.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/SolomonM.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Solomon Malaya</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Solomon Malaya" href="<spring:url value="/resources/assets/pages/images/Electricians/SolomonM.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Stephen.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Stephen Mathias B.</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Stephen Mathias B." href="<spring:url value="/resources/assets/pages/images/Electricians/Stephen.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Turkuma.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Turkuma O. Jacob</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Turkuma O. Jacob" href="<spring:url value="/resources/assets/pages/images/Electricians/Turkuma.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Wusharwa.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Wusharwa G. Johnson</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Wusharwa G. Johnson" href="<spring:url value="/resources/assets/pages/images/Electricians/Wusharwa.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                  <div class="col-md-3 col-sm-4 mix category_2" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Electricians/Yakubu.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Yakubu Moses</h4>
                                          <h4>Electrician</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Yakubu Moses" href="<spring:url value="/resources/assets/pages/images/Electricians/Yakubu.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                      <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Gokum.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Gokum Kuchedang</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Gokum Kuchedang" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Gokum.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>


                                     <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Kentari.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Kentari s. Gamu</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Kentari s. Gamu" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Kentari.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Kicheme.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Kicheme Nangyella</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Kicheme Nangyella" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Kicheme.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Manghi.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Manghi D. Joseph</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Manghi D. Joseph" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Manghi.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Manji.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Manji Monday</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Manji Monday" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Manji.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Monday.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Monday Moses</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Monday Moses" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Monday.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Moses.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Moses Clement Kim</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Moses Clement Kim" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Moses.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Nanmwa.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Nanmwa Audu</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Nanmwa Audu" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Nanmwa.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Nuhu.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Nuhu Dung</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Nuhu Dung" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Nuhu.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Obioma.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Obioma Sunday</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Obioma Sunday" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Obioma.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Solomon.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Solomon Luka</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Solomon Luka" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Solomon.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Sunday.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Sunday Christopher</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Sunday Christopher" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Sunday.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   <div class="col-md-3 col-sm-4 mix category_3" style="display: block; opacity: 1; ">
                                    <div class="mix-inner">
                                      <img alt="" src="<spring:url value="/resources/assets/pages/images/Iron Benders/Yarima.png"/>" class="img-responsive">
                                      <div class="mix-details">
                                          <h4>Yarima Joshua</h4>
                                          <h4>Iron Bender</h4>
                                          <!-- <a class="mix-link"><i class="fa fa-link"></i></a> -->
                                          <a data-rel="fancybox-button" title="Yarima Joshua" href="<spring:url value="/resources/assets/pages/images/Iron Benders/Yarima.png"/>" class="mix-preview fancybox-button"><i class="fa fa-search"></i></a>                            
                                      </div>    
                                      </div>                                    
                                  </div>

                                   
                              </div>
              </div>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- BEGIN SIDEBAR & CONTENT -->
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
    <script src="<spring:url value="/resources/assets/plugins/jquery-mixitup/jquery.mixitup.min.js"/>" type="text/javascript"></script>
    
    <script src="<spring:url value="/resources/assets/corporate/scripts/layout.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/assets/pages/scripts/portfolio.js"/>" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();
            Layout.initTwitter();
            Portfolio.init();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>