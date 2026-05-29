package com.arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		System.out.println("Copying one array to another array");
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] copy = new int[original.length];

		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];

		}
		// Representing the original array:
		System.out.println("Printing original array");
		for (int o : original) {
			System.out.print(o + " ");
		}

		// Representig the copied array:
		System.out.println();
		System.out.println("Printing Copied array ");
		for (int c : copy) {
			System.out.print(c + " ");
		}
	}

}
