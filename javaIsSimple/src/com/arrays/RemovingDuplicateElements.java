package com.arrays;

public class RemovingDuplicateElements {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 10, 10, 10, 20, 20, 30, 40, 50, 50, 60, 80, 90 };
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i] != arr[i + 1]) {

				temp[j++] = arr[i];
			}

		}
		temp[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
