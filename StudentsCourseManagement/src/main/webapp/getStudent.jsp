<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.student.Dao.* ,com.studentBean.*" errorPage="errorpage.jsp" %>
<jsp:include page="includes/Header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<body>
<%!
int id;
%>
<%
id= Integer.parseInt(request.getParameter("id"));
StudentService studentService = new StudentService();
Student s1=studentService.getStudentById(id);

%>
<h1> student details</h1>
<hr>
<table border="2" style="text-align:center;width:100%;">
<tr>

<th>first_name   </th>
<th>last_name </th>
<th>email</th>
<th>gender  </th>
<th> date_of_birth</th>
<th>  qualification </th>
<th>skills </th>
<th> instructor_name</th>
<th>courses </th>
<th> enrollment_date </th>

</tr>
<tr>
<td><c:out value="<%=s1.getFirstname() %>" /> </td>
<td><c:out value="<%=s1.getLastname() %>" /></td>
<td><c:out value="<%=s1.getEmail() %>" /></td>
<td><c:out value="<%=s1.getGender() %>" /></td>
<td><c:out value="<%=s1.getDob() %>"/></td>
<td><c:out value="<%=s1.getQualification() %>" /></td>
<td><c:out value="<%=s1.getSkills() %>" /></td>
<td><c:out value="<%=s1.getInstructor_name() %>" /></td>
<td><c:out value="<%=s1.getCourses() %>"/></td>
<td><c:out value="<%=s1.getEnrollment_date() %>" /></td>
</tr>
</table>
</body>
</html>