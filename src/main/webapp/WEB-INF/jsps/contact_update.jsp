<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "contactUpdated" method = "post">
	<table>
		<tr>
			<td>First Name</td>
			<td><input type ="text" name = "firstName" value="${contact.firstName}"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type ="text" name = "lastName" value="${contact.lastName}"/></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type ="text" name = "email" value="${contact.email}"/></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type ="text" name = "mobile" value="${contact.mobile}"/></td>
		</tr>
		<tr>
			<td>Source</td>
			<td><input type ="text" name = "mobile" value="${contact.source}"/></td>
		</tr>
		<tr>			
			<td><input type ="submit" value="Update"/></td>
		</tr>
		
	</table>
	</form>
</body>
</html>