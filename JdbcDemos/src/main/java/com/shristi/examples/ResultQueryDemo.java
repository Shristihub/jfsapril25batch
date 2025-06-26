package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultQueryDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		String sql = "select * from student where city=?";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement ps = connection.prepareStatement(sql);) {
			// set the value for placeholder
			ps.setString(1, "Pune");
			try (ResultSet rs = ps.executeQuery()) {
				// iterate thru the resultset
				while (rs.next()) {
					String name = rs.getString("name");
					int studId = rs.getInt("student_id");
					String city = rs.getString("city");
					System.out.println(name + "\t" + studId + "\t" + city);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
