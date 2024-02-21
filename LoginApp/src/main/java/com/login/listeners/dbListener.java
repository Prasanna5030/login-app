package com.login.listeners;

import java.sql.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;


public class dbListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext context= sce.getServletContext();
    	try {
    		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(context.getInitParameter("db_url"),
																										context.getInitParameter("db_username"),
																										context.getInitParameter("db_password"));
		context.setAttribute("connection", connection);
    	} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    	
    }
    
	public void contextDestroyed(ServletContextEvent sce)  { 
		ServletContext context= sce.getServletContext();
		Connection con=(Connection) context.getAttribute("connection");
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
}
