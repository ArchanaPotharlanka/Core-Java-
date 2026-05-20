package com.constructors;

public class Student {
	int id;
	String name;
	String course;
	String clgName;
	long phone;
	Student(int id,String name,String course,String clgName,long phone){
		System.out.println("Parameterized constructor called");
		this.id=id;
		this.name=name;
		this.course=course;
		this.clgName=clgName;
		this.phone=phone;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s1=new Student(26,"Archana","Java Full Stack ","Vcube",9248908823L);
		s1.show();	
		Student s2=new Student(33,"Anjali","Java Full stack ", "Vcube", 9456324456L);
		s2.show();
		Student s3=new Student(25,"Thanmai ","Java Full stack ","Vcube ", 9884451455L);
		s3.show();
		System.out.println("main method ended");
	}
	void show(){
		System.out.println("*******************");
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Course :" +course);
		System.out.println("College Name :"+clgName);
		System.out.println("Phone :"+phone);
	}

}
