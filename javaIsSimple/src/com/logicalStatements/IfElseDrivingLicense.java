package com.logicalStatements;

import java.util.Scanner;

public class IfElseDrivingLicense {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ?");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible for voting and Driving ");
		} else {
			System.out.println("You are not eligible for voting and Driving ");
		}
	}

}
