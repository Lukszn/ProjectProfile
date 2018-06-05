<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/parts/headerAdmin.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProjectProfil</title>
</head>
<body>
<h1 align="center"><strong>Add Page</strong></h1>
<hr>
<div align="center">
<form:form method="post" modelAttribute="userPageModel">
	Title : <form:input path="title"/>
	First Name : <form:input path="firstName"/>
	Last Name : <form:input path="lastName"/>
	Birthday : <form:input path="birthdate"/>
	Phone Number : <form:input path="phoneNumber"/>
	Education : <form:input path="education"/>
	Experience : <form:input path="experience"/>
	Abilities : <form:input path="abilities"/>
	Interests : <form:input path="interests"/>
	Projects : <form:input path="projects"/>
	About You : <form:input path="aboutUser"/>
	<input type="submit">
</form:form>
</body>
</html>