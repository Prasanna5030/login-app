<jsp:include page="includes/Header.jsp" />
<body "text-align: center">
<div class="text-center m-2 p-5">
<h1 > Add a new participant </h1></div>
<hr>


<div class="form-group add-form mx-auto w-50"  >
<form action="addParticipant" method="post">
<label for="firstname"> first name : </label> <input type="text" class="form-control" name="firstname" placeholder="your first name" /><br><br>
<label for="lastname"> last name : </label> <input type="text" class="form-control" name="lastname" placeholder="your last name" /><br><br>
<label for="email"> email : </label> <input type="email" class="form-control" name="email" placeholder="your email" /><br><br>

<label for="dob">Date of Birth : </label> <input type="date" name="dob" class="form-control" /><br><br>

<label for="gender"> gender :</label>	<input type="radio"  name="gender" value="M" />male
																	<input type="radio"  name="gender" value="F" />female
																	<br><br>
<br>

<label for="qualification"> Highest Qualification : </label><br> <input type="radio" name="qualification" value="ssc" />SSC
																			&nbsp;	&nbsp;	<input type="radio" name="qualification" value="intermediate" />Intermediate
																				&nbsp;&nbsp;	<input type="radio" name="qualification" value="diploma" />Diploma
																				&nbsp;&nbsp;	<input type="radio" name="qualification" value="btech"/>B.tech
																					
																					<br>
																				<br>	
																					
		<br>
			<label for="enrollment date">Enrollment date : </label> <input type="date" name="enrolldate" /><br><br>
<label for="skills"  > skills :</label>	&nbsp;		<input type="checkbox"  name="skills"	value="Java" />	Java
																	&nbsp;&nbsp;<input type="checkbox"  name="skills"	value="python" />	python
																	&nbsp;&nbsp;<input type="checkbox"  name="skills"	value="JavaScript" />	JavaScript
																	&nbsp;&nbsp;	<input type="checkbox"  name="skills"	value="dotnet" />	dot.net
																	&nbsp;&nbsp;<input type="checkbox"  name="skills"	value="datastructure"/>	DataStructures
																		<br> 
																		<br>
<label for="course"  > courses :</label>		<br>	<input type="checkbox"  name="course"	value="Java" />	Full Stack Java Developer
																<br>		<input type="checkbox"  name="course"	value="python" />	Full Stack Python Developer
																<br>		<input type="checkbox"  name="course"	value="JavaScript" />	Mern Stack
																	<br>	<input type="checkbox"  name="course"	value="datastructure"/>	DataStructures & Algorithms
																		<br>																	
															<br>
																
	
<br>																
			
<label for="instructor" > instructor : </label>	
<select name="instructor" id="instructor" class="form-control">
<option value="ashok">  Dr. angela yu  </option>
<option value="angela"> Ashok kb</option>
<option value="akshay"> akshay saini </option>
<option value="durga"> durga  </option>
</select>		

														
<br><br><br>
<input type="submit" value="submit here" class="form-control btn btn-primary">		
</form>
</div>




</body>
</html>