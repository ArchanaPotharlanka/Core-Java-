package com.operators;

import java.util.Scanner;

public class TernaryOpePosNegZer {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = sc.nextInt();

		String status = number == 0 ? " zero" : number < 0 ? " negative" : number > 0 ? "positive" : "invalid";
		System.out.println("The number is " + status);
	}
}
