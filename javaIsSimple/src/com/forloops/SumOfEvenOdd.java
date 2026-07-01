package com.forloops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the Range");
		int range = sc.nextInt();
		sumOfEvenOdd(range);
	}

	static void sumOfEvenOdd(int range) {
		int evenSum = 0;
		int evenCount = 0;
		int oddSum = 0;
		int oddCount = 0;

		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				evenSum += i;
				evenCount++;

			} else {
				oddSum += i;
				oddCount++;

			}
		}
		System.out.println("Even numbers Sum is :" + evenSum);
		System.out.println("Count of Even Numbers :" + evenCount);
		System.out.println("Odd numbers Sum is :" + oddSum);
		System.out.println("Count of Odd Numbers :" + oddCount);
	}

}
