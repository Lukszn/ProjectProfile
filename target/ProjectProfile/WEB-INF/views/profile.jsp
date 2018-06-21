<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/parts/header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProjectProfile by Łukasz Sznurowski</title>
</head>
<body>
<div class="containter">
<div class="row">
<div align="center" class="col">
<br/>
<h2>Profile details:</h2>
<table class="profile">
	<tr>
		<td></td>
	</tr>
	<tr>
		<td align="right"><strong>Login:</strong></td>
		<td>${user.login}</td>
	</tr>
	<tr>
		<td align="right"><strong>E-mail:</strong></td>
		<td>${user.email}</td>
		<td><a href="<c:url value="/profile/email"/>" class="badge badge-primary">Change e-mail</a></td>
	</tr>
	<tr>
		<td align="right"><strong>Password:</strong></td>
		<td>********</td>
		<td><a href="<c:url value="/profile/password"/>" class="badge badge-primary">Change password</a></td>
	</tr>
</table>
</div>
</div>
</div>
</body>
</html>