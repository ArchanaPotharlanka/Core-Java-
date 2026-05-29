package com.arrays;

public class SortingArrayinAscendingOrder {

	public static void main(String[] args) {
		System.out.println("Sorting array in ascending order");
		int[] arr = { 5, 8, 3, 1, 2, 6, 9, 7, 4 };

		System.out.println("Before Sorting :");
		for (int each : arr) {
			System.out.print(each + " ");
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
//if i keep j=1 then for every i the j value is 1 only so to change this we keep j=i+1 
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println();
		System.out.println("After Sorting :");
		for (int each : arr) {
			System.out.print(each + " ");
		}
	}

}
