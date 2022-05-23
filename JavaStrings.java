package com.StringsInJava;

public class JavaStrings {
	
	//String: It is a sequence of characters in java. String is a class in java that allows us to perform various operations on string.
	//We can create strings in java in two ways:
	//1) String Literal: It will not create two different objects for same string. It will refer the same value using two different objects, if string value is same.
	// It uses the string constant pool to store the object.
	
	//2) Using new keyword: It can create two different objects for same string value. First object will be store in string constant pool and
	//second will be stored in Java Heap Memory.
	
	public void stringCreationMethods() {
		
		//String Literal
		String strFirstName = "Virat"; 
		String strFirstNameCopy = "Virat"; //It provides the reference of Name 1 and store only one string in pool.
		System.out.println("First Name is : "+strFirstName);
		System.out.println("Second Name is : "+strFirstNameCopy);
		
		String strLastName = "Kohli";
		String strFullName = strFirstName+" ".concat(strLastName); //it will create the new object in memory.
		System.out.println("Full Name is : "+strFullName);
		
		//Using new keyword
		String strFirst = new String("Rohit"); //This will create new object in String Pool.
		String strFirstCopy = new String("Rohit"); //This will create object in Heap area.
		
		String strLast = new String("Sharma");
		
		String strFull = strFirst+" ".concat(strLast);
		System.out.println("Full Name is : "+strFull);
						
	}

}
