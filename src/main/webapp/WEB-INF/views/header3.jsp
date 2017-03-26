 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags"%>
 <!-- END TOP BAR -->
    <!-- BEGIN HEADER -->
     <div class="pre-header">
        <div class="container">
            <div class="row">
                <!-- BEGIN TOP BAR LEFT PART -->
                <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                        <li><i class="fa fa-phone"></i><span>08111071196 or 08034519640</span></li>
                        <li><i class="fa fa-envelope-o"></i><span>info@artisanjobcenter.ng</span></li>
                    </ul>
                </div>
                <!-- END TOP BAR LEFT PART -->
                <!-- BEGIN TOP BAR MENU -->
                <div class="col-md-6 col-sm-6 additional-nav">
                    <ul class="list-unstyled list-inline pull-right">
                    <c:choose>
                    	<c:when test="${not empty client}">
                    		<li><a href="<spring:url value="/client/logout"/>"><h5><span style="color:red">LogOut</span> ${client.username}</h5></a></li>
                    	</c:when>
                    	<c:otherwise>
                    		<li><a href="<spring:url value="/client/login"/>">Log In</a></li>
                    	</c:otherwise>
                    </c:choose>
                        
                        
                        <!-- <a href="">Registration</a></li> --><li>
                    </ul>
                </div>
                <!-- END TOP BAR MENU -->
            </div>
        </div>        
    </div>
    <div class="header">
      <div class="container">
        <a class="site-logo" href="index.html"><img src="<spring:url value="/resources/assets/images/logos.png"/>" alt="Logo Goes Here"></a>

        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>

        <!-- BEGIN NAVIGATION -->
        <div class="header-navigation pull-right font-transform-inherit">
          <ul>
            <li class="">
              <a href="<spring:url value="/"/>">
                Home 
                
              </a>
                
            </li>

             <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
               AJC
                
              </a>
                
              <ul class="dropdown-menu">
                <li><a href="<spring:url value="/aboutus"/>">About Us</a></li>
                <li><a href="<spring:url value="/services"/>">Services</a></li>
              </ul>
            </li>

             <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
               Meet the Experts
                
              </a>
                
              <ul class="dropdown-menu">
                <li><a href="<spring:url value="/experts"/>">Our Experts</a></li>
              </ul>
            </li>


            <li class="dropdown dropdown-megamenu">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="javascript:;">
               Registration
                
              </a>
              <ul class="dropdown-menu">
                <li>
                  <div class="header-navigation-content">
                    <div class="row">
                      <div class="col-md-4 header-navigation-col">
                        <h4>Artisan</h4>
                        <ul>
                          <li><a href="<spr:url value="/enrol/new"/>">Register</a></li>
                          
                        </ul>
                      </div>
                      <div class="col-md-4 header-navigation-col">
                        <h4>Client (Individual)</h4>
                        <ul>
                          <li><a href="<spr:url value="/client/register/individual"/>">Register</a></li>
                         
                        </ul>
                      </div>
                      <div class="col-md-4 header-navigation-col">
                        <h4>Client (Organization)</h4>
                        <ul>
                          <li><a href="<spr:url value="/client/register/organization"/>">Register</a></li>
                          
                        </ul>

                        
                      </div>
                    </div>
                  </div>
                </li>
              </ul>
            </li>   

             <li class="">
              <a href="<spring:url value="/service/request"/>">
               Hire an Artisan
                
              </a>
            </li>
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="javascript:;">
               News
                
              </a>
                
              <ul class="dropdown-menu">
                <li><a href="#">Upcoming events</a></li>
                <li><a href="#">Trainings</a></li>
                <li><a href="#">Projects</a></li>
              </ul>
            </li>

            <li class="">
              <a href="<spring:url value="/comments/"/>">
               Comments
                
              </a>
            </li>

            <li>
              <a href="<spring:url value="/gallery"/>">
               Gallery
                
              </a>
            </li>

            <li>
              <a href="<spring:url value="/contact"/>">
               Contact Us
                
              </a>
            </li>
          
          </ul>
        </div>
        <!-- END NAVIGATION -->
      </div>
    </div>
    <!-- Header END -->
