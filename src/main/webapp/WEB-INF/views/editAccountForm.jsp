<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/parts/header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProjectProfile by Łukasz Sznurowski</title>
</head>
<body>
	<form:form method="post" modelAttribute="account">
		Title: <form:input path="accTitle"/>
		First Name: <form:input path="accFirstName"/>
		Last Name: <form:input path="accLastName"/>
		Birthdate: <form:input path="accBirthdate"/>
		Phone number: <form:input path="accPhoneNumber"/>
		Education: <form:input path="accEducation"/>
		Experience: <form:input path="accExperience"/>
		Abilities: <form:input path="accAbilities"/>
		Interests: <form:input path="accInterests"/>
		Projects: <form:input path="accProjects"/>
		About Me: <form:input path="accDescription"/>

		<input type="submit" value="edit">	
	</form:form>
</body>
</html>


		