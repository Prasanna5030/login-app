<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.student.Dao.* , java.util.*, com.studentBean.* " errorPage="errorpage.jsp" %>
<jsp:include page="includes/Header.jsp" />
<body>
<%! int id; %>
<%  
id=Integer.parseInt( request.getParameter("id"));
StudentService studentService = new StudentService();
Student s1=studentService.getStudentById(id);
pageContext.setAttribute("s1", s1);
%>



<div>
<h1 style="text-align: center"> Update participant </h1></div>
<hr>
<div class="form-group add-form mx-auto w-50" >
<form action="updateServlet" method="post">
<input type="hidden"  name="id"  value="<%=s1.getId()%>"/>
<label for="firstname"> first name : </label> <input type="text" name="firstname"  class="form-control" placeholder="your first name"  value="<%=s1.getFirstname() %>" /><br>
<label for="lastname"> last name : </label> <input type="text" name="lastname"  class="form-control" placeholder="your last name"  value="<%=s1.getLastname() %>" /><br>
<label for="email"> email : </label> <input type="email" name="firstname" placeholder="your email" class="form-control"  value="<%=s1.getEmail() %>" /><br>
<label for="dob">Date of Birth : </label> <input type="date" name="dob" class="form-control" value="<%= s1.getDob() %>"  /><br>

<label for="gender"> gender :</label>	<input type="radio"  name="gender" value="M"  />male
																	<input type="radio"  name="gender" value="F" />female
																	
<br>
<br>
<label for="qualification"> Highest Qualification : </label><br> <input type="radio" name="qualification" value="ssc" />SSC
																				<br>	<input type="radio" name="qualification" value="intermediate" />Intermediate
																				<br>	<input type="radio" name="qualification" value="diploma" />Diploma
																				<br>	<input type="radio" name="qualification" value="btech" />B.tech
																					
																					<br>
																				<br>	
																					
		<br>
<label for="skills"  > skills :</label>			<input type="checkbox"  name="skills"	value="Java" />	Java
																	<br>	<input type="checkbox"  name="skills"	value="python" />	python
																	<br>	<input type="checkbox"  name="skills"	value="JavaScript" />	JavaScript
																	<br>	<input type="checkbox"  name="skills"	value="dotnet" />	dot.net
																	<br>	<input type="checkbox"  name="skills"	value="datastructure" />	DataStructures
																		<br>
																		<br><br>
<label for="course"  > courses :</label>		<br>	<input type="checkbox"  name="course"	 value="Java" />	Full Stack Java Developer
																<br>		<input type="checkbox"  name="course"	 value="python" />	Full Stack Python Developer
																<br>		<input type="checkbox"  name="course"	 value="JavaScript" />	Mern Stack
																	<br>	<input type="checkbox"  name="course"	 value="datastructure" />	DataStructures & Algorithms
																		<br>																	
															<br><br>
																
		<label for="enrollment date">Enrollment date : </label> <input type="date" name="enrolldate" class="form-control" value="<%=s1.getEnrollment_date()  %>" /><br>
<br>																
			
<label for="instructor" > instructor : </label>	

<select name="instructor" id="instructor" class="form-control"  value="<%=s1.getInstructor_name()  %>" >
<option value="ashok">  Dr. angela yu  </option>
<option value="angela"> Ashok kb</option>
<option value="akshay"> akshay saini </option>
<option value="durga"> durga  </option>
</select>		

														
<br><br><br>
<input type="submit" value="Update " class="form-control btn btn-primary">		
</form>
</div>


</body>
</html>