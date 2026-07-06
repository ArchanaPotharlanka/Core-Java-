package com.arrays;

public class CountOccurances {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3, 6, 5, 4, 8, 9, 7, 5, 1, 2, 3, 6, 4 };

		boolean[] arr1 = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr1[i]) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					arr1[j] = true;

				}

			}
			System.out.println(arr[i] + "-->" + count);
		}

//		for (int i = 0; i < arr.length; i++) {
//
//		    int j;
//		    for (j = 0; j < i; j++) {
//		        if (arr[i] == arr[j]) {
//		            break;
//		        }
//		    }
//
//		    if (j != i) {
//		        continue;
//		    }
//
//		    int count = 0;
//
//		    for (j = 0; j < arr.length; j++) {
//		        if (arr[i] == arr[j]) {
//		            count++;
//		        }
//		    }
//
//		    System.out.println(arr[i] + " -> " + count);
//		}
	}

}
