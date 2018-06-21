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
		<form:input path="accTitle" placeholder="Title" required="required"/>
	
		First Name::
		<form:input path="accFirstName" placeholder="First Name" required="required"/>
		
		Last Name: 
		<form:input path="accLastName" placeholder="Last Name"/>
		
		Birthdate:
		<form:input path="accBirthdate" placeholder="Birthdate"/>
		
		Phone Number:
		<form:input path="accPhoneNumber" placeholder="Phone Number:"/>
		
		Education:
		<form:input path="accEducation" placeholder="Education"/>
		
		Experience:
		<form:input path="accExperience" placeholder="Experience"/>
		
		Abilities:
		<form:input path="accAbilities" placeholder="Abilities"/>
		
		Interests:		
		<form:input path="accInterests" placeholder="Interests"/>
		
		Projects:
		<form:input path="accProjects" placeholder="URL to your projects"/>
		
		About You:
		<form:input path="accDescription" placeholder="Write something sensible"/>
		
      
        
        <input type="submit" value="Add Account" class="inputButton" id="signUpButton"/>  
          
	</form:form>
</body>
</html>