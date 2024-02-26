package com.student.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.student.Dao.StudentDao;
import com.student.Dao.StudentDaoImpl;
import com.student.Dao.StudentService;
import com.studentBean.Student;



public class addParticipant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("firstname");
		String lname= request.getParameter("lastname");
		char gender =request.getParameter("gender").charAt(0);
		String  email= request.getParameter("email");
		String date =request.getParameter("dob");
				String qualification = request.getParameter("qualification");
				String enrolldate =request.getParameter("enrolldate");
		String instructor = request.getParameter("instructor");
		String[] skills =request.getParameterValues("skills");
		String[]  courses= request.getParameterValues("course");
		
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
//		out.println("firstname : "+fname+"<br>");
//		out.println("lastname : "+lname+"<br>");
//		out.println("date : "+date+"<br>");
//		out.println("enrollment date : "+enrolldate+"<br>");
//		out.println("gender : "+gender+"<br>");
//		out.println("instructor : "+instructor+"<br>");
//		out.println("qualification : "+qualification+"<br>");
//		out.println("skills : "+Arrays.toString(skills)+"<br>");
//		out.println("courses : "+Arrays.toString(courses)+"<br>");
		
		
		Student s1= new  Student(fname,lname,email,date,gender,qualification,instructor,enrolldate,Arrays.toString(skills),Arrays.toString(courses));
		
//		StudentDao studentDao=new StudentDaoImpl();
//		
//		studentDao.addStudent(s1);
//		out.println("student inserted");
		
		StudentService studentService = new StudentService();
		studentService.addStudent(s1);
		out.println("student inserted");
	}

}
