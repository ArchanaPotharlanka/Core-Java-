package com.operators;

import java.util.Scanner;

public class TernaryOperatorEligibleForVote {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ?");
		String name = sc.next();
		System.out.println("Enter your age " + name);
		int age = sc.nextInt();

		String votingStatus = age >= 18 ? name + " !you are eligible for voting "
				: name + " !you are not eligible for voting ";
		System.out.println(votingStatus);

	}

}
