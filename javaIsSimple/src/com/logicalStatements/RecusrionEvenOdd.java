package com.logicalStatements;

import java.util.Scanner;

public class RecusrionEvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not ");
		int num = sc.nextInt();
		evenOdd(num);
		sc.close();
	}

	static void evenOdd(int num) {
		if (num == 0) {
			System.out.println("Number is Even ");
		} else if (num == 1) {
			System.out.println("Number is odd");
		} else {
			evenOdd(num - 2);
		}

	}

}
