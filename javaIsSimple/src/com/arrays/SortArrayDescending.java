package com.arrays;

public class SortArrayDescending {

	public static void main(String[] args) {
		System.out.println("Sorting Array in Descending order ");

		int[] arr = { 5, 8, 3, 1, 2, 6, 9, 7, 4 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
