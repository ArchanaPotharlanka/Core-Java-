package com.arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int elements[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = elements.length - 1; i >= 0; i--) {
			System.out.print(elements[i] + " ");
		}
	}

}
