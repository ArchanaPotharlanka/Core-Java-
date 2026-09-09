package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEach {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = sc.next();
		char[] c = string.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < c.length; i++) {
//
//			if (map.containsKey(c[i])) {
//				map.put(c[i], map.get(c[i]) + 1);
//
//			} else {
//				map.put(c[i], 1);
//			}
//
//		}
//
		for (Character each : c) {
			map.put(each, map.getOrDefault(each, 0) + 1);

		}
		System.out.println(map);

	}

}
