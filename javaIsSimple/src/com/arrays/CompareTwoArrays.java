package com.arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr1 = { 25, 41, 80, 72, 85, 63, };
		int[] arr2 = { 41, 80, 25, 72, 85, 63, };

		boolean status;

//		/*boolean status = true;
//		for (int i = 0; i < arr1.length;) {
//			if (arr1[i] == arr2[j]) {
//				i++;
//				j++;
//			} else {
//				status = false;
//
//				break;
//			}
//		}
//
//		if (status) {
//			System.out.println("***Two arrays are same***");
//		} else {
//			System.out.println("***The two arrays are not same***");
//		}*/
		boolean found = false;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("Two array elements are  same");
		} else {
			System.out.println("Two array elements are not same");
		}

	}

}
