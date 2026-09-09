package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		Collection<Integer> col1 = new ArrayList<>();
		Collection<Integer> col2 = new ArrayList<>();
		col1.add(10);
		col2.add(10);
		System.out.println(col1.hashCode());
		System.out.println(col2.hashCode());
		System.out.println(col1.equals(col2));
		col1.add(30);
		col2.add(20);
		col1.add(20);
		col2.add(30);
		System.out.println(col1.hashCode());
		System.out.println(col2.hashCode());
		System.out.println(col1);
		System.out.println(col2);
		System.out.println(col1.equals(col2));
		
		
		//Hashcode Calculation of col2:
		//[10,20,30]==
		//Hash=31*1+10==41
		//hash=31*41+20==1291
		//hash=31*1291+30==40051
	}

}
