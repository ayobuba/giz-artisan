<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
  <meta charset="utf-8">
  <title>Artisan Job Centre | Home</title>

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
  <link href="<spring:url value="/resources/assets/pages/css/animate.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/plugins/fancybox/source/jquery.fancybox.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/plugins/owl.carousel/assets/owl.carousel.css"/>" rel="stylesheet">
  <!-- Page level plugin styles END -->

  <!-- Theme styles START -->
  <link href="<spring:url value="/resources/assets/pages/css/components.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/pages/css/slider.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/style-responsive.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/corporate/css/themes/red.css"/>" rel="stylesheet" id="style-color">
  <link href="<spring:url value="/resources/assets/corporate/css/custom.css"/>" rel="stylesheet">


  <link href="<spring:url value="/resources/assets/landing/css/bootstrap.min.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/landing/css/animate.min.css"/>" rel="stylesheet"> 
  <link href="<spring:url value="/resources/assets/landing/css/font-awesome.min.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/landing/css/lightbox.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/landing/css/main.css"/>" rel="stylesheet">
  <link id="css-preset" href="<spring:url value="/resources/assets/landing/css/presets/preset1.css"/>" rel="stylesheet">
  <link href="<spring:url value="/resources/assets/landing/css/responsive.css"/>" rel="stylesheet">

  <!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">
  

<%@ include file="header3.jsp" %>   



<div id="home-slider" class="carousel slide carousel-fade" data-ride="carousel">
      <div class="carousel-inner">
        <div class="item active" style="background-image: url(<spring:url value="/resources/assets/landing/images/slider/home1.png"/>)">
          <div class="caption">
            <h1 class="animated fadeInLeftBig"><span style="color:orange;">Welcome to </span><br/><span>The Artisan Job Centre</span></h1>
            <h1 class="animated fadeInRightBig">(AJC)</h1>
            <a style="color:orange;" data-scroll class="btn btn-start animated fadeInUpBig" href="<spring:url value="/service/request"/>">Hire an Artisan!</a>
          </div>
        </div>

        <div class="item" style="background-image: url(<spring:url value="/resources/assets/landing/images/slider/home2.png"/>)">
          <div class="caption">
          <p class="animated fadeInRightBig"><h2 style="color:orange;"></p>
            <h1 class="animated fadeInLeftBig"><span style="color:orange;">The </span><span>Creative Team</span></h1>
            <h1 class="animated fadeInLeftBig">(AJC)</h1>
            <a style="color:orange;" data-scroll class="btn btn-start animated fadeInUpBig" href="<spring:url value="/service/request"/>">Hire an Artisan!</a>
          </div>
        </div>
        
        <div class="item" style="background-image: url(<spring:url value="/resources/assets/landing/images/slider/home3.png"/>)">
          <div class="caption">
          <p class="animated fadeInRightBig"><h2 style="color:orange;"></h2></p>
            <h1 style="font-size:50px;" class="animated fadeInLeftBig"><span style="color:orange;">... construction</span><span> services redefined</span></h1>
             <h1 class="animated fadeInLeftBig">(AJC)</h1>
            <a style="color:orange;" data-scroll class="btn btn-start animated fadeInUpBig" href="<spring:url value="/service/request"/>">Hire an Artisan!</a>
          </div>
        </div>

        


        <div class="item" style="background-image: url(<spring:url value="/resources/assets/landing/images/slider/home4.png"/>)">
          <div class="caption">
            <h1 class="animated fadeInLeftBig"><span style="color:orange;">We are indeed</span> <span>Professionals</span></h1>
             <h1 class="animated fadeInLeftBig">(AJC)</h1>
            <!-- <p class="animated fadeInRightBig">Bootstrap - Responsive Design - Retina Ready - Parallax</p> -->
            <a style="color:orange;" data-scroll class="btn btn-start animated fadeInUpBig" href="<spring:url value="/service/request"/>">Hire an Artisan!</a>
          </div>
        </div>
      </div>
      <a class="left-control" href="#home-slider" data-slide="prev"><i class="fa fa-angle-left"></i></a>
      <a class="right-control" href="#home-slider" data-slide="next"><i class="fa fa-angle-right"></i></a>

      <a id="tohash" href="login"><i class="fa fa-angle-down"></i></a>

    </div><!--/#home-slider-->































    <div class="main">
      <div class="container">
        <!-- BEGIN SERVICE BOX -->   
        <!-- <div class="row service-box margin-bottom-40">
          <div class="col-md-4 col-sm-4">
            <div class="service-box-heading">
              <em><i class="fa fa-location-arrow blue"></i></em>
              <span>Multipurpose Template</span>
            </div>
            <p>Lorem ipsum dolor sit amet, dolore eiusmod quis tempor incididunt ut et dolore Ut veniam unde nostrudlaboris. Sed unde omnis iste natus error sit voluptatem.</p>
          </div>
          <div class="col-md-4 col-sm-4">
            <div class="service-box-heading">
              <em><i class="fa fa-check red"></i></em>
              <span>Well Documented</span>
            </div>
            <p>Lorem ipsum dolor sit amet, dolore eiusmod quis tempor incididunt ut et dolore Ut veniam unde nostrudlaboris. Sed unde omnis iste natus error sit voluptatem.</p>
          </div>
          <div class="col-md-4 col-sm-4">
            <div class="service-box-heading">
              <em><i class="fa fa-compress green"></i></em>
              <span>Responsive Design</span>
            </div>
            <p>Lorem ipsum dolor sit amet, dolore eiusmod quis tempor incididunt ut et dolore Ut veniam unde nostrudlaboris. Sed unde omnis iste natus error sit voluptatem.</p>
          </div>
        </div> -->
        <!-- END SERVICE BOX -->

        <!-- BEGIN BLOCKQUOTE BLOCK -->   
        <!-- <div class="row quote-v1 margin-bottom-30">
          <div class="col-md-9">
            <span>Metronic - The Most Complete &amp; Popular Admin &amp; Frontend Theme</span>
          </div>
          
        </div> -->
        <!-- END BLOCKQUOTE BLOCK -->

        <!-- BEGIN RECENT WORKS -->
        <!-- <div class="row recent-work margin-bottom-40">
          <div class="col-md-3">
            <h2><a href="portfolio.html">Recent Works</a></h2>
            <p>Lorem ipsum dolor sit amet, dolore eiusmod quis tempor incididunt ut et dolore Ut veniam unde voluptatem. Sed unde omnis iste natus error sit voluptatem.</p>
          </div>
          <div class="col-md-9">
            <div class="owl-carousel owl-carousel3">
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img1.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img1.jpg" class="fancybox-button" title="Project Name #1" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img2.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img2.jpg" class="fancybox-button" title="Project Name #2" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img3.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img3.jpg" class="fancybox-button" title="Project Name #3" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img4.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img4.jpg" class="fancybox-button" title="Project Name #4" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img5.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img5.jpg" class="fancybox-button" title="Project Name #5" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img6.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img6.jpg" class="fancybox-button" title="Project Name #6" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img3.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img3.jpg" class="fancybox-button" title="Project Name #3" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
              <div class="recent-work-item">
                <em>
                  <img src="assets/pages/img/works/img4.jpg" alt="Amazing Project" class="img-responsive">
                  <a href="portfolio-item.html"><i class="fa fa-link"></i></a>
                  <a href="assets/pages/img/works/img4.jpg" class="fancybox-button" title="Project Name #4" data-rel="fancybox-button"><i class="fa fa-search"></i></a>
                </em>
                <a class="recent-work-description" href="javascript:;">
                  <strong>Amazing Project</strong>
                  <b>Agenda corp.</b>
                </a>
              </div>
            </div>       
          </div>
        </div> -->   
        <!-- END RECENT WORKS -->

        <!-- BEGIN TABS AND TESTIMONIALS -->
        <!-- <div class="row mix-block margin-bottom-40"> -->
          <!-- TABS -->
          <!-- <div class="col-md-7 tab-style-1">
            <ul class="nav nav-tabs">
              <li class="active"><a href="#tab-1" data-toggle="tab">Multipurpose</a></li>
              <li><a href="#tab-2" data-toggle="tab">Documented</a></li>
              <li><a href="#tab-3" data-toggle="tab">Responsive</a></li>
              <li><a href="#tab-4" data-toggle="tab">Clean & Fresh</a></li>
            </ul>
            <div class="tab-content">
              <div class="tab-pane row fade in active" id="tab-1">
                <div class="col-md-3 col-sm-3">
                  <a href="assets/temp/photos/img7.jpg" class="fancybox-button" title="Image Title" data-rel="fancybox-button">
                    <img class="img-responsive" src="assets/pages/img/photos/img7.jpg" alt="">
                  </a>
                </div>
                <div class="col-md-9 col-sm-9">
                  <p class="margin-bottom-10">Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Cosby sweater eu banh mi, qui irure terry richardson ex squid Aliquip placeat salvia cillum iphone.</p>
                  <p><a class="more" href="javascript:;">Read more <i class="icon-angle-right"></i></a></p>
                </div>
              </div>
              <div class="tab-pane row fade" id="tab-2">
                <div class="col-md-9 col-sm-9">
                  <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit. Keytar helvetica VHS salvia..</p>
                </div>
                <div class="col-md-3 col-sm-3">
                  <a href="assets/temp/photos/img10.jpg" class="fancybox-button" title="Image Title" data-rel="fancybox-button">
                    <img class="img-responsive" src="assets/pages/img/photos/img10.jpg" alt="">
                  </a>
                </div>
              </div>
              <div class="tab-pane fade" id="tab-3">
                <p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony. Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh mi whatever gluten-free, carles pitchfork biodiesel fixie etsy retro mlkshk vice blog. Scenester cred you probably haven't heard of them, vinyl craft beer blog stumptown. Pitchfork sustainable tofu synth chambray yr.</p>
              </div>
              <div class="tab-pane fade" id="tab-4">
                <p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table VHS viral locavore cosby sweater. Lomo wolf viral, mustache readymade thundercats keffiyeh craft beer marfa ethical. Wolf salvia freegan, sartorial keffiyeh echo park vegan.</p>
              </div>
            </div>
          </div> -->
          <!-- END TABS -->
        
          <!-- TESTIMONIALS -->
          
          <!-- END TESTIMONIALS -->
        </div>                
        <!-- END TABS AND TESTIMONIALS -->

        <!-- BEGIN STEPS -->
       
        <!-- END STEPS -->

        <!-- BEGIN CLIENTS -->
       <!--  <div class="row margin-bottom-40 our-clients">
          <div class="col-md-3">
            <h2><a href="javascript:;">Our Clients</a></h2>
            <p>Lorem dipsum folor margade sitede lametep eiusmod psumquis dolore.</p>
          </div>
          <div class="col-md-9">
            <div class="owl-carousel owl-carousel6-brands">
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_1_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_1.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_2_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_2.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_3_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_3.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_4_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_4.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_5_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_5.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_6_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_6.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_7_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_7.png" class="color-img img-responsive" alt="">
                </a>
              </div>
              <div class="client-item">
                <a href="javascript:;">
                  <img src="assets/pages/img/clients/client_8_gray.png" class="img-responsive" alt="">
                  <img src="assets/pages/img/clients/client_8.png" class="color-img img-responsive" alt="">
                </a>
              </div>                  
            </div>
          </div>          
        </div> -->
        <!-- END CLIENTS -->
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
    <script src="<spring:url value="/resources/assets/plugins/owl.carousel/owl.carousel.min.js"/>" type="text/javascript"></script><!-- slider for products -->


     <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/jquery.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/bootstrap.min.js"/>"></script>
  <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/jquery.inview.min.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/wow.min.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/mousescroll.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/smoothscroll.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/jquery.countTo.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/lightbox.min.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/assets/landing/js/main.js"/>"></script>

    <script src="<spring:url value="/resources/assets/corporate/scripts/layout.js"/>" type="text/javascript"></script>
    <script src="<spring:url value="/resources/assets/pages/scripts/bs-carousel.js" />" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();    
            Layout.initOWL();
            Layout.initTwitter();
            Layout.initFixHeaderWithPreHeader(); /* Switch On Header Fixing (only if you have pre-header) */
            Layout.initNavScrolling();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>