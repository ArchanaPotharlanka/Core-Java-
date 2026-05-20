package com.constructors;

public class TestDemo {
	int id;
	String name;
	long phone;
	String city;
	//Interview Question: Why do we need constructor when instance block exists?
	//
	{
		System.out.println("Instance Block called ");
	}
	TestDemo(){
		System.out.println("No-arg Constructor called ");
		id=20;
		name="ARchana";
		phone=9865422654L;
		city="Nandigama";
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		TestDemo t = new TestDemo();
		t.show();
	}
	void show(){
		System.out.println("Id :" +id);
		System.out.println("Name :"+name);
		System.out.println("Phone :"+phone);
		System.out.println("City :" +city);
		
	}

}
