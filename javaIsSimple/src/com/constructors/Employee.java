package com.constructors;

public class Employee {
	int empId;
	String empName;
	String dept;
	double salary;
	{
		System.out.println("Instance 1 block executed !");
	}

	Employee(int empId, String empName, String dept, double salary) {
		System.out.println("Parameterized constructor called ");
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;

	}

	{
		System.out.println("Instance 2 block executed !");
	}

	public static void main(String[] args) {
		System.out.println("main method started!");
		Employee e1 = new Employee(101, "ARchana", "It", 78000.00);
		e1.display();

		Employee e2 = new Employee(102, "Ramesh", "It", 80000.00);
		e2.display();

	}

	void display() {
		System.out.println("************************");
		System.out.println("EMP id : " + empId);
		System.out.println("EMP Name : " + empName);
		System.out.println("Department : " + dept);
		System.out.println("Salary : " + salary);
		System.out.println("************************");

	}

}
