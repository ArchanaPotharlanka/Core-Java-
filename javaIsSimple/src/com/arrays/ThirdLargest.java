package com.arrays;

public class ThirdLargest {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 25, 42, 96, 36, 58, 74, 20, 12, 36, 49 };
//		int[] arr= {10,20,30};
		int firstLargest = arr[0];
		int secondLargest = arr[0];
		int thirdLargest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != secondLargest) {
				secondLargest = arr[i];

			} else if (arr[i] > thirdLargest && arr[i] != firstLargest && arr[i] != secondLargest) {
				thirdLargest = arr[i];
			}
		}
		System.out.println("First largest " + firstLargest);
		System.out.println("Second largest " + secondLargest);
		System.out.println("Third largest " + thirdLargest);
	}

}
