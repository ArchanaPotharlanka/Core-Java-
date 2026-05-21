package com.constructors;

import java.util.Scanner;

public class EmployeeThis {
	int id;
	String name;
	double salary;

	static Scanner sc = new Scanner(System.in);

	EmployeeThis() {
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		this(id);
		System.out.println("No arg constructor called ");
	}

	EmployeeThis(int id) {
		System.out.println("Enter the name :");
		String name = sc.next();
		this(id, name);
		System.out.println("one arg constructor called ");
	}

	EmployeeThis(int id, String name) {
		System.out.println("Enter the salary : ");
		double salary = sc.nextDouble();
		this(id, name, salary);
		System.out.println("Two arg constuctor called ");
	}

	EmployeeThis(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Three arg constuctor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		EmployeeThis e = new EmployeeThis();
		e.displayDetails();
	}

	void displayDetails() {
		System.out.println("**********************************");
		System.out.println("Employee Id : " + id);
		System.out.println("Employee name : " + name);
		System.out.println("Employee salary : " + salary);
	}

}
