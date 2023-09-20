<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web Calculator</title>
</head>
<body>
	<h1>Let's do simple math!</h1>
	<form action="addTwoNumbersServlet" method="post">
		Enter the first number to add: <input type="text" name="num1"
			size="10"> Enter the second number to add: <input type="text"
			name="num2" size="10"> <input type="submit"
			value="Add Numbers" />
	</form>
	<form action="multiplyTwoNumbersServlet" method="post">
		Enter the first number to multiply: <input type="text" name="num1"
			size="10"> Enter the second number to multiply: <input type="text"
			name="num2" size="10"> <input type="submit"
			value="Multiply Numbers" />
	</form>
</body>
</html>