<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>Single File Upload</h1>
	<form method="post" enctype="multipart/form-data" action="<spring:url value="/gallery/add-gallery-image/${album.albumId}"/>">
		Upload File: <input type="file" name="file">
		<br /><br />
		Description: <input type="text" name="desc"/>
		<br/><br/><input type="submit" value="Upload"> 
	</form>
	
	<div>
	<c:forEach items="${pictureList }" var="picture">
		<img src="<spring:url value="/resources/gallery/${picture.image }"/>" class="color-img img-responsive" alt="">
	</c:forEach>
	</div>
</body>
</html>