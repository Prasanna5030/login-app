<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.student.Dao.* , java.util.*, com.studentBean.* "%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<jsp:include page="includes/Header.jsp" />
<div class="heading text-center m-2 p-4 ">
<h1>List of Students  </h1>
</div>

<%
StudentService studentService = new StudentService();
List<Student> studentList=  studentService.getAllStudents();
pageContext.setAttribute("studentList",studentList);


%>
<table border="2" style="text-align:center;width:100%;">
<tr>
<th>Student _Id </th>
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
<th>edit_details</th>
<th> delete_student </th>
</tr>
<c:forEach var="item" items="${pageScope.studentList}">
<tr>
<td><c:out value="${item.id}" /> </td>
<td><c:out value="${item.firstname}" /></td>
<td><c:out value="${item.lastname}" /></td>
<td><c:out value="${item.email}" /></td>
<td><c:out value="${item.gender}" /></td>
<td><c:out value="${item.dob}" /></td>
<td><c:out value="${item.qualification}" /></td>
<td><c:out value="${item.skills}" /></td>
<td><c:out value="${item.instructor_name}" /></td>
<td><c:out value="${item.courses}" /></td>
<td><c:out value="${item.enrollment_date}" /></td>
<td> <a href="editDetails.jsp?id=${item.id}">edit student</a></td>
<td><a href="deleteStudent.jsp?id=${item.id }">delete</a>
</tr>
<br>
</c:forEach>
</ul>
</div>
<hr>
<div>
</div>


</body>
</html>