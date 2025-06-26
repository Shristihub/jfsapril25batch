package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepInsertForDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		// pre-compiled
		String sql = "insert into student values(?,?,?)";

		try (Scanner sc = new Scanner(System.in);
			 Connection connection = DriverManager.getConnection(url, username, password);
			 PreparedStatement ps = connection.prepareStatement(sql);) {

			for (int i = 0; i < 5; i++) {
				// add values for placeholder
				System.out.println("Enter name");
				String name = sc.next();
				ps.setString(1, name);
				System.out.println("Enter id");
				ps.setInt(2, sc.nextInt());
				System.out.println("Enter city");
				ps.setString(3, sc.next());
				boolean result = ps.execute();
				System.out.println("inserted " + !result);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
