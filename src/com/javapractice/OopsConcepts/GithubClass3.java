package com.javapractice.OopsConcepts;

import com.javapractice.constructors.SampleClassWithConstructors;

public class GithubClass3 {

	
	public static void useConstructors()
	{
		SampleClassWithConstructors constructors=new SampleClassWithConstructors();
		constructors.SimpleMethod();
		
		SampleClassWithConstructors constructors1=new SampleClassWithConstructors("JAVA", 12);
		
		SampleClassWithConstructors constructors2=new SampleClassWithConstructors("JAVA", "Batch");		
	}
}
