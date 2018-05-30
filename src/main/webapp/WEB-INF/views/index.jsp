<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style><%@ include file="/WEB-INF/parts/header.jsp" %></style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project - Profile</title>
</head>
<body>
<%@ include file="/WEB-INF/parts/header.jsp" %>
    <h1>Project  ->  Profile</h1>

  <p>Welcome. That project was created by Łukasz Sznurowski.</p>

<div>
	<h3><strong>${message}</strong></h3>
</div>
</body>
</html>