<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="com.student.Dao.*, com.studentBean.* ,java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete student</title>
</head>
<body>
<%! int id;
PrintWriter out=null;
%>
<% 
id=Integer.parseInt( request.getParameter("id"));
StudentService studentService= new StudentService();
studentService.deleteStudentById(id);
request.getRequestDispatcher("ListOfStudents.jsp").include(request, response);
%> 

<h1>Deleted Student successfully</h1>
</body>
</html>