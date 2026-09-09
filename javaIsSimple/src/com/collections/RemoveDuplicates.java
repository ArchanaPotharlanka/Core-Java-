package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println("Main method started");
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(20);
		li.add(40);

		for (int i = 0; i < li.size(); i++) {
			int m = li.get(i);
			for (int j = i + 1; j < li.size(); j++) {
				int n = li.get(j);
				if (m == n) {
					li.remove(j);
				}

			}

		}
		for (int n : li) {
			System.out.println(n);
		}

	}

}
