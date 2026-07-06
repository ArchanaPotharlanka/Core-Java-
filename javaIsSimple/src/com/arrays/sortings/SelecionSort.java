package com.arrays.sortings;

public class SelecionSort {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 64, 25, 12, 22, 11 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
