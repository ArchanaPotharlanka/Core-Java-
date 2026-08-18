package com.arrays;

public class FindDuplicateElement {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 3, 4, 2, 2, 2, 2, 3 };

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println(arr[i]);
			}

		}
	}

}
