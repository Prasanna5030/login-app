<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.batch.Dao.*, com.batchBean.*"%>
<jsp:include page="includes/Header.jsp" />
<body>

<%! int id;  %>
<%
id=Integer.parseInt( request.getParameter("id"));
BatchService batchService = new BatchService();
Batch b1= batchService.getBatchById(id);
pageContext.setAttribute("b1", b1);
%>

<div style="margin-left : 40%">
<form  action="updateBatch" method="post">
Batch Id:      <input type="text"  name="batch_id"  value="<%=b1.getBatch_id()%>"/><br><br>
Student Id : <input type="text"  name="student_id" value ="<%=b1.getStudent_id() %>"/><br><br>
Course name : <input type="text" name="course_name"  value="<%=b1.getCourse_name() %>"/><br><br>

<label for="enrollment date">Enrollment date : </label> <input type="date" name="enrolldate"  value="<%=b1.getEnroll_date() %>"/><br><br>


Instructor : <select name="instructor" id="instructor" value=<%=b1.getInstructor() %>"">
<option value="ashok">  Dr. angela yu  </option>
<option value="angela"> Ashok kb</option>
<option value="akshay"> akshay saini </option>
<option value="durga"> durga  </option>
</select>		
<br><br>

 Batch Session :<input type="radio" name="batch_session" value="weekend"> Weekend batch 
					<input type="radio" name="batch_session" value="weekday"> Weekday batch <br><br>

mode of classes : <input type="radio"  name="session_mode" value="online">Online
   					         <input type="radio"  name="session_mode" value="offine"> Offine<br><br>
   					         
  Courses offered : 	<br><input type="radio"  name="session_course"	value="Java" />	Full Stack Java Developer
																<br>		<input type="radio"  name="session_course"	value="python" />	Full Stack Python Developer
																<br>		<input type="radio"  name="session_course"	value="mernstack" />	Mern Stack Developer
																	<br>	<input type="radio"  name="session_course"	value="datastructure" />	Data Structures & Algorithms
																	<br>	<input type="radio"  name="session_course"	value="meanstack" >	Mean Stack Developer
																<br>	   <input type="radio"  name="session_course"	value="devops" >	Devops
																	<br>  <input type="radio"  name="session_course"	value="datascience" >	Data science
																<br>	   <input type="radio"  name="session_course"	value="artificial_intelligence" >	Artificial Intelligence
																<br>	  <input type="radio"  name="session_course" 	value="Machine_learning" >	Machine Learning
																
																		<br>								<br>								 					         
   					         <input type="submit"  value="submit" />
   					         
   					         
</form>
</div>

</body>
</html>