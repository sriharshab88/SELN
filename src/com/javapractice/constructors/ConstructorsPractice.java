package com.javapractice.constructors;

public class ConstructorsPractice {
	
	public static void main(String args[])
	{
		useConstructors();
	}
	
	public static void useConstructors()
	{
		SampleClassWithConstructors constructors=new SampleClassWithConstructors();
		constructors.SimpleMethod();
		
		SampleClassWithConstructors constructors1=new SampleClassWithConstructors("JAVA", 12);
		
		SampleClassWithConstructors constructors2=new SampleClassWithConstructors("JAVA", "Batch");		
	}

}
