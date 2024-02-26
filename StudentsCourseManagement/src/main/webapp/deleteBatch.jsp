<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.batch.Dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int id;%>
<% 
id= Integer.parseInt(request.getParameter("id"));
BatchService batchService = new BatchService();
batchService.deleteBatchById(id);

%>
<h1> Batch deleted</h1>
</body>
</html>