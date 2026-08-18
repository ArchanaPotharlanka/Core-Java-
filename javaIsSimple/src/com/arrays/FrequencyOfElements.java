package com.arrays;

public class FrequencyOfElements {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		int[] arr = { 10, 20, 10, 20, 10, 50, 60, 80, 70, 90, 80, 40, 50, 60, 70, 80 };
		boolean rep[] = new boolean[arr.length];
//		char rep[]=new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (rep[i])// rep[i]=a)
			{
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					rep[j] = true;	
//					rep[j]=a;
				}
			}
			System.out.println("Frequency of " + arr[i] + "is:" + count);
		}
	}

}
