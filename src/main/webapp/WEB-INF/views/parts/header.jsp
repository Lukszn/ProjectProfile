<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<style> <%@ include file="/WEB-INF/css/style.css"%> </style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary navbar-fixed-top">
		<span class="navbar-brand mb-0 h1"><a style="color:white; text-decoration: none;" href="<c:url value="/"/>"><strong>Project->Profile</strong></a></span>
		
		      </li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/profile"/>"><strong>Profile</strong></a>
				</li>

				<%-- Check if administrator --%>
				<c:if test="${sessionScope.user_permission == 'admin'}">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/admin"/>"><strong>Admin</strong></a>
				</li>
				</c:if>
				
				<li class="nav-item"><a class="nav-link" href="<c:url value="/logout"/>"><strong>Logout</strong></a>
				</li>
			</ul>
		</div>
	</nav>
</header>
