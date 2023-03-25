<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<FORM action ="sent" method= "post">
		<table>
			<tr>
				<td> To <input type = "text" name="to" value="${email}"/></td>
			</tr>
			<tr>
				<td>Subject <input type = "text" name="subject"/></td>
			</tr>
			<tr>
				<td><textarea name="content" rows="10" cols="50" /></textarea></td>
			</tr>
			<tr>
				<td><input type = "submit" value="send"/></td>
			</tr>
		</table>
	</FORM>
	${done}
</body>
</html>