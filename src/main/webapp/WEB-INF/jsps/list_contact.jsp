<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all contacts</title>
</head>
<body>
	<table border=1>
		<tr><th colspan="9" bgcolor="lightgrey"><font size = "6">All Contacts</font></th></tr>
		<tr bgcolor="lightgrey">
			<th>ID</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			
			<th colspan="3">Action</th> <!--2 colums ko marg kiya <th>Delete</th>  <th>Update</th> -->
			
		</tr>
		<!-- ${leads} from leadController --getAllLeads -- model.addAttribute("leads",leads) "lead" ko call kiya hai yaha -->
		<%--this line in jstl here var ="lead" we create to stored the data form "${leads} --%>
		<c:forEach var="contact" items="${contacts}">
		<tr>
			<td>${contact.id}</td>
			<td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
			<td>${contact.lastName}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>	
			<td>${contact.source}</td>
			<td><a href="generateBill?id=${contact.id}"><input style="background-color: mistyrose; color:darkred" type="submit" value = "Generate Bill"></a></td>			
			<td><a href="deleteContact?id=${contact.id}"><input style="background-color: mistyrose; color:darkred" type="submit" value = "Delete"></a></td>
			
			<!-- $ vala spring expretion hai getString(1) vala jsp expresion tha here ?with some folloewd by some value is known as query parameters -->
			<td><a href="updateContact?id=${contact.id}"><input style="background-color: lightcyan; color:darkblue" type="submit" value = "Update"></a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>