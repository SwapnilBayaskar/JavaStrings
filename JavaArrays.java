package com.Arrays;

public class JavaArrays {
	
	public void singleDimensionalArray() {
		
		int intPrimeArray[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
		
		for(int intIndex=0; intIndex<intPrimeArray.length; intIndex++) {
			
			System.out.println("Value at index "+intIndex+" is : "+intPrimeArray[intIndex]);
		}
		System.out.println("\n");
		
		//Using for-each loop
		System.out.println("All elements in Prime array");
		for(int intArray : intPrimeArray) {
			
			System.out.println(intArray);
		}
	}
	
	public void multiDimensionalArray() {
		
		String strNameArray[][] = {{"Rohit","Virat","Shreyas"},{"Sharma","Kohli","Iyyer"},{"MI","RCB","KKR"}};
		
		for(int intArray=0; intArray<3; intArray++) {
			for(int intArray1=0; intArray1<3; intArray1++) {
							
			System.out.println(strNameArray[intArray][intArray1]+" ");
			}
			System.out.println();
		}
	}
	 

}
