package com.arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] nums = { 11, 2, 15, 7 };
		int target = 9;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					System.out.println(i + " " + j);
					return;

				}

			}
		}
		System.out.println("Pair not found");

	}

}
