package com.arrays;

public class MovingNegativeElementsToLeft {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 1, -2, 5, -4, 3, -6 };
		// -2 1 5 -4 3 -6
		// -2 -4 1 5 3 -6
		// -2 -4 1 5 3 -6
		// -2 -4 1 5 -6 3
		// -2 -4 -6 1 5 3
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				temp = arr[i];
				int j = i;
				while (j > 0 && arr[j - 1] >= 0) {
					arr[j] = arr[j - 1];
					j--;
				}
				arr[j] = temp;
			}

		}
//		for (int k = 0; k < arr.length; k++) {
//			if (arr[k] < 0) {
//				if (arr[k] < arr[k + 1] && arr[k + 1] < 0) {
//					temp = arr[k];
//					arr[k] = arr[k + 1];
//					arr[k + 1] = temp;
//				}
//			}
//		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
