package com.arrays;

public class SumOfAllElements {

	public static void main(String[] args) {
		System.out.println("Sum of all elements :");
		int[] arr = { 1, 5, 2, 9, 6, 3, 4, 87, 100 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println( sum);
	}

}
