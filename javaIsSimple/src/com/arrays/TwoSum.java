package com.arrays;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 2, 7, 11, 15 };
		int start = 0;
		int end = arr.length - 1;
		int target = 9;
		boolean found = false;
		while (start < end) {
			if (arr[start] + arr[end] == target) {
				System.out.println(start + " " + end);
				found = true;
				break;
			} else if (arr[start] + arr[end] < target) {
				start++;

			} else if (arr[start] + arr[end] > target) {
				end--;
			}
		}
		if (!found) {
			System.out.println("Elemeent not found");
		}

	}

}
