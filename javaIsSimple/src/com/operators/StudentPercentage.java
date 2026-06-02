package com.operators;

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the student ?");
			String name = sc.next();
			System.out.println("Enter the marks of java ?");
			int java = sc.nextInt();
			System.out.println("Enter the marks of database ?");
			int sql = sc.nextInt();
			System.out.println("Enter the marks of html ?");
			int html = sc.nextInt();
			System.out.println("Enter the marks of css ?");
			int css = sc.nextInt();
			System.out.println("Enter the marks of javascript ?");
			int js = sc.nextInt();
			int totalMarks = java + sql + html + css + js;
			System.out.println("*****************************");
			System.out.println("Name of the student is :" + name);
			System.out.println("Marks of Java :" + java);
			System.out.println("Marks of Sql :" + sql);
			System.out.println("Marks of html :" + html);
			System.out.println("Marks of css :" + css);
			System.out.println("Marks of Javascript :" + js);
			System.out.println("Total marks of " + name + " is " + totalMarks);
			int avg = totalMarks / 5;
			System.out.println("Average is :" + avg);
			System.out.println("******************************");
		}

	}

}
