package com.logicalStatements;

import java.util.Scanner;

public class IfElseLeapYear {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year  ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This is a Leap Year");
		} else {
			System.out.println("This is not Leap Year ");
		}
	}

}
