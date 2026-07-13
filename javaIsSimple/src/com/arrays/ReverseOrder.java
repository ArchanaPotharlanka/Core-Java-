package com.arrays;

import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int elements[] = { 1, 2, 3, 4, 5};
//
//		for (int i = elements.length - 1; i >= 0; i--) {
//			System.out.print(elements[i] + " ");
//		}
//		int j=0;
//		for(int i=elements.length-1;i>=0;i--) {
//			elements[j]=elements[i];
//			j++;
//		}
		int start=0;
		int end=elements.length-1;
		int temp=0;
		
		
		while(start<end) {
			temp=elements[start];
			elements[start]=elements[end];
			elements[end]=temp;
			start++;
			end--;
			
		}
				
		System.out.println(Arrays.toString(elements));
	}

}
