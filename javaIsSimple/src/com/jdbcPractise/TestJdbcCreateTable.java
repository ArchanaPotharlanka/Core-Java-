package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcCreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractise", "root", "root");
		Statement st = con.createStatement();
//		String sql = "create table Mytable(" + "sno int primary key auto_increment," + " name varchar(30) not null," + "age int )";
//		st.executeUpdate(sql);
		st.execute("select * from Mytable");
		String sql = "drop table Mytable";
		System.out.println("deleted successfully");

	}

}
