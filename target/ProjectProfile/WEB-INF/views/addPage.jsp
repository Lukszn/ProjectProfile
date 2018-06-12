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
    
		<h1>Create an Page</h1>
		
		Title: 
		<form:input path="title" placeholder="Title" required="required" class="input pass"/>
	
		First Name:
		<form:input path="firstName" placeholder="First Name" required="required" class="input pass"/>
		
		Last Name:
		<form:input path="lastName" placeholder="Last Name" required="required" class="input pass"/>
		
		Birthdate:
		<form:input path="birthdate" placeholder="BirthDate" class="input pass"/>
		
		Phone Number:
		<form:input path="phoneNumber" placeholder="Phone Number" class="input pass"/>
		
		Education:
		<form:input path="education" placeholder="Your education" class="input pass"/>
		
		Experience:
		<form:input path="experience" placeholder="Your experience" class="input pass"/>
		
		Abilities:
		<form:input path="abilities" placeholder="Your abilities" class="input pass"/>
		
		Interests:
		<form:input path="interests" placeholder="Your interests" class="input pass"/>
		
		Projects:
		<form:input path="projects" placeholder="Url to your projects" class="input pass"/>
		
		About Me:
		<form:input path="aboutUser" placeholder="Write something about you, maybe what you need from life?" class="input pass"/>
      
        
        <input type="submit" value="Add Page" class="inputButton" id="signUpButton"/>  

	</form:form>
</body>
</html>