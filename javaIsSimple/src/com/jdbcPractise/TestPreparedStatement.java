package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreparedStatement {

	public static void main(String[] args) throws Exception {
		System.out.println("Main method started");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractise", "root", "root");
//		PreparedStatement ps = con.prepareStatement("insert into student values(6,'Anjali',100)");
//		int n = ps.executeUpdate();
//		if (n>0) {
//			System.out.println("Row inserted Successfully");
//		} else {
//			System.out.println("Something went wrong");
//		}
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getInt(3));
		}
	}

}
