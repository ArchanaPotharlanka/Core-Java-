package com.arrays;

public class CheckingArraySortedOrNot {

	public static void main(String[] args) {
		System.out.println(" main method started ");
		int[] arr = { 10, 20, 30, 40, 50, };
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0;
			if (arr[i] > arr[i + 1]) {
//				temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
				count++;
			}

//			if (arr[i] < arr[i + 1]) {
//				flag = true;
//			} else {
//				flag = false;
//			}

		}
//		if (flag == false) {
//			System.out.println("Array is not sorted ");
//		} else {
//			System.out.println("Array is sorted ");
//		}

		if (count == 0) {
			System.out.println("Array is sorted ");
		} else {
			System.out.println("Array is not sorted ");
		}
	}

}
