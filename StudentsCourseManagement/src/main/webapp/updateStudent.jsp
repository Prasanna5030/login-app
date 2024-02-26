<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.student.Dao.* , java.util.*, com.studentBean.* " errorPage="errorpage.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<jsp:include page="includes/Header.jsp" />


<%
StudentService studentService = new StudentService();
List<Student> studentList=  studentService.getAllStudents();
pageContext.setAttribute("studentList",studentList);


%>

<hr>
<div class="heading text-center m-2 p-4">
<h3> please enter student id below to perform an action </h3>
</div>
<hr>
<div class="form-group w-50 mx-auto" >
<form action="editDetails.jsp" method="get">
<label  for="id" >Student id  :</label>
<input type="text"  name ="id"  id="sid"  class="form-control"/>
<br>
<input type="submit" value ="update student"  class= "btn btn-primary form-control p-2 my-2"/>

</form>
<button onclick="getRecord()" class="my-2 py-2 btn btn-success w-100">get details </button>

<button onclick="deleteRecord()" class="my-2 py-2 btn btn-danger w-100">delete </button>
</div>
</body>
<script type="text/javascript">
function deleteRecord(){
	var number =document.getElementById("sid").value;
	var url="deleteStudent.jsp?id="+number;
	window.location.href=url;
}

function getRecord(){
	var id =document.getElementById("sid").value;
	var url="getStudent.jsp?id="+id;
	window.location.href=url;
}

</script>
</html>