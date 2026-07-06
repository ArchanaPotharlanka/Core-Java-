package com.dsaproblems;

public class LCProblemTwoPointer {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 2, 4, 8, 10, 1 };
		int target = 6;
		int[] arr11 = twoSum(arr, target);
		for(int i: arr11) {
			System.out.print(i+" ");
		}
	}

	public static int[] twoSum(int[] arr, int target) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[0];
	}

}
