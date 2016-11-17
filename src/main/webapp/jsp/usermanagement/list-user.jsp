
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<%@include file="/jsp/header.jsp"%>
<body>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Role</th>
					<th>Address</th>
				</tr>
			</thead>
			<c:forEach var="element" items="${userModels}">
				<tr>
					<td>${element.id}</td>
					<td>${element.username}</td>
					<td>${element.role}</td>
					<td>${element.address}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
<%@include file="/jsp/footer.jsp"%>
</html>