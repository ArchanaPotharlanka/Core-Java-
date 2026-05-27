package com.arrays;

public class FindSmallest {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
		/*
		 * int smallest = 5; for (int i = 0; i < numbers.length; i++) { if (numbers[i] <
		 * smallest) {
		 * 
		 * smallest = numbers[i]; } }
		 * System.out.println("Smallest element : "+smallest);
		 */

		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Smallest element: " + min);

	}
}
