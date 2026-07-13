package com.arrays.sortings;

public class QuickSort {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(" Quick sort ");
		int[] arr = { 8, 7, 5, 4, 2, 3, 10, 6 };
		int low = 0;
		int high = arr.length - 1;
		if (low < high) {

			int pivotIndex = quickSort(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int quickSort(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		int temp = 0;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		}
		temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}