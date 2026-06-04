package com.logicalStatements;

import java.util.Scanner;

public class ElseIfEmployeeBonus {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.next();
		System.out.println("Enter the salary ");
		double salary = sc.nextDouble();
		double bonus = 0;
		double bonusSalary = salary;
		if (salary > 100000) {
			bonus = 20.0 / 100 * salary;
			bonusSalary += bonus;
			System.out.println(" Salary :" + salary);
			System.out.println("Bonus :" + bonus);
			System.out.println("Total salary with bonus :" + bonusSalary);
		} else if (salary > 50000) {
			bonus = 10.0 / 100 * salary;
			bonusSalary += bonus;
			System.out.println("Salary :" + salary);
			System.out.println("Bonus :" + bonus);
			System.out.println("Total salary with bonus :" + bonusSalary);
		} else if (salary > 25000) {
			bonus = 5.0 / 100 * salary;
			bonusSalary += bonus;
			System.out.println("Salary " + salary);
			System.out.println("Bonus " + bonus);
			System.out.println("Total salary with bonus :" + bonusSalary);
		} else {
			System.out.println("You are not eligible for bonus ");
		}
	}

}
