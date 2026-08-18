package com.arrays;

public class MissingNumber2 {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 2, 3, 5, 7, 0, 1 };
		boolean[] present = new boolean[10];
		for (int i = 0; i < arr.length; i++) {
			present[arr[i]] = true;

		}
		for (int i = 0; i < present.length; i++) {
			if (!present[i]) {
				System.out.println(i);
			}
		}

	}

}
