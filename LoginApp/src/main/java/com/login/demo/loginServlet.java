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
import java.sql.ResultSet;
import java.sql.SQLException;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password= request.getParameter("password");
		HttpSession session= null;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ServletContext context= getServletContext();
		Connection conn=(Connection) context.getAttribute("connection");
		try {
			PreparedStatement pst=conn.prepareStatement("SELECT * FROM userlogin WHERE name= ? and password =?");
			pst.setString(1,username);
			pst.setString(2,password);
			ResultSet rs= pst.executeQuery();
			if(rs.next()) {
				session=request.getSession();
				session.setAttribute("user", username);
				session.setAttribute("status",true);
				request.getRequestDispatcher("index.jsp").forward(request, response);	
			}
			else {
				out.println("<center><h1>invalid username or password</h1></center>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
