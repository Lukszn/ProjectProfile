<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>




<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


<!DOCTYPE html>


<style> <%@ include file="/WEB-INF/css/styles.css"%> </style>


<header>
<nav class="nav">
  <ul class="menu">
    <li class="menu-item"><a href="#">Lorem</a></li>
    <li class="menu-item"><a href="#">Nobis</a></li>
    <li class="menu-item"><a href="#">Nostrum</a></li>
    <li class="menu-item"><a href="#">Quia</a></li>
    <li class="menu-item"><a href="#">Non</a></li>
    <li class="menu-item"><a href="#">Voluptate</a></li>
    <li class="menu-item"><a href="#">Magni</a></li>
  </ul><!-- .menu -->
</nav><!-- .nav -->
<!--  <div class="header">
  <a href="#default" class="logo">ProjectProfile</a>
  <div class="header-right">
    <a href="<c:url value="/"/>" class="active">Home</a>
    <c:if test="${sessionScope.user_permission == 'admin'}">
   		<a href="<c:url value="/admin"/>"><strong>Admin</strong></a>
   	</c:if>
   	<c:if test="${sessionScope.user_permission != null}">
   
			<a href="<c:url value="/accounts"/>">Add new account</a>
			<a href="<c:url value="/editAccountForm"/>">Edit accounts</a>
			<a class="active" href="<c:url value="/profile"/>"><strong>Profile</strong></a>
			<a class="nav-link" href="<c:url value="/logout"/>"><strong>Logout</strong></a>
   	</c:if>
   	<span >Log in</span>
    <c:url value="/login" var="loginURL"/>
    	<form class="form" id="signin" role="form" method="post" action="${loginURL}">
			<input class="form"  id="basic-addon2" type="text" name="login" value="" placeholder="Login">                                        
        	<input class="form" id="password" type="password" name="password" value="" placeholder="Password">   
        	<button type="submit">Login</button>
        </form>
          
     <ul>  
        <p style="color: white; padding-right: 256px; font-weight: bold">${wrong}</p>
     </ul>
  </div>
</div>
  -->
</header>