package com.arrays;

public class Max {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int elements[] = { 985, 756, 982, 325, 654, 258, };
		int largest = elements[0];

		// finding maximum by using for loop
		for (int i = 1; i < elements.length; i++) {
			if (elements[i] > largest) {
				largest = elements[i];
			}
		}

		System.out.println("Max :" + largest);

		// Using for each loop:

		for (int value : elements) {
			if (value > largest) {
				largest = value;
			}
		}
		System.out.println("Largest elements among :" + largest);
	}

}
