package com.arrays;

public class SecondMin {

	public static void main(String[] args) {
		System.out.println("Finding Second minimum element ?");
		int[] arr = { 5, 8, 63, 3, 1, 4, 8, 9, 2 };
		int smallest = arr[0];
		int secondSmallest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && secondSmallest != smallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest Element :" + smallest);
		System.out.println("Second smallest Element :" + secondSmallest);
	}

}
