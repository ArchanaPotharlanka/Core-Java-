package com.arrays;

public class LargestElement {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int largest = 0;

		int elements[] = { 985, 756, 982, 325, 654, 258, };
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] > largest) {
				largest = elements[i];
			}
		}
		System.out.println("Largest elements among :" + largest);
	}

}
