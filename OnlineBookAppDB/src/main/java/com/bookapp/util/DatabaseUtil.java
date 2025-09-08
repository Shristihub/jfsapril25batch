package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	static  Connection connection;
	
	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
				
		try{
			connection = DriverManager.getConnection(url, username, password);
//		    PreparedStatement statement = connection.prepareStatement(Queries.CREATEQUERY); 	
//			statement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}
	
	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
