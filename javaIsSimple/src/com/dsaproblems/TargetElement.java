package com.dsaproblems;

public class TargetElement {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int target = 40;
		int index = -1;
//		boolean found = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
//				System.out.println(i);
//				found = true;
				index = i;
			}

		}
		System.out.println(index);

	}

}
