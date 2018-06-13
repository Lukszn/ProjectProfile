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

			#header{
				background-color: lightblue;
				width:100%;
				height:50px;
				text-align: center;
			}
			#sidebar-left{
				float:left;
				width:15%;
				background-color: gray;
			}
			#main{
				float:left;
				width:70%;
				background-color: lightgray;
			}
			#sidebar-right{
				float:left;
				width:15%;
				background-color: gray;
			}
			#footer{
				clear:both;
				height: 50px;
				width: 100%;
				text-align: center;
				background-color: lightblue;
			}
			#sidebar-left, #main, #sidebar-right{
				min-height: 600px				
			}
			
			.card {
    box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
    transition: 0.3s;
    width: 40%;
}

.card:hover {
    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

.container {
    padding: 2px 16px;
		
</style>
</head>
<body>
<div id="header"><%@ include file="/WEB-INF/parts/header.jsp" %></div>
<div id="sidebar-left">

<nav>
    <h1>Navigation Menu</h1>
    <ul>
        <li><a href="page1.html">page1</a></li>
        <li><a href="page2.html">page2</a></li>
        <li><a href="page3.html">page3</a></li>
    </ul>
</nav>
</div>



<div id="main">

	<c:forEach items="${accounts}" var="account" begin="0" varStatus="theCount">
	<div class="card">
   		<img src="img_avatar.png" alt="Avatar" style="width:100%">
  		<div class="container">
    		<h4><b>${accounts.accTitle}</b></h4> 
    		<p>${accounts.accDescription}</p> 
  		</div>
	</div>
	</c:forEach>
</div>
<div id="sidebar-right">
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
	</div>
	
	<div id="footer">Footer</div>
</body>
</html>