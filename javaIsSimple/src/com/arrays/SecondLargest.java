package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int numbers[] = { 10, 82, 32, 2, 5, 89, 85, 23, 52, 98, 99 };
		int firstLargest = 0;
		int secondLargest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > firstLargest) {
				firstLargest = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > secondLargest) {
				if (numbers[i] != firstLargest) {
					secondLargest = numbers[i];
				}
			}
		}
		System.out.println("First Largest Number : " + firstLargest);
		System.out.println("----------------------------");
		System.out.println("Second Largest Number : " + secondLargest);
	}

}
