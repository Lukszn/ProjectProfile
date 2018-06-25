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
    <li class="menu-item"><a href="<c:url value="/"/>">ProjectProfile</a></li>
    <li class="menu-item"><a href="<c:url value="/"/>">Home</a></li>
    <c:if test="${sessionScope.user_permission == 'admin'}">
    <li class="menu-item"><a href="<c:url value="/admin"/>">Admin</a></li>
    </c:if>
    <c:if test="${sessionScope.user_permission != null}">
    <li class="menu-item"><a href="<c:url value="/accounts"/>">Profiles</a></li>
    <li class="menu-item"><a href="<c:url value="/profile"/>">Account: ${user.getLogin()}</a></li>
    <li class="menu-item"><a href="<c:url value="/logout"/>">Logout</a></li>
    </c:if>
    <c:if test="${sessionScope.user_permission == null}">
    <div class="div-nav">
    <c:url value="/login" var="loginURL"/>
    	<form class="form-nav" id="signin" role="form" method="post" action="${loginURL}">
			<input class="form-nav"  id="basic-addon2" type="text" name="login" value="" placeholder="Login">                                        
        	<input class="form-nav" id="password" type="password" name="password" value="" placeholder="Password">   
        	<button type="submit">Login</button>
        </form>
        </div>
     </c:if>
  </ul><!-- .menu -->
  
</nav>
<!-- .nav -->
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