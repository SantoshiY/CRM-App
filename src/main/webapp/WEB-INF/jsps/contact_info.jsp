<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
	<table>
		<tr>
			<td>First Name</td>
			<td><input type = "text" name="firstName" value="${cont.firstName}"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type = "text" name="lastName" value="${cont.lastName}"/></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type = "text" name="email" value="${cont.email}"/></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type = "text" name="mobile" value="${cont.mobile}"/></td>
		</tr>
		<tr>
			<td>Source</td>
			<td><input type = "text" name="source" value="${cont.source}"/></td>
		</tr>
		
		</table>
		
		<form action="sentMail" method="post" >
			<input type = "hidden" name = "email" value="${cont.email}"/>
			<input type = "submit" value = "Send Mail"/>
		</form>

	</body>
</html>