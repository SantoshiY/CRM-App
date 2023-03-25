<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<h2>All Leads</h2>
<body>

	<a href="view"><input style="background-color: mistyrose; color:green" type="submit" value = "New Registration"></a>
	<table border=1>
		<tr><th colspan="8" bgcolor="lightgrey"><font size = "6">All Leads</font></th></tr>
		<tr bgcolor="lightgrey">
			<th>ID</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th colspan="2">Action</th> <!--2 colums ko marg kiya <th>Delete</th>  <th>Update</th> -->
			
		</tr>
		<!-- ${leads} from leadController --getAllLeads -- model.addAttribute("leads",leads) "lead" ko call kiya hai yaha -->
		<%--this line in jstl here var ="lead" we create to stored the data form "${leads} --%>
		<c:forEach var="lead" items="${leads}">
		<tr>
			<td>${lead.id}</td>
			<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
			<td>${lead.lastName}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>	
			<td>${lead.source}</td>
			<td><a href="deleteLead?id=${lead.id}"><input style="background-color: mistyrose; color:darkred" type="submit" value = "Delete"></a></td>
			<!-- $ vala spring expretion hai getString(1) vala jsp expresion tha here ?with some folloewd by some value is known as query parameters -->
			<td><a href="update?id=${lead.id}"><input style="background-color: lightcyan; color:darkblue" type="submit" value = "Update"></a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>