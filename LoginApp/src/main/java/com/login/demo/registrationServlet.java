package com.login.demo;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name =request.getParameter("name");
		String email=request.getParameter("email");
		String pass= request.getParameter("pass");
		String re_pass= request.getParameter("re_pass");
		String contact= request.getParameter("contact");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ServletContext context= getServletContext();
		HttpSession session= null;
		if(pass==re_pass) {
		Connection con=(Connection) context.getAttribute("connection");
		try {
			PreparedStatement pst=con.prepareStatement("INSERT INTO userlogin VALUES(null, ?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, pass);
			pst.setString(4, contact);
			int i=pst.executeUpdate();
			if(i==1) {
				out.println("<center><h1> user created succesfully  </h1></center>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			else {
				out.println("<h1>something went wrong.. please try again </h1> ");
				request.getRequestDispatcher("registration.jsp").include(request, response);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
		else {
			out.println("<center><h1>passwords must be equal</h1> </center>");
			request.getRequestDispatcher("registration.jsp").include(request, response);
		}
	}
}
