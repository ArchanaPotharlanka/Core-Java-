package com.arrays;

public class CopyingArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] copyarr = new int[arr.length];
//		int[] copyarr = arr;
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(copyarr[i]+" ");
//		}

		for (int i = 0; i < arr.length; i++) {
			copyarr[i] = arr[i];
		}
		for(int e:copyarr) {
			System.out.println(e);
		}
	}

}
