<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<table class="table table-striped">
<c:forEach items="${accounts}" var="account" begin="1" varStatus="theCount">
Konto:
	<tr>
		<td>${theCount.index}</td>
		<td><b>Nazwa: </b>${account.accTitle}</td>
		<td><b>Opis: </b>${account.accDescription}</td>
		
	</tr>
</c:forEach>
</table>

     <a href="<c:url value="/addAccount"/>">Add Account</a>

</body>
</html>