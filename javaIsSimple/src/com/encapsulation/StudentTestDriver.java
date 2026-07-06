package com.encapsulation;

public class StudentTestDriver {

	public static void main(String[] args) {

		Student s = new Student();
//		s.studentId=102;   //The field Student.studentId is not visible
//		s.studentName="ARchana";
//		s.studentMarks=99;

		s.setStudentId(101);
		s.setStudentName("ARchana");
		s.setStudentMarks(999);

		System.out.println(" Student Id :" + s.getStudentId());
		System.out.println(" Student Name :" + s.getStudentName());
		System.out.println(" Student Marks :" + s.getStudentMarks());

//		Student[] student = new Student[3];
//		student[0] = new Student();
//		student[0].setStudentId(10);
//		student[0].setStudentName("ARchana");
//		student[0].setStudentMarks(89);
//
//		student[1] = new Student();
//		student[1].setStudentId(101);
//		student[1].setStudentName("Kouser");
//		student[1].setStudentMarks(98);
//
//		student[2] = new Student();
//		student[2].setStudentId(1001);
//		student[2].setStudentName("Thanmai");
//		student[2].setStudentMarks(99);
//		for (int i = 0; i < student.length; i++) {
//			System.out.println("*******************************");
//			System.out.println("Student Id :" + student[i].getStudentId());
//			System.out.println("Student Name :" + student[i].getStudentName());
//			System.out.println("Student marks :" + student[i].getStudentMarks());
//		}

	}

}
