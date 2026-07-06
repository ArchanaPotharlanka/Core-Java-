package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int numbers[] = { 10, 98, 82, 32, 2, 5, 89, 85, 23, 52, 99 };
		int firstLargest = numbers[0];
		int secondLargest = numbers[0];
		int thirdLargest = numbers[0];
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

		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] > thirdLargest) {
				if (numbers[j] != firstLargest) {
					if (numbers[j] != secondLargest) {
						thirdLargest = numbers[j];
					}
				}
			}
		}
		System.out.println("First Largest Number : " + firstLargest);
		System.out.println("----------------------------");
		System.out.println("Second Largest Number : " + secondLargest);
		System.out.println(thirdLargest);
	}

}
