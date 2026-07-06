package com.dsaproblems;

public class TwoPointerSumTestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 1, 5, 6, 7, 8, 9, 12, 18 };
		int target = 10;
		boolean found = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == target) {
					System.out.println(i + " " + j);
					found = true;
				}

			}
		}
		if (!found) {
			System.out.println("Sum not found ");
		}
	}

}
