<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style> <%@ include file="/WEB-INF/css/style.css"%> </style>
  <header>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">ProjectProfile</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="<c:url value="/"/>">Home</a></li>
       <li><c:if test="${sessionScope.user_permission == 'admin'}">
     		<a href="<c:url value="/admin"/>"><strong>Admin</strong></a>
		</c:if></li>
      <li><c:if test="${sessionScope.user_permission != null}">
      		<a href="<c:url value="/logout"/>"><strong>Logout</strong></a>
      	</c:if>
      </li>
      <c:if test="${sessionScope.user_permission != null}">
     <li class="nav-item dropdown">
     	
			<button class="dropbtn"><strong>Account</strong></button>
			<div class="dropdown-content">
				<a href="<c:url value="/accounts"/>">Add new account</a>
				<a href="<c:url value="/editAccountForm"/>">Edit accounts</a>
			</div>
			</li>
		</c:if>
		
	
    </ul>
    <div class="dropdown">
 			<span>Accounts</span>
  			<div class="dropdown-content">
   			 <a href="<c:url value="/accounts"/>">Add new account</a>
				<a href="<c:url value="/editAccountForm"/>">Edit accounts</a>
  			</div>
		</div>
    <ul>
   
     
     <li class="nav-item" style="float:right"><a class="nav-link" href="<c:url value="/profile"/>"><strong>Profile</strong></a>
				</li>
      
    </ul>
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
  </nav>
  </header>