package com.arrays;

public class Smallest {
// finding smallest element

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 12, 45, 67, 23, 89, 34 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Minimum element :" + min);
	}

}
