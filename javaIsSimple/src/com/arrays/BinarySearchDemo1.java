package com.arrays;

public class BinarySearchDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		int[] arr = { 1, 3, 5, 7, 9, 12, 15, 18, 20, 26, 29 };
		int target = 18;
		int index = binaryseach(arr, target);
		System.out.println(index);
	}

	static int binaryseach(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;

	}

}
