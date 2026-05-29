package com.arrays;

public class FindFfrequencyOfEachElement {

	public static void main(String[] args) {
		System.out.println("Finding frequency of each element");
		int[] elements = { 1, 2, 3, 1, 2, 3, 5, 6, 1, 2, 3, 5, 9, 8, 7, 9, 8, 7, 6, 5, 4, 1, 2, 3 };
		boolean visited = false;
		for (int i = 0; i < elements.length; i++) {
			int count = 0;

			for (int j = 0; j < elements.length; j++) {
				if (elements[i] == elements[j]) {
					count++;
				}
				visited = true;
			}
			System.out.println("count of " + elements[i] + ": " + count);

			if (visited) {
				break;
			}

		}

	}

}
