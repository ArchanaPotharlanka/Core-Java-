package com.arrays;

public class SumOfElements {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int sum = 0;
		int avg = 0;
		int arr[] = { 99, 98, 97, 95, 96, 94 };
		for (int a : arr) {
			sum += a;

		}
		avg = sum / arr.length;
		System.out.println("Sum of the elements :" + sum);
		System.out.println("Average of the elements :" + avg);

	}

}
