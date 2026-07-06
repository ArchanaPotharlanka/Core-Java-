package com.dsaproblems;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 1, 3, 5, 8, 9, 13, 16, 18, 22, 25, 29 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target element ");
		int target = sc.nextInt();
		int ans = binarySearch(arr, target);
		System.out.println("Element found at " + ans);

		if (ans == -1) {
			System.out.println("Target element not found in the array");
		}

	}

	static int binarySearch(int[] arr, int target) {

		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				l = mid + 1;

			} else {
				r = mid - 1;
			}

		}
		return -1;

	}

}
