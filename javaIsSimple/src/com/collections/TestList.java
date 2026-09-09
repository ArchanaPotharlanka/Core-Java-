package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<Integer> lt = new ArrayList<>();
		lt.add(10);
		lt.add(0, 80);
		lt.add(20);
		lt.add(30);
		lt.add(null);
		lt.add(null);
		lt.add(null);
		lt.add(null);
//		lt.add(9, 5);
		System.out.println(lt);
	}

}
