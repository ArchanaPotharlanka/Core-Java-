package com.exceptionhandling;

import java.util.Scanner;

public class ArthmeticException {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println("Enter b number :");
		int b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			
			ae.printStackTrace();                  
			System.out.println(ae.getCause());
			System.out.println(ae.getMessage());

		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
	}
}
