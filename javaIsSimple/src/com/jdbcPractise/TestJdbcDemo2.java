package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbcDemo2 {

	public static void main(String[] args) {

		System.out.println("Main method started");

		try {

			// Step 1: Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractise", "root", "root");

			// Step 3: Create Statement
			Statement st = con.createStatement();

			// Step 4: Insert Record
//            st.executeUpdate("insert into student values(4,'harika',90)");

			// Step 5: Retrieve Records
			ResultSet rs = st.executeQuery("select * from student");

			// Step 6: Display Records
			while (rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getInt(3)+" ");
				System.out.println();
			}

			// Step 7: Close Resources
			rs.close();
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}