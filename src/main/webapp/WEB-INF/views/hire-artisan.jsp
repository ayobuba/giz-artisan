

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->

<!-- Head BEGIN -->
<head>
<meta charset="utf-8">
<title>Artisan Job Centre | Hire Artisan</title>

<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<meta content="Metronic Shop UI description" name="description">
<meta content="Metronic Shop UI keywords" name="keywords">
<meta content="keenthemes" name="author">

<meta property="og:site_name" content="-CUSTOMER VALUE-">
<meta property="og:title" content="-CUSTOMER VALUE-">
<meta property="og:description" content="-CUSTOMER VALUE-">
<meta property="og:type" content="website">
<meta property="og:image" content="-CUSTOMER VALUE-">
<!-- link to image for socio -->
<meta property="og:url" content="-CUSTOMER VALUE-">

<link rel="shortcut icon"
	href="<spring:url value="/resources/favicon.jpg"/>">

<!-- Fonts START -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all"
	rel="stylesheet" type="text/css">
<!-- Fonts END -->

<!-- Global styles START -->
<link
	href="<spring:url value="/resources/assets/plugins/font-awesome/css/font-awesome.min.css"/>"
	rel="stylesheet">
<link
	href="<spring:url value="/resources/assets/plugins/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet">
<!-- Global styles END -->

<!-- Page level plugin styles START -->
<link
	href="<spring:url value="/resources/assets/plugins/fancybox/source/jquery.fancybox.css"/>"
	rel="stylesheet">
<link
	href="<spring:url value="/resources/assets/plugins/uniform/css/uniform.default.css"/>"
	rel="stylesheet" type="text/css">
<!-- Page level plugin styles END -->

<!-- Theme styles START -->
<link
	href="<spring:url value="/resources/assets/pages/css/components.css"/>"
	rel="stylesheet">
<link
	href="<spring:url value="/resources/assets/corporate/css/style.css"/>"
	rel="stylesheet">
<link
	href="<spring:url value="/resources/assets/corporate/css/style-responsive.css"/>"
	rel="stylesheet">
<link
	href="<spring:url value="/resources/assets/corporate/css/themes/red.css"/>"
	rel="stylesheet" id="style-color">
<link
	href="<spring:url value="/resources/assets/corporate/css/custom.css"/>"
	rel="stylesheet">
	
	<link
	href="<spring:url value="/resources/assets/pages/css/jquery-ui.css"/>"
	rel="stylesheet">
<script type="text/javascript"
	src="<spring:url value="/resources/assets/pages/scripts/jquery.js"/>" /></script>
<script
	src="<spring:url value="/resources/assets/pages/scripts/artisan.js"/>"
	type="text/javascript"></script>
	

<!-- Theme styles END -->
</head>
<!-- Head END -->

<!-- Body BEGIN -->
<body class="corporate">






	<%@ include file="header3.jsp"%>



	<div class="main">
		<div class="container">

			<div class="row margin-bottom-40">
				<!-- BEGIN CONTENT -->
				<div class="col-md-12">

					<div class="content-page">
						<div class="row">




							<div class="col-md-9 col-sm-9">
								<h2>Hire Artisan</h2>
								<p></p>

								<!-- BEGIN FORM-->
								<spring:url value="/service/request" var="requestFormUrl"/>
								<h4 style="color:orange;">${msg}</h4>
								<h4 style="color:red;">${errorMsg}</h4>
								<form:form action="${requestFormUrl}" role="form" method="POST"
									modelAttribute="request">



									<div class="row">
										<div class="col-sm-12">
											<table class="table table-hover" id="clientName">

												<tbody>
													<tr>
														<td class="center"><h5>Welcome<span style="color:blue">
														${client.client.clientIndividual.bioData.lastName},
														${client.client.clientIndividual.bioData.firstName}
														${client.client.organization.organizationName }</span>
														.Make your request
														</h5>
															
														
															</td>

													</tr>

												</tbody>
											</table>
										</div>
									</div>


									<div class="row">
										<div class="col-sm-12">


											<table class="table table-hover" id="skill">
												<thead>
													<tr>
														<th class="center">Expertise Required</th>
														<th class="center">Number Required</th>
														<th class="center">From</th>
														<th class="center">To</th>

														<th></th>
													</tr>
												</thead>
												<tbody class="add-skill">
													<tr>

														<td class="center"><form:select
																path="subSkill.id"
																required="true" class="form-control"  name="sList[0]">

																<c:forEach items="${subSkillList}" var="skill">
																	<form:option value="${skill.id }">
																		<c:out value="${skill.name}" />
																	</form:option>
																</c:forEach>

															</form:select></td>

														<td class="center"><form:input path="numOfExpertRequest" required="true" type="number"
															name="numList[0]" class="form-control" min="1"/></td>

														<td class="center"><form:input required="true" path="startDate" type="text" id="dateFrom"
															class="form-control"/></td>


														<td class="center"><form:input path="endDate" required="true" type="text" name="eDate[0]" id="dateTo"
															class="form-control"/></td>





													</tr>

												</tbody>
											</table>

											
										</div>
									</div>




									<div class="row"></div>

									<button type="submit" class="btn btn-primary">
										<i class="icon-ok"></i> Request
									</button>
									<button type="reset" class="btn btn-default">Cancel</button>
								</form:form>
								<!-- END FORM-->
							</div>

							<!--  <div class="col-md-3 col-sm-3 sidebar2">
                 <h3>Important Information</h3>
                  -->


						</div>
					</div>
				</div>
			</div>
			<!-- END CONTENT -->
		</div>
	</div>
	</div>



	<%@ include file="footer3.jsp"%>





	<script
		src="<spring:url value="/resources/assets/plugins/jquery.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<spring:url value="/resources/assets/plugins/jquery-migrate.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<spring:url value="/resources/assets/plugins/bootstrap/js/bootstrap.min.js"/>"
		type="text/javascript"></script>
	<script
		src="<spring:url value="/resources/assets/corporate/scripts/back-to-top.js"/>"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
	<script
		src="<spring:url value="/resources/assets/plugins/fancybox/source/jquery.fancybox.pack.js"/>"
		type="text/javascript"></script>
	<!-- pop up -->
	<script
		src="<spring:url value="/resources/assets/plugins/uniform/jquery.uniform.min.js"/>"
		type="text/javascript"></script>

	<script
		src="<spring:url value="/resources/assets/corporate/scripts/layout.js"/>"
		type="text/javascript"></script>
		
		<script
	src="<spring:url value="/resources/assets/pages/scripts/jquery-3.1.1.min.js"/>"
	type="text/javascript"></script>
	
	<script
	src="<spring:url value="/resources/assets/pages/scripts/jquery-ui.js"/>"
	type="text/javascript"></script>
	
	<script type="text/javascript">
	
	$(function(){
		
		$('#dateFrom').datepicker({dateFormat:"dd-mm-yy",changeMonth:true,changeYear:true}).val()
		$('#dateTo').datepicker({dateFormat:"dd-mm-yy",changeMonth:true,changeYear:true}).val()
		
	});
	</script>

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