package com.operators;

import java.util.Scanner;

public class TerrnaryOperatorEvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ?");
		int num = sc.nextInt();
		String printEvenorOdd = (num % 2 == 0) ? "Number is even" : "Number is odd";
		System.out.println(printEvenorOdd);
		sc.close();
	}

}
