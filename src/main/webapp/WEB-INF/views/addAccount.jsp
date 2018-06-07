<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style><%@ include file="/WEB-INF/parts/header.jsp" %></style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" modelAttribute="account">
    
		<h1>Create an Account</h1>
		
		Title: 
		<form:input path="accTitle" placeholder="Title" required="required" class="input pass"/>
	
		Description:
		<form:input path="accDescription" placeholder="Description" required="required" class="input pass"/>
      
        
        <input type="submit" value="Add Account" class="inputButton" id="signUpButton"/>  
          
	</form:form>
</body>
</html>