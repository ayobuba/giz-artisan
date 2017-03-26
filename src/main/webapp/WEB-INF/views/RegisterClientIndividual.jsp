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
  <title>Artisan Job Centre | Client Registration (Individual)</title>
 
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
  <link href="<spring:url value="/resources/assets/corporate/css/artisan.css"/>" rel="stylesheet">
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
         
          <!-- END SIDEBAR -->

          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <h3 id="form-heading">Register a New Client (Individual)</h3>
            <div class="content-form-page">
              <div class="row">
                <div class="col-md-10 col-sm-10">
                <spring:url value="/client/register/individual" var="indFormUrl"/>
                <h3>${msg}</h3>
                  <form:form class="form-horizontal" role="form" method="POST" action="${indFormUrl}" modelAttribute="individualCommand">
                    <fieldset>
                      <legend>Your personal details</legend>
                      <div class="form-group">
                        <label for="firstname" class="col-lg-4 control-label">First Name <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:input path="bioData.firstName" type="text" class="form-control" id="firstname" name="firstName"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="lastname" class="col-lg-4 control-label">Last Name <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:input path="bioData.lastName" type="text" class="form-control" id="lastname" name="lastName"/>
                        </div>
                      </div>
                      
                    </fieldset>

                    <fieldset>
                      <legend>Contact details</legend>
                      <div class="form-group">
                        <label for="phoneNo" class="col-lg-4 control-label">Phone Number <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:input path="bioData.phoneNumber.number" type="text" class="form-control" id="phoneNo" name="phoneNo"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="email" class="col-lg-4 control-label">Email <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:input path="bioData.email.emailAddress" type="email" class="form-control" id="email" name="email"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="state" class="col-lg-4 control-label">State <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:select  path="bioData.address.lga.state.stateId" id="title" required="require" class="form-control col-md-7 col-xs-12">
                                            
                                <c:forEach items="${stateList}" var="state">
                                   <form:option value="${state.stateId }"><c:out value="${state.stateName}"/></form:option>
                                </c:forEach>
                                                
                          </form:select>
                        </div>
                      </div>

                      <div class="form-group">
                        <label for="lga" class="col-lg-4 control-label">LGA <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:select  path="bioData.address.lga.lgaId" id="title" required="require" class="form-control col-md-7 col-xs-12">
                                            
                                <c:forEach items="${lgaList}" var="lga">
                                   <form:option value="${lga.lgaId }"><c:out value="${lga.name}"/></form:option>
                                </c:forEach>
                                                
                          </form:select>
                        </div>
                      </div>
                      
                        <div class="form-group">
                        <label for="state" class="col-lg-4 control-label">Address <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:textarea path="bioData.address.description" class="form-control" id="state" name="address" rows="5"/>
                        </div>
                      </div>
                    </fieldset>
                    <fieldset>
                      <legend>Your password</legend>
                      <div class="form-group">
                        <label for="username" class="col-lg-4 control-label">Username <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:input path="client.login.username" type="text" class="form-control" id="username" name="username"/>
                        </div>
                        </div>
                        <div class="form-group">
                        <label for="password" class="col-lg-4 control-label">Password <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <form:input path="client.login.password" type="password" class="form-control" id="password" name="password"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="confirm-password" class="col-lg-4 control-label">Confirm password <span class="require">*</span></label>
                        <div class="col-lg-8">
                          <input type="password" class="form-control" id="confirm-password" name="cPassword">
                        </div>
                      </div>
                    </fieldset>
                    
                    <div class="row">
                      <div class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-20">                        
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-default">Cancel</button>
                      </div>
                    </div>
                  </form:form>
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