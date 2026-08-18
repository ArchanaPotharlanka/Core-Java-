package com.jdbc.main;

import com.jdbc.dataAccess.TestDataAccess;
import com.jdbc.model.Student;

public class JdbcOperations {

	public static void main(String[] args) {
		System.out.println("Main method started");
		TestDataAccess da = new TestDataAccess();
		Student s = new Student();
//		s.setSname("vyshu");
//		s.setMarks(89);
//		da.updateStudent(8, s);
		da.selectStudent();
		da.deleteStudentById(8);
		da.selectStudent();

	}

}
