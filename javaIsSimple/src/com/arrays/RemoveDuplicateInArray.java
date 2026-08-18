package com.arrays;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int newLength = 0;
		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[newLength++] = arr[i];
			}
		}
		arr[newLength] = arr[arr.length - 1];
		for (int j = 0; j <=newLength; j++) {
			System.out.println(arr[j]);
		}
	}

}
