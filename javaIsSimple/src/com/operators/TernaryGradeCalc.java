package com.operators;

import java.util.Scanner;

public class TernaryGradeCalc {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.next();
		System.out.println("Enter the marks of " + name);
		int marks = sc.nextInt();

		String passStatus = marks > 35
				? marks > 90 ? "Grade A" : marks > 80 ? "Grade B" : marks > 60 ? "Grade C" : "Grade D"
				: "Failed ";
		System.out.println(passStatus);
	}

}
