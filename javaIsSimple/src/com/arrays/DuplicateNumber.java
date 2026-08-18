package com.arrays;

public class DuplicateNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4 };

		boolean[] visited = new boolean[arr.length];

		for (int num : arr) {

			if (visited[num]) {
				System.out.println(num);
				break;
			}

			visited[num] = true;
		}
	}
}