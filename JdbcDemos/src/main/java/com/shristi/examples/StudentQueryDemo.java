package com.shristi.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentQueryDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jfsaprdb";
		String username = "root";
		String password = "root";
		String sql = "select * from student";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();) {
			//create a ArrayList of Students
			List<Student> students = new ArrayList<>();
			// iterate thru the resultset
			while (rs.next()) {
				String name = rs.getString("name");
				int studId = rs.getInt("student_id");
				String city = rs.getString("city");
				//create a student object - one record/row
				Student student = new Student(name,studId,city);
				//add the student object to the list
				students.add(student);
			}
			//list has all students - iterate to print it
			students.forEach(System.out::println);
			System.out.println();
			students.stream()
			  .sorted((s1,s2)->s1.getStudentName().compareTo(s2.getStudentName()))
			  .forEach((System.out::println));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
