package com.arrays;

public class TestDemo {

	public static void main(String[] args) {
		int arr[] = new int[5];

		int sum = 0;
		int avg = 0;

		arr[0] = 98;
		arr[1] = 97;
		arr[2] = 99;
		arr[3] = 95;
		arr[4] = 92;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Index " + i + " : " + arr[i]);
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Sum of the Marks :" + sum);
		System.out.println("Average of the Marks :" + avg);

	}

}
