package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepUpdateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		String sql = "Update student set city =? where student_id=?";

		try (Connection connection = 
				DriverManager.getConnection(url, username, password);
			 PreparedStatement ps = connection.prepareStatement(sql);){
			 // add values for placeholder
//			"Update student set city ="Pune" where student_id=20";
			 ps.setString(1, "Pune");
			 ps.setInt(2, 20);
			//call execute 
			 ps.execute();
			 System.out.println("done");		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}












