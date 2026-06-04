package com.logicalStatements;

import java.util.Scanner;

public class IfElseMovieTicket {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ?");
		int age = sc.nextInt();
		if (age < 5) {
			System.out.println("Free Entry !");
			System.out.println("Ticket Not required");
		} else {
			System.out.println("Ticket Required ");
		}
	}

}
