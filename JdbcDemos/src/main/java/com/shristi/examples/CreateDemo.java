package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		// link & load the driver
		// this happens automatically
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		String sql = "create table student(name varchar(20),student_Id int primary key, city varchar(20))";

		Connection connection = null;
		Statement stmt = null;

		try {
//		 establish a connection with db
			connection = DriverManager.getConnection(url, username, password);
//		 create a statement object
			stmt = connection.createStatement();
			// execute the stmt object
			boolean result = stmt.execute(sql);
			System.out.println("Table created "+!result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
