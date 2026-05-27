package com.arrays;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		System.out.println("Finding average of all array elements:");
		int[] arr = { 1, 5, 2, 9, 6, 3, 4, 87, 100 };
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average of all the elements :" + avg);
	}

}
