package com.dsaproblems;

public class SlidingWindow {

	public static void main(String[] args) {
		System.out.println(" main method started ");
		int[] users = { 10, 21, 36, 30, 12, 13, 11, 15, 16 };
		int key = 3;
		int windowSum = 0;
		for (int i = 0; i <= key; i++) {
			windowSum += users[i];

		}
		System.out.println("Total users visited :" + windowSum);
		for (int i = 1; i <= users.length - key; i++) {
			windowSum = windowSum - users[i - 1] + users[i + key - 3];
			System.out.println("Total users visited :" + windowSum);
		}
	}

}
