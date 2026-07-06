package com.dsaproblems;

public class TwoPointerSumTestDemo2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 10;
		int start = 0;
		int end = arr.length-1;
		boolean found = false;

		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == target) {
				System.out.println(start + " " + end);
				start++;
				end--;
				found = true;

			} else if (sum > target) {
				end--;
			} else {
				start++;
			}

		}
		if (!found) {
			System.out.println("Target sum not found ");
		}

	}

}
