package com.constructors;

public class Person {

	String name;
	int age;
	double salary;

	Person(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;

		System.out.println("Person Constructor Called");
	}
}

class Employee1 extends Person {

	int employeeId;
	String department;

	double salary;

	Employee1(int employeeId, String department, double employeeSalary, String name, int age, double baseSalary) {

		super(name, age, baseSalary);

		this.employeeId = employeeId;
		this.department = department;
		this.salary = employeeSalary;

		System.out.println("Employee Constructor Called");

		display();
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		Employee1 e = new Employee1(1001, "Manager", 85000.0, "Archana", 20, 50000.0);
	}

	void display() {

		System.out.println("***********************");
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Department : " + department);
		System.out.println("Child Salary : " + this.salary);
		System.out.println("Parent Salary : " + super.salary);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}







