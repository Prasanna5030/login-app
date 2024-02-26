package com.listener.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;


public class dbListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent sce)  { 
//    	ServletContext context= sce.getServletContext();
//    	
//    	FileReader fr;
//    	Properties properties= new Properties();
//    	try {
//    		fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\StudentsCourseManagement\\db.properties");
//			properties.load(fr);
//			Class.forName(properties.getProperty("driver"));
//			Connection connection= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
//			context.setAttribute("connection", connection);
//    	} catch (IOException | ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//    	
   }

    public void contextDestroyed(ServletContextEvent sce)  { 
//     ServletContext context= sce.getServletContext();
//    Connection connection=(Connection) context.getAttribute("connection"); 
//    try {
//		connection.close();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
    }
	
}
