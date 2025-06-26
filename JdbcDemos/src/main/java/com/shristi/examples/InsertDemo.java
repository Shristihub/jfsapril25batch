package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		String sql = "insert into student values('Raju',1,'Chennai')";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();) {
			boolean result = statement.execute(sql);
			System.out.println(result);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
