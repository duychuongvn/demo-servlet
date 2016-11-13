
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="/jsp/header.jsp"%>
<head>
<title>Home</title>
</head>
<body>

	<div class="container">
		<h2>This is Home page after login</h2>
		<br /> <a href="<%=request.getContextPath()%>/usermanagement/listUser.do">List User</a>
	</div>
</body>
<%@include file="/jsp/footer.jsp"%>
</html>