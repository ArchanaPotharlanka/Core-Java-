package com.loops;

public class LargestDigit {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int num = 124589;
		int max = 0;
		int secondMax = 0;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			if (rem > max) {
				secondMax=max;
				max = rem;
			} else if (rem > secondMax && rem != max) {
				secondMax = rem;
			}

		}
		System.out.println("Largest Digit in a number :" + max);
		System.out.println("Second largest Digit :" + secondMax);
	}

}
