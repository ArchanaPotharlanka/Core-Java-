package com.logicalStatements;

import java.util.Scanner;

public class IfElsePositiveNegative {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ?");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("The given number is positive ");
		} else {
			System.out.println("The given number is negative ");
		}
	}

}
