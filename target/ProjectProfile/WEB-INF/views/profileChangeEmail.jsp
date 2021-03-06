<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<a href="<c:url value="/profile"/>">Back to profile</a><br/>
<h2>Change your e-mail</h2><br/>
	<form method="post">
		Type new e-mail <input type="text" name="mail"><br/>
		Confirm new e-mail <input type="text" name="confirmMail"> <span style="color: red;">${failedMatch}</span><br/>
		Confirm password <input type="password" name="password"> <span style="color: red;">${wrongPassword}</span><br/>
		<input type="submit" value="change">
	</form>
	<br/><span style="color: green; font-weight: bold;">${changed}</span>
</body>
</html>