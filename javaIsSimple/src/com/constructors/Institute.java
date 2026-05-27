package com.constructors;

public class Institute {

	String instituteName;
	String instituteLocation;
	double courseFee;

	Institute(String instituteName, String instituteLocation, double courseFee) {

		System.out.println("Institute Constructor Called!");

		this.instituteName = instituteName;
		this.instituteLocation = instituteLocation;
		this.courseFee = courseFee;
	}

	public Institute() {

		System.out.println("Default Institute Constructor Called!");
	}

	public static void main(String[] args) {

		Institute i = new Institute("Vcube", "KPHB", 32000.0);
		i.instituteDetails();

		System.out.println("------------------");

		StudentEnrollment s = new StudentEnrollment(101, "Archana", "Java", 32000);

		s.studentDetails();
	}

	void instituteDetails() {

		System.out.println("Institute Name : " + instituteName);
		System.out.println("Institute Location : " + instituteLocation);
		System.out.println("Course Fee : " + courseFee);
	}
}

class StudentEnrollment extends Institute {

	int studentId;
	String studentName;
	String courseName;
	double courseFee;
	String duration;

	StudentEnrollment() {

		super();

		duration = "3 Months";

		System.out.println("Default Student Constructor Called!");
	}

	StudentEnrollment(int studentId, String studentName) {

		this();

		this.studentId = studentId;
		this.studentName = studentName;
	}

	StudentEnrollment(int studentId, String studentName, String courseName, double courseFee) {

		super("Vcube", "KPHB", 32000);

		this.studentId = studentId;
		this.studentName = studentName;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.duration = "3 Months";

		System.out.println("Parameterized Student Constructor Called!");
	}

	void studentDetails() {

		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Course Name : " + courseName);
		System.out.println("Course Fee : " + courseFee);
		System.out.println("Duration : " + duration);

		System.out.println("Institute Name : " + instituteName);
		System.out.println("Institute Location : " + instituteLocation);
	}
}