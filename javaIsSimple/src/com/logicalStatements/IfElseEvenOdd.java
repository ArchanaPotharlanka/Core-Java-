package com.logicalStatements;

import java.util.Scanner;

public class IfElseEvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("The number is Even! ");
		} else {
			System.out.println("The number is odd !");
		}

	}

}
