package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjection {
	public static void main(String[] args) throws Exception {
		System.out.println("Main method started");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractise", "root", "root");
		Statement st = con.createStatement();
		String sql = "select * from student where 1 or 1";
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.print(rs.getInt(1) + " ");
			System.out.print(rs.getString(2) + " ");
			System.out.print(rs.getInt(3) + " ");
			System.out.println();

		}

	}

}
