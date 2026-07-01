package com.arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 0, 1, 0, 3, 12,0,5,0,1,3,0 };
		// 1 0 0 3 12
		// 1 3 0 0 12
		// 1 3 12 0 0

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				} else {
					break;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
