package com.constructors;

import java.util.Scanner;

public class StudentThis {
	int id;
	String name;
	String course;
	double fee;
	String collegeName;
	static Scanner sc = new Scanner(System.in);

	StudentThis(int id) {
		this.id = id;
		System.out.println("1 Arg constructor called ");
		showDisplay();
	}

	StudentThis(int id, String name) {
		this(id);

		this.name = name;
		System.out.println("Two arg constructor called ");
		showDisplay();
	}

	StudentThis(int id, String name, String course) {
		this(id, name);
		this.course = course;
		System.out.println("three arg constructor called ");
		showDisplay();
	}

	StudentThis(int id, String name, String course, double fee) {
		this(id, name, course);
		this.fee = fee;
		if (fee < 0) {
			System.out.println("Invalid fee:");
			this.fee = 10000;
		}

		System.out.println("Four arg constructor called ");
		showDisplay();
	}

	StudentThis(int id, String name, String course, double fee, String collegeName) {
		this(id, name, course, fee);
		System.out.println("five arg constructor called ");
		this.collegeName = collegeName;
		showDisplay();
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		StudentThis s = new StudentThis(89, "Archana", "Java Full Stack", 30000.0, "Acharya Nagarjuna University");
	}

	void showDisplay() {
		System.out.println("**************************");
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(fee);
		System.out.println(collegeName);
	}

}
