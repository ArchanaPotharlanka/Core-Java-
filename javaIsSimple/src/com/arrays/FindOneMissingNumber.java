package com.arrays;

public class FindOneMissingNumber {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int i : arr) {
			actualSum += i;
		}
		System.out.println("Missing number : " + (sum - actualSum));

//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != i + 1) {
//				System.out.println("Missing Number = " + (i + 1));
//				return;
//			}
//		}
//
//		System.out.println("Missing Number = " + (arr.length + 1));
	}
}