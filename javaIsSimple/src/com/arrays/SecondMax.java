package com.arrays;

public class SecondMax {

	public static void main(String[] args) {
		System.out.println("Finding the second max ?");
		int[] arr = { 8, 5, 9, 6, 3, 4, 8, 85, 69, 35, 65, 98 };
		int firstMax = arr[0];
		int secondMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			} else if (arr[i] > secondMax && arr[i] != firstMax) {
				secondMax = arr[i];
			}
		}
		System.out.println("Maximum Element :" + firstMax);
		System.out.println("Second maximum element :" + secondMax);

	}

}
