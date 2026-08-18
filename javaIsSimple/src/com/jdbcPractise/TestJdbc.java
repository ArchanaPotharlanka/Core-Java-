package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1: Loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step 2 : Establishing the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractise", "root", "root");
		// step 3 : create a statement object
		Statement st = con.createStatement();
		// Step 4 : execute
       //int n = st.executeUpdate("insert into student values (3,'Thanmai',99)");
       //if (n > 0) {
//			System.out.println("Data inserted successfully ");
//		} else {
//			System.err.println("something went wrong");
//		}
		String sql = "select * from student";
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(" " + rs.getString(2));
			System.out.print(" " + rs.getInt(3));
			
		}

//		con.close();
	}

}
