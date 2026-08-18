package com.arrays;

public class MissingNumberFinding {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, 6, 4, 5 };
		/* It works only for sorted Array */
		// time complexity=O(n^2)
		// space complexity=O(n);
		for (int i = 1; i <= arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = true;
					break;

				}
			}
			if (!flag) {
				System.out.println(i);
			}
		}
	}

}
