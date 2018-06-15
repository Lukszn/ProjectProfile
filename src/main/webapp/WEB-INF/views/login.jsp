<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/parts/header.jsp" %>
<head>

	<title>Strona Główna</title>
</head>
<body>
<nav>
  
 
</nav>
<div>
<div>
    <div>
        <div id="logbox"  >
        <c:url var="addUrl" value="/register"/>
            <form:form id="signup" method="post" role="form" action="${addUrl}" modelAttribute="user">
                <h1>Create an Account</h1>
				<form:input path="login" id="loginForm" placeholder="Login" required="required" class="input pass"/>
				<form:errors path="login" cssClass="error" />
				<form:input path="email" id="emailForm" placeholder="Email address" required="required" class="input pass"/>
                <form:errors path="email" cssClass="error"/>
                <form:input path="password" id="password" type="password" placeholder="Choose a password" required="required" class="input pass"/>
               <form:errors path="password" cssClass="error"/>
                <input name="userpw2" id="confirmPassword" type="password" placeholder="Confirm password" required="required" class="input pass"/>
                <input type="submit" value="Sign me up!" class="inputButton" id="signUpButton"/>    
            </form:form>
        </div>
    </div>
    
</div>
</div>

</body>
</html>