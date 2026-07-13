package com.arrays;

import java.util.Arrays;

public class MovingZerosToEnd {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 1, 0, 3, 12, 0, 0 };

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j++] = arr[i];
			}
		}
		while (j < arr.length) {
			arr[j++] = 0;

		}
		System.out.println(Arrays.toString(arr));
	}

}
