<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">

    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" type="text/css">
    <link href="<spring:url value="/resources/assets/fonts/profession/style.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="/resources/assets/libraries/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="/resources/assets/libraries/bootstrap-fileinput/css/fileinput.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="/resources/assets/libraries/bootstrap-select/css/bootstrap-select.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="/resources/assets/libraries/bootstrap-wysiwyg/bootstrap-wysiwyg.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="/resources/assets/css/profession-black-green.css"/>" rel="stylesheet" type="text/css" id="style-primary">

    <link rel="shortcut icon" type="image/x-icon" href="<spring:url value="/resources/assets/images/gizImages/logo.png"/>">
    
    <title>The Artisan Job Center</title>

<%@ include file="header2.jsp" %>

    <div class="main-wrapper">
        <div class="main">
            <div class="hero-content">
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-md-6">
                <h1>Welcome to the Plateau State Artisan Job Center
                    Platform</h1>
                <h2>Where finding artisans for your building construction is reliable, safe and guaranteed!! Start your search by clicking at "Hire an Artisan".</h2>

                <a href="hireArtisan.php" class="hero-content-action">Hire an Arisan</a>
            </div><!-- /.col-* -->

            <div class="col-sm-6 col-md-5 col-md-offset-1">
                <div class="hero-content-carousel">
                    <h2>Happening Right Now</h2>

                    <ul class="cycle-slideshow vertical"
                        data-cycle-fx="carousel"
                        data-cycle-slides="li"
                        data-cycle-carousel-visible="7"
                        data-cycle-carousel-vertical="true">
                        
                        <li><a href="">Ecobank</a> needs needs professional Carpenters</li>
                    </ul>

                    <!-- <a href="" class="hero-content-show-all">Show All</a> -->
                </div><!-- /.hero-content-content -->
            </div><!-- /.col-* -->
        </div><!-- /.row -->
    </div><!-- /.container -->
</div><!-- /.hero-content -->



<div class="stats">
    <div class="container">
        <div class="row">
            <div class="stat-item col-sm-4" data-to="123012">
               <!--  <strong id="stat-item-1">0</strong>
                <span>Jobs Added</span> -->
            </div><!-- /.col-* -->

            <div class="stat-item col-sm-4" data-to="187432">
               <!--  <strong id="stat-item-2">0</strong>
                <span>Active Resumes</span> -->
            </div><!-- /.col-* -->

            <div class="stat-item col-sm-4" data-to="140312">
               <!--  <strong id="stat-item-3">0</strong>
                <span>Positions Matched</span> -->
            </div><!-- /.col-* -->
        </div><!-- /.row -->
    </div><!-- /.container -->
</div><!-- /.stats -->


<div class="container">
	<div class="filter">
    <h2>Look for Artisan by location</h2>
    <form method="POST" action="">
        <div class="row">
            <div class="form-group col-sm-5">
                <select class="form-control" title="Choose location">
                    <option value="">Plateau</option>
                </select>
            </div><!-- /.form-group -->

            <!-- <div class="form-group col-sm-5">
                <select class="form-control" title="Available Artisans">
                    <option value="">Android Developers</option>
                </select>
            </div> --><!-- /.form-group -->

            <!-- <div class="form-group col-sm-2">
                <button type="submit" class="btn btn-block btn-secondary">Search</button>
            </div> --><!-- /.form-group -->
        </div><!-- /.row -->

        <ul class="filter-list">
            <li><a href="#">{{lga1}} <span class="filter-list-count">({{No of Artisans}})</span></a></li>
            <li><a href="#">{{lga2}} <span class="filter-list-count">({{No of Artisan}})</span></a></li>
            <li><a href="#">{{lga3}} <span class="filter-list-count">({{No of Artisan}})</span></a></li>
            

        </ul>

        <hr>

        
    </form>
</div><!-- /.filter -->




	<div class="panels-highlighted">
    

</div><!-- /.panels -->


	
	


</div><!-- /.container -->




        </div><!-- /.main -->
    </div><!-- /.main-wrapper -->

   
<%@ include file="footer2.jsp" %>

</div><!-- /.page-wrapper -->



<script type="text/javascript" src="<spring:url value="/resources/assets/js/jquery.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/js/jquery.ezmark.js"/>"></script>

<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-sass/javascripts/bootstrap/collapse.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-sass/javascripts/bootstrap/dropdown.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-sass/javascripts/bootstrap/tab.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-sass/javascripts/bootstrap/transition.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-fileinput/js/fileinput.min.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-select/js/bootstrap-select.min.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/bootstrap-wysiwyg/bootstrap-wysiwyg.min.js"/>"></script>

<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/cycle2/jquery.cycle2.min.js"/>"></script>
<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/cycle2/jquery.cycle2.carousel.min.js"/>"></script>

<script type="text/javascript" src="<spring:url value="/resources/assets/libraries/countup/countup.min.js"/>"></script>

<script type="text/javascript" src="<spring:url value="/resources/assets/js/profession.js"/>"></script>


</body>
</html>
