package com.StringsInJava;

public class StringBufferandStringBuilder {
	
	public void stringBufferClassExample() {
		
		StringBuffer strFirstName = new StringBuffer("Shikhar ");
		StringBuffer strLastName = new StringBuffer("Dhawan");
		
		strFirstName.append(strLastName); //It changes the original string, does not create new object
		
		System.out.println("Full Name is : "+strFirstName);
		
		strFirstName.reverse(); //Reverse method
		System.out.println("Reverse of String : "+strFirstName);
		
	}
	
	public void stringBuilderClassExample() {
		
		StringBuilder strString1 = new StringBuilder("Welcome to ");
		StringBuilder strString2 = new StringBuilder("VSTL");
		
		strString1.append(strString2);
		System.out.println("String after Append : "+strString1);
	}

}
