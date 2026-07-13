package com.arrays;

import java.util.Arrays;

public class MergingArray {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] array1 = { 1, 3, 5, 7 };
		int[] array2 = { 2, 4, 6, 8 };
		int[] mergedArray = new int[array1.length + array2.length];
		int i;
		for (i = 0; i < array1.length; i++) {
			mergedArray[i] = array1[i];

		}
		for (int j = 0; j < array2.length; j++) {
			mergedArray[i++] = array2[j];

		}
		System.out.println("Merged Array : " + Arrays.toString(mergedArray));
	}

}
