package com.operators;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();

		System.out.println("a == b :" + (a == b));
		System.out.println("a != b :" + (a != b));
		System.out.println("a < b :" + (a < b));
		System.out.println("a>b :" + (a > b));
		System.out.println("a <= b :" + (a <= b));
		System.out.println("a>=b :" + (a >= b));
	}

}
