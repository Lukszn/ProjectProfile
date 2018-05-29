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
	<a href="./">Project  ->  Profile</a>
	<br>
	Log in
	<c:url value="/login" var="loginURL"/>
	<form  role="form" method="post" action="${loginURL}">
		<input name="login" value="" placeholder="Login">                                        
		<input id="password" type="password" name="password" placeholder="Password">   
		<button type="submit">Login</button>
	</form>
	<ul>
    	<p style="color: white; padding-right: 256px; font-weight: bold">${wrong}</p>
    </ul>
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