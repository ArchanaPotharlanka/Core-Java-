package com.jdbc.dataAccess;

import com.jdbc.model.Student;

public interface DataAccessInterface {
	public void selectStudent();
	public void insertStudent(Student s);
//	public void updateStudent(int studentNo,String studentName,int marks);
//	public void deleteStudentById(int studentNo);

}
