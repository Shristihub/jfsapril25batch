package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepInsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		String sql = "insert into student values(?,?,?)";

		try (Connection connection = 
				DriverManager.getConnection(url, username, password);
			 PreparedStatement ps = connection.prepareStatement(sql);){
			 // add values for placeholder
			 ps.setString(1, "John");
			 ps.setInt(2, 20);
			 ps.setString(3, "Bangalore");
			 ps.execute();
			 System.out.println("done");		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}












