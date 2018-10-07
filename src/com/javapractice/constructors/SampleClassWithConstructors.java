package com.javapractice.constructors;

public class SampleClassWithConstructors {

	public SampleClassWithConstructors() {
		// TODO Auto-generated constructor stub
	}
	
	public SampleClassWithConstructors(String name, String message) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor with arguements "+ name + message);
	}
	
	public SampleClassWithConstructors(String name, Integer number) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor with arguements  "+ name + number);
	}
	
	public void SimpleMethod()
	{
		System.out.println("Simple method-Not a constructor");
	}

	
}
