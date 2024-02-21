<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1 style="position:absolute;top:0px ; left:40%">logged out successfully</h1></center>
<% session.invalidate();
request.getRequestDispatcher("login.jsp").include(request,response);
%>
</body>
</html>