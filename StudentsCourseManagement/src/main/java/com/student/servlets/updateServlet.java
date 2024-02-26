package com.student.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.student.Dao.StudentService;
import com.studentBean.Student;

public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("firstname");
		String lname= request.getParameter("lastname");
		String email= request.getParameter("email");
		char gender =request.getParameter("gender").charAt(0);
		
		String date =request.getParameter("dob");
				String qualification = request.getParameter("qualification");
				String enrolldate =request.getParameter("enrolldate");
		String instructor = request.getParameter("instructor");
		String[] skills =request.getParameterValues("skills");
		String[]  courses= request.getParameterValues("course");
		
		
		Student s1= new  Student(id,fname,lname,email,date,gender,qualification,instructor,enrolldate,Arrays.toString(skills),Arrays.toString(courses));
		
		StudentService studentService = new StudentService();
		studentService.updateStudent(s1);
		
		out.println("record updated");
	}

}
