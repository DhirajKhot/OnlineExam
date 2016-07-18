<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Exam - Login</title>
<link rel="stylesheet" href="<c:url value="/css/style.css"/>"
	type="text/css" />
</head>
<body>
	<div class="wrapper">
		<center>
			<h2>
				<p style="padding-left: 30px;">Welcome ${name}</p>
			</h2>
		</center>
		<p>&nbsp;</p>
		<h2>
			<p style="padding-left: 30px;">Please read the below instructions
				carefully before starting your test:</p>
		</h2>
		<ul style="padding-left: 80px;">
			<li>Do not press refresh button</li>
			<li>Total score of the exam is 60.</li>
			<li>There will be 60 questions each for 1 mark.</li>
			<li>Time limit for the exam is 1 hour.</li>
			<li>There will be a timer provided at the top right corner of
				the page.&nbsp;</li>
		</ul>
		<center>
			<div class="container">
				<form:form method="post" class="form" action="startExam">
					<button type="submit" id="login-button">Start</button>
				</form:form>
			</div>
			<!-- h3>
			<a href="startExam?name=${name}&questionNumber=1">Start</a>
		</h3-->
		</center>
	</div>
</body>
</html>