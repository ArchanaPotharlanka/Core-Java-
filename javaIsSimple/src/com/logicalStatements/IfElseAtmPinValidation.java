package com.logicalStatements;

import java.util.Scanner;

public class IfElseAtmPinValidation {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int pin = 8520;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin! ");
		int p=sc.nextInt();
		if(p==pin) {
			System.out.println("Access Granted ");
		}else {
			System.out.println("Invalid pin");
		}
		
	}

}
