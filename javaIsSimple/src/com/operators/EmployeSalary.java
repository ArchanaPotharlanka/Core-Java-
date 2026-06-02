package com.operators;

import java.util.Scanner;

public class EmployeSalary {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of emmployee:");
		int sal = sc.nextInt();
		double salaryIncrement = sal + sal * (15.0 / 100);
		System.out.println("Salary After Increment is :" + salaryIncrement);
		double deductedSalary = salaryIncrement - salaryIncrement * 15 / 100;
		System.out.println("Deducting tax : " + deductedSalary);
		double bonus = deductedSalary + 5000;
		System.out.println("After Adding 5000 bonus to the salary then the total salary " + bonus);

	}

}
