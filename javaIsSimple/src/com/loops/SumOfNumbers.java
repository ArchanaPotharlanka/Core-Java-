package com.loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto where you want Sum ");
		int n = sc.nextInt();
		int sum = findSum(n);
		System.out.println("Sum is :" + sum);

	}

	static int findSum(int n) {

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;

	}

}
