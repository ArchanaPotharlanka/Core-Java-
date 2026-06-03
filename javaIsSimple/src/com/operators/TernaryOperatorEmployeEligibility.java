package com.operators;

import java.util.Scanner;

//WAP to check whether the employee is eligible to take bonus or not?
public class TernaryOperatorEmployeEligibility {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		String name = sc.next();
		System.out.println("Enter the salary of " + name);
		double sal = sc.nextDouble();
		String bonusStatus = sal > 50000 ? name + " You are Eligible for Bonus"
				: name + " You are not eligible for bonus";
		System.out.println(bonusStatus);

	}

}
