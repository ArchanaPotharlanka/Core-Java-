package com.jdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreparedStatement2 {
    public static void main(String[] args) {

        try {
            System.out.println("Main method started");

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connec = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mypractise",
                    "root",
                    "root"
            );

            String input = "' OR '1'='1";

            PreparedStatement ps = connec.prepareStatement(
                    "SELECT * FROM student WHERE StudentName = ?"
            );

            ps.setString(1, input);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "-" +
                        rs.getString(2) + "-" +
                        rs.getInt(3)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}