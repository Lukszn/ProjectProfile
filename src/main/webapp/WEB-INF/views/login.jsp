<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Title</title>
<style>

</style>
</head>
<body>
<%@ include file="/WEB-INF/parts/header.jsp" %>
	<a href="<c:url value="/registerUser"/>"><strong>Register</strong></a>
    <hr>
    <c:url var="addUrl" value="/register"/>
    <form:form method="post" role="form" action="${addUrl}" modelAttribute="user">
    
		<h1>Create an Account</h1>
		
		Login: 
		<form:input path="login" id="loginForm" placeholder="Login" required="required" class="input pass"/>
		<form:errors path="login" cssClass="error" /><br>
		
		Email:
		<form:input path="email" id="emailForm" placeholder="Email address" required="required" class="input pass"/>
        <form:errors path="email" cssClass="error"/><br>
        
        Password:
        <form:input path="password" id="password" type="password" placeholder="Choose a password" required="required" class="input pass"/>
        <form:errors path="password" cssClass="error"/><br>
        
        Confirm password:
        <input name="userpw2" id="confirmPassword" type="password" placeholder="Confirm password" required="required" class="input pass"/>
        <input type="submit" value="Sign me up!" class="inputButton" id="signUpButton"/>  
          
	</form:form>
</body>
</html>