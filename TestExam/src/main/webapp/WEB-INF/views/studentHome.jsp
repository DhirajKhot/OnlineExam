<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Exam - Login</title>
</head>
<body>
	<center>
		<h2>Online Exam</h2>
	</center>
	<p style="padding-left: 30px;">Welcome user</p>
	<p>&nbsp;</p>
	<p style="padding-left: 30px;">Please read the below instructions
		carefully before starting your test:</p>
	<ul style="padding-left: 80px;">
		<li>Do not press refresh button</li>
		<li>Total score of the exam is 60.</li>
		<li>There will be 60 questions each for 1 mark.</li>
		<li>Time limit for the exam is 1 hour.</li>
		<li>There will be a timer provided at the top right corner of the
			page.&nbsp;</li>
	</ul>
	<center>
		<h3>
			<a href="startExam?name=${name}&questionNumber=1">Start</a>
		</h3>
	</center>
</body>
</html>