package com.collections;

import java.util.ArrayList;
import java.util.List;

public class UniquePairs {

	public static void main(String[] args) {
		System.out.println("Main method started");
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(7);
		li.add(4);
		li.add(3);
		li.add(5);
		li.add(8);
		li.add(1);
		System.out.println(li);

		for (int i = 0; i < li.size(); i++) {
			int m = li.get(i);
			for (int j = i + 1; j < li.size(); j++) {
				int n = li.get(j);
				if (m + n == 9) {
					System.out.print(m+" ");
					System.out.print(n);
					System.out.println();
				}

			}

		}

	}

}
