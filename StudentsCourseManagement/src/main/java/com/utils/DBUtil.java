package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static Connection connection = null;

	public DBUtil() {	
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\StudentsCourseManagement\\db.properties");
			Properties properties= new Properties();
			properties.load(fr);
			if(connection== null) {
				Class.forName(properties.getProperty("driver"));
				
			  connection = DriverManager.getConnection(properties.getProperty("url"),
						properties.getProperty("username"), properties.getProperty("password"));
			}
		} catch (IOException | SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	public  Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
	return connection;
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
