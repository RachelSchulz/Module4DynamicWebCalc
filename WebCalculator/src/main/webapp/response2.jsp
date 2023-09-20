<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Results</title>
</head>
<body>
	<p>${calc.getNum1()} - First Number
	<br /> 
	${calc.getNum2()} - Times Second Number
	<br /> 
	${calc.getResult()} - Equals Result
	</p>
	<a href="index.jsp">Restart?</a>
</body>
</html>