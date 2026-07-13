package com.arrays;

public class ReArrangeMax_MinArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 ,7,8};
		int[] result = new int[arr.length];
		int k = 0;
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			result[k++] = arr[end--];
			result[k++] = arr[start++];
		}
		for (int i : result) {
			System.out.print(i + " ");
		}

	}

}
