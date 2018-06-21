<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/parts/headerAdmin.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
</head>
<body>
<h1>Admin Page<h1></h1>
<table class="table">
  <tbody>
    <tr>
      <th scope="row"></th>
   
     <td> <a href="<c:url value="./admin/user/delete"/>"><strong>DeleteUser</strong></a></td>
    </tr>
  </tbody>
</body>
</html>