package com.arrays.sortings;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 6, 5, 4, 3 };
		System.out.println("Before Sorting :" + Arrays.toString(arr));
		divide(arr);
		System.out.println("After sorting :" + Arrays.toString(arr));
	}

	public static void divide(int[] arr) {
		//whenever we are working with recursion then at starting of the method we must need to
	   //	specify the ending condition other wise it will throw stack out of bound exception
		if (arr.length <= 1) {
			return;
		}
		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];
		int i = 0;
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];

		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];

		}
		divide(left);
		System.out.println("Left Array :" + Arrays.toString(left));
		divide(right);
		System.out.println("Right Array :" + Arrays.toString(right));
		mergeSort(left, right, arr);

	}

	public static void mergeSort(int[] l, int[] r, int[] arr) {

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < l.length && j < r.length) {
			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}

		}
		while (i < l.length) {
			arr[k++] = l[i++];
		}
		while (j < r.length) {
			arr[k++] = r[j++];
		}

	}

}
