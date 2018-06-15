<%@ include file="/WEB-INF/parts/header.jsp" %>
<html>
<head>
<title>register</title>
</head>
<body>

<c:url var="addUrl" value="/register/register"/>
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