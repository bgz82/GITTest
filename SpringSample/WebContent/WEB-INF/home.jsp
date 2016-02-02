<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>

</head>
<body>

<br><br><br>
<table align="center" id="userData" name="userData" border="2">
<tr><td>User ID</td><td>User Name</td><td>Password</td></tr>
<c:forEach items="${userList}" var="user">
		<tr><td>${user.getId()} </td><td>${user.getUsername()}</td><td> ${user.getPassword()}</td></tr>
	</c:forEach>
</table>

</body>
</html>