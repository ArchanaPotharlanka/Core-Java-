package com.arrays.sortings;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Bubble sorting :");
		int[] arr = { 8, 5, 9, 6, 3, 4, 8, 85, 69, 35, 65, 98 };
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp = 0;
		int count = 0;
		int count1 = 0;
		System.out.println("Before Sorting :");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
				count++;
			}
			if (!swapped) {
				break;
			}
			count1++;
		}
		System.out.println();
		System.out.println("Inner for loop iterations :" + count);
		System.out.println("Outer for loop iterations :" + count1);
		System.out.println("After Sorting :");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
