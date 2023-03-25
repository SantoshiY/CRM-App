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
			<td><input type = "text" name="firstName" value="${lead.firstName}"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type = "text" name="lastName" value="${lead.lastName}"/></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type = "text" name="email" value="${lead.email}"/></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type = "text" name="mobile" value="${lead.mobile}"/></td>
		</tr>
		<tr>
			<td>Source</td>
			<td><input type = "text" name="source" value="${lead.source}"/></td>
		</tr>
		
		</table>
		
		<form action="sentMail" method="post" >
			<input type = "hidden" name = "email" value="${lead.email}"/>
			<input type = "submit" value = "Send Mail"/>
		</form>

	<form action="convertLead" method="post">
		<input type="hidden" name="id" value="${lead.id}" /> 
		<input type="hidden" name="email" value="${lead.email}" /> 
		<input type="submit" value="Convert" />
	</form>
</body>
</html>