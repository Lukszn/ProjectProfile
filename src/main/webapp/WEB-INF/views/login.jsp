<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/parts/header.jsp" %>
<head>

	<title>Strona Główna</title>
</head>
<body>
<nav>
  
 
</nav>

	<div class="form-container">
        <c:url var="addUrl" value="/register"/>
            <form:form class="form" id="signup" method="post" role="form" action="${addUrl}" modelAttribute="user">
                <h1>Create an Account</h1>
				<form:input class="form" path="login" id="loginForm" placeholder="Login" required="required" />
				<form:errors path="login" cssClass="error" />
				<form:input class="form" path="email" id="emailForm" placeholder="Email address" required="required" />
                <form:errors path="email" cssClass="error"/>
                <form:input class="form" path="password" id="password" type="password" placeholder="Choose a password" required="required" />
                <form:errors path="password" cssClass="error"/>
                <input class="form" name="userpw2" id="confirmPassword" type="password" placeholder="Confirm password" required="required" />
                <button>Register</button>   
            </form:form>
	</div>
	
	<form class="form-container">
<div class="form-title"><h2>Sign up</h2></div>
<div class="form-title">Name</div>
<input class="form-field" type="text" name="firstname" /><br />
<div class="form-title">Email</div>
<input class="form-field" type="text" name="email" /><br />
<div class="submit-container">
<input class="submit-button" type="submit" value="Submit" />
</div>
</form>


</body>
</html>