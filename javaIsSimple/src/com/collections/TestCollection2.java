package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection2 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Collection<String> c1 = new ArrayList<>();
		c1.add("Ramesh");
		c1.add("kiran");
		c1.add("prabhas");
		c1.add("siva");
		c1.add("Rasool");
		System.out.println(c1);

		Collection<String> c2 = new ArrayList<>();
		c2.add("Archana");
		c2.add("Harika");
		c2.add("Koti");
		c2.add("Thanmai");
		c2.add("Kouser");
		System.out.println(c2);
		c2.remove("Kouser");
		System.out.println(c2);

		Collection<String> c3 = new ArrayList<>();
		c3.addAll(c1);
		c3.addAll(c2);
		c2.clear();
		
		System.out.println("***********");
		
		System.out.println(c2.isEmpty());
		System.out.println(c2);
		System.out.println(c3.containsAll(c2));
		System.out.println(c3);
	}

}
