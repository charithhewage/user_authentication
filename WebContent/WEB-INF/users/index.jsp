<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>
	<form action="login" method="post">
		<label>Email</label>
		<input type="text" name="email"/><br>
		
		<label>First Name</label>
		<input type="text" name="firstName"/><br>
		
		<label>Last name</label>
		<input type="text" name="lastName"/><br>
		
		<input type="submit" value="Submit"/>
		
	</form> 
</body>
</html>