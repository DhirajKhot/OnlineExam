<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.onlineexam.test.question.bean.Question"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Exam</title>
</head>
<body>
	<center>
		<h2>Bank Exam</h2>
		<h2>${message},${name}</h2>
	</center>
	<table style="padding-left: 50px;" height="30px;" width="1200">
		<tbody>
			<tr>
				<th style="width: 100px; text-align: left; vertical-align: middle;">Question-
					${questionNumber}]&nbsp;</th>
				<th style="text-align: left; vertical-align: middle;" colspan="2">&nbsp;${question.questionData}</th>
				<th style="text-align: left; vertical-align: middle;">Mark(s) : ${question.marks}</th>
			</tr>
		</tbody>
	</table>
	<%
		char optionAlpha = 'A';
	%>
	<table style="padding-left: 50px;" height="200px;" width="400">
		<tbody>
			<c:forEach var="option" items="${question.options}">
				<tr>
					<th style="text-align: right; vertical-align: middle;">&nbsp;<input
						name="Option" type="radio" value=optionAlpha /></th>
					<td style="width: 5px; text-align: center;"><b><%=optionAlpha++%>.</b></td>
					<td>&nbsp;${option.value}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<table style="padding-left: 50px;" height="50px;" width="1200">
		<tbody>
			<tr>
				<th style="text-align: right; vertical-align: middle;" colspan="2">&nbsp;</th>
			</tr>
			<tr>
				<td style="width: 150px; text-align: center;"><c:choose>
						<c:when test="${questionNumber > minQuestionNumber}">
							<input name="PreviousButton" type="button" value="Previous"
								onclick="location.href='test?name=Rohit&questionNumber=${questionNumber - 1}'" />
						</c:when>
					</c:choose></td>
				<td style="width: 150px; text-align: center;"><c:choose>
						<c:when test="${questionNumber < maxQuestionNumber}">
							<input name="NextButton" type="button" value="Next"
								onclick="location.href='test?name=Rohit&questionNumber=${questionNumber + 1}'" />
						</c:when>
					</c:choose></td>
			</tr>
		</tbody>
	</table>

</body>
</html>