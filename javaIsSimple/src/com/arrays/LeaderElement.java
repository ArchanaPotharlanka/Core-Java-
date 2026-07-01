package com.arrays;

public class LeaderElement {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
//			int max = arr[i];
			boolean ldr = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					ldr = false;
					break;
				}
			}
			if (ldr) {
				System.out.println(arr[i]);

			}

		}

//		int[] arr= {16,17,4,3,5,2};
//		int leader=arr[arr.length-1];
//		for(int i=arr.length-1;i>=0;i--) {
//			if(arr[i]>leader) {
//				System.out.println(arr[i]);
//				leader=arr[i];
//			}
//		}

	}

}
