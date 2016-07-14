<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Online Exam</title>
			<link rel="stylesheet" href="<c:url value="/css/style.css"/>" type="text/css"/>
	</head>
	<body>
		<div class="wrapper">
			<div class="container">
				<h1>Welcome to Online Exam</h1>
				<form:form method="post" class="form" modelAttribute="loginForm" action="postLogin">
					<form:input path="userName" type="text" placeholder="Username"/>
					<form:input path="password" type="password" placeholder="Password"/>
					<button type="submit" id="login-button"/>Login as Student</button>
					<button type="submit" id="login-button"/>Login as Admin</button>
				</form:form>
			</div>
			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
	</body>
</html>