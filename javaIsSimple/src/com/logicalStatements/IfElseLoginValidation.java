package com.logicalStatements;

import java.util.Scanner;

public class IfElseLoginValidation {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		String userName = "Archana";
		int password = 8823;
		System.out.println("Enter the userName ");
		String user = sc.next();
		System.out.println("Enter the password");
		int pass = sc.nextInt();
		if (user.equals(userName) && pass == password) {
			System.out.println("Login Successful!");
		} else {
			System.out.println("Invalid credentials!");
		}
	}

}
