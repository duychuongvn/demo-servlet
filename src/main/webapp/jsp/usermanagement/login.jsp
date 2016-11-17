<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<title>Welcome</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap/bootstrap.min.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/login.css"
	rel="stylesheet">
<script
	src="<%=request.getContextPath()%>/resources/js/jquery-3.1.1.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container center_div">
		<br /> <br />
		<c:if test="${not empty errorDetail }">
			<span class="alert alert-danger">${errorDetail}</span>
		</c:if>

		<div>
			<h2>Mobile Shop Application</h2>
		</div>
		<div id="loginForm">
			<form action="login.do" method="post" class="login-form">

				<div class="form-group">
					<label for="usr">UserName:</label> <input type="text"
						class="form-control" id="username" name="username"
						placeholder="Enter Username">
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label> <input type="password"
						class="form-control" id="password" name="password"
						placeholder="Enter password">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Login</button>
				</div>
			</form>
			<a href="#" class="">Lost your password?</a> <a href="usermanagement/registerUser.do" class="">New
				User?</a>
		</div>
	</div>
</body>
</html>