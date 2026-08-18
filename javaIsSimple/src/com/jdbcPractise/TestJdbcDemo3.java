package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Main method started");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mypractise", "root", "root");
		Statement st = con.createStatement();
//		String sql = "create table mytable(" + "sno int primary key auto_increment," + "name varchar(50) not null,"
//				+ "city varchar(50))";
//		st.executeUpdate("drop table mytable");
//		st.execute(sql);
//		System.out.println("Table created Successfully");
		String ins = "insert into mytable(name,city) values('Archana','Nandigama'),('Kouser','Hyd'),('Thanmai','Vijayawada')";
		st.executeUpdate(ins);
		String pri = "select * from mytable";
		ResultSet rs = st.executeQuery(pri);
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.println();
		}
	}

}
