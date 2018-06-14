<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">

<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style> <%@ include file="/WEB-INF/css/header.css"%> </style>

<header>
<div class="header">
  <a href="#default" class="logo">ProjectProfile</a>
  <div class="header-right">
    <a href="<c:url value="/"/>" clas="active">Home</a>
    <c:if test="${sessionScope.user_permission == 'admin'}">
   		<a href="<c:url value="/admin"/>"><strong>Admin</strong></a>
   	</c:if>
   	<c:if test="${sessionScope.user_permission != null}">
   	 	<a href="<c:url value="/logout"/>"><strong>Logout</strong></a>
   	 	<button class="dropbtn"><strong>Account</strong></button>
		<div class="dropdown-content">
			<a href="<c:url value="/accounts"/>">Add new account</a>
			<a href="<c:url value="/editAccountForm"/>">Edit accounts</a>
		</div>
		<a class="active" href="<c:url value="/profile"/>"><strong>Profile</strong></a>
   	</c:if>
  </div>
</div>
	
      		
       			
				
    		
  			<c:if test="${sessionScope.user_permission == null}">
      			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      
    	<c:url value="/login" var="loginURL"/>
    	<form id="signin" class="navbar-form navbar-right" role="form" method="post" action="${loginURL}">
          <div class="input-group">
          	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
             <input id="basic-addon2" type="text" class="form-control" name="login" value="" placeholder="Login">                                        
          </div>
          <div class="input-group">
           <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <input id="password" style="" type="password" class="form-control" name="password" value="" placeholder="Password">   
          </div>
           <button type="submit" class="btn btn-default">Login</button>
        </form>
           <div class="collapse navbar-collapse" id="myNavbar">
     <ul class="nav navbar-nav navbar-right">
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <p style="color: white; padding-right: 256px; font-weight: bold">${wrong}</p>
        </div>
        </ul>
        </div>
       </div>
       </c:if>
  </div>
  </header>