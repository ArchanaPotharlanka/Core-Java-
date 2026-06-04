package com.logicalStatements;

import java.util.Scanner;

public class IfElsePassFail {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks ");
		int marks = sc.nextInt();
		if (marks >= 35 && marks<=100) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}

	}

}
