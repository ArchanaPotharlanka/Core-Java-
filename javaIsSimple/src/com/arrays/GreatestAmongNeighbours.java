package com.arrays;

public class GreatestAmongNeighbours {

	public static void main(String[] args) {
		System.out.println("Main method started");
		int[] arr = { 1, 0, 2, 3, 1, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				if (arr[i] > arr[i + 1]) {
					System.out.println(arr[i]);
				}
			} else if (i == arr.length - 1) {
				if (arr[i] > arr[i - 1]) {
					System.out.println(arr[i]);
				}
			} else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}

		}
	}

}
