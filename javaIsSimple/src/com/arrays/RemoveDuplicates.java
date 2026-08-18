package com.arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
		if (arr.length == 0) {
			return;
		}

		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;

			}
		}
		arr[j] = arr[arr.length - 1];

		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 2, 3, 4, 4};
//
//        if (arr.length == 0) {
//            return;
//        }
//
//        int j = 0; // slow pointer
//
//        for (int i = 1; i < arr.length; i++) { // fast pointer
//            if (arr[i] != arr[j]) {
//                j++;
//                arr[j] = arr[i];
//            }
//        }
//
//        for (int i = 0; i <= j; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println("\nUnique Count = " + (j + 1));
//    }
//}
