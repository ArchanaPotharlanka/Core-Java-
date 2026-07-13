package com.dsaproblems;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 5, 3, 8, 4, 2 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
