<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/parts/header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<table class="table table-striped">
<c:forEach items="${pages}" var="page" begin="0" varStatus="theCount">
Strona:
	<tr>
		<td>${theCount.index+1}</td>
		<td><b></b>${page.title}</td>
		<td><b></b>${page.firstName}</td>
		<td><b></b>${page.lastName}</td>
		<td><b></b>${page.birthdate}</td>
		<td><b></b>${page.phoneNumber}</td>
		<td><b></b>${page.education}</td>
		<td><b></b>${page.experience}</td>
		<td><b></b>${page.abilities}</td>
		<td><b></b>${page.interests}</td>
		<td><b></b>${page.projects}</td>
		<td><b></b>${page.aboutUser}</td>

		
	</tr>
</c:forEach>
</table>

     <a href="<c:url value="/addPage"/>">Add Page</a>

</body>
</html>