package com.encapsulation;

public class Student {

	private int studentId;
	private String studentName;
	private int studentMarks;

	public void setStudentId(int studentId) {
		this.studentId = studentId;

	}

	public int getStudentId() {
		return studentId;

	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName + " -JFS-B72";
	}

	public void setStudentMarks(int studentMarks) {
		if (studentMarks >= 0 && studentMarks <= 100) {
			this.studentMarks = studentMarks;
		} else {
			System.out.println("Invalid marks");
		}
	}

	public int getStudentMarks() {
		return studentMarks;
	}
}
