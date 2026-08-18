package com.jdbc.dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.model.Student;
import com.jdbc.utility.DBConnection;

public class TestDataAccess implements DataAccessInterface {
	DBConnection db = new DBConnection();
	Connection con = null;

	public void selectStudent() {
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(" select* from student ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getInt(3));
				System.out.println();

			}
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public void insertStudent(Student s) {
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, s.getSno());
			ps.setString(2, s.getSname());
			ps.setInt(3, s.getMarks());
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public void updateStudent(int studentNo, Student s) {
		// first if we want to update we have to check whether that student is present
		// or not
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student where StudentNo=?");
			ps.setInt(1, studentNo);
			ResultSet rs = ps.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			if (count > 0) {
				try {
					con = db.getConnection();
					PreparedStatement ps1 = con
							.prepareStatement("update student set StudentName=?,StudentMarks=? where StudentNo=?");
					ps1.setString(1, s.getSname());
					ps1.setInt(2, s.getMarks());
					ps1.setInt(3, studentNo);
					int n = ps1.executeUpdate();

				} catch (Exception e) {
					System.out.println(e);
				}

			} else {
				System.out.println("Student not found");
			}
		} catch (Exception e) {
		}

	}

	public void deleteStudentById(int studentNo) {
		try {
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student where StudentNo=?");
			ps.setInt(1, studentNo);

			ResultSet rs = ps.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;

			}
			if (count > 0) {
				try {
					con = db.getConnection();
					PreparedStatement ps1 = con.prepareStatement("delete from student where StudentNo=?");
					ps1.setInt(1, studentNo);
					ps1.executeUpdate();
				} catch (Exception e) {
					System.out.println(e);
				}

			} else {
				System.out.println("Student not found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
