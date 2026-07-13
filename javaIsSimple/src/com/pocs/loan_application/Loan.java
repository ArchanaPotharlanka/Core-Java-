package com.pocs.loan_application;

import java.util.Scanner;

public class Loan {

	Scanner sc = new Scanner(System.in);

	public String getName() {
		System.out.println("Enter your name :");
		String name = sc.next();
		return name;
	}
	public int customerAge() {
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		return age;
	}

	public double getSalary() {
		System.out.println("Enter your salary :");
		int sal = sc.nextInt();
		return sal;
	}

	public boolean panValid() {
		System.out.println(" Enter your PanCard Number : ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	public boolean phoneValid() {
		System.out.println("Enter your phone number :");
		String phone = sc.next();
		return phone.matches("^[6-9]\\d{9}$");
	}

	public boolean aadharValid() {
		System.out.println("Enter your Aadhar Number : ");
		String aadhar = sc.next();
		System.out.println(aadhar);
		return aadhar.matches("\\d{12}");
	}

	public double getROI() {
		return 10.5;
	}

	public double cibilScore() {
		System.out.println("Enter your cibil Score :");
		double cibil = sc.nextDouble();
		return cibil;
	}

	

	public String getAddress() {
		String address = null;

		System.out.println("Enter your flat No : ");
		int flat = sc.nextInt();
		System.out.println("Enter your Street name : ");
		String street = sc.next();
		System.out.println("Enter your village name : ");
		String village = sc.next();
		System.out.println("Enter your District name : ");
		String district = sc.next();
		System.out.println("Enter your State : ");
		String state = sc.next();
		address = "Your Flat no:" + flat + " Street name :" + street + " Village name :" + village + " District name :"
				+ district + " State :" + state;

		return address;

	}
}
