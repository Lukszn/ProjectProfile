<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/parts/header.jsp" %>

<head>

	<title>Strona Główna</title>
	<style> <%@ include file="/WEB-INF/css/signIn.css"%> </style>
</head>
<body style="background-image: url(<c:url value="/static/images/dark_Tire.png"/>)">

<nav>
  
 
</nav>
<div class="containerSignInr">
	<div class="formSignIn">
	 
        <c:url var="addUrl" value="/register"/>
            <form:form class="form" id="signup" method="post" role="form" action="${addUrl}" modelAttribute="user">
            <div class="h1">
               <h1 class="inset-text-effect">Register</h1>
                <hr>
            </div>
                <ul>
				<li><b>Login:</b> <form:input class="input" path="login" id="loginForm" placeholder="Login" required="required" /></li>
				<form:errors path="login" cssClass="error" />
				<li><b>Email:</b> <form:input class="input" path="email" id="emailForm" placeholder="Email address" required="required" /></li>
                <form:errors path="email" cssClass="error"/>
                <li><b>Password:</b> <form:input class="input" path="password" id="password" type="password" placeholder="Choose a password" required="required" /></li>
                <form:errors path="password" cssClass="error"/>
                <li><b>Confirm:</b> <input class="input" name="userpw2" id="confirmPassword" type="password" placeholder="Confirm password" required="required" /></li>
                <center><button class="signIn">Register</button></center>
                </ul>
            </form:form>
	</div>
</div>
	






</body>
</html>