package com.loops;

public class SmallestElement {

	public static void main(String[] args) {
		int num = 1203456;
		int min = Integer.MAX_VALUE;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			if (rem < min) {
				min = rem;
			}

		}
		System.out.println("Smallest Element :" + min);
	}

}
