package com.arrays;

public class MovingNegativeElementsToLeft {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 1, -2, 3, -4, 5, -6 };
		int[] result = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				result[k++] = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				result[k++] = arr[i];
			}
		}
		for (int a : result) {
			System.out.print(a + " ");
		}

	}

}
