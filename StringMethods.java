package com.StringsInJava;

public class StringMethods {
	
	public void charAtMethodExample(int intIndexValue) {
		
		String strCompanyName = "Verve Square Technologies Pvt. Ltd";
		char charIndexLetter = strCompanyName.charAt(intIndexValue); //It returns the character present at given index.
		
		if(charIndexLetter == ' ') {
			System.out.println("Space is present at given index");
			
		}else {
					
		System.out.println("The letter at index "+intIndexValue+" is : "+charIndexLetter);
		}
	}
	
	//To check the frequency of character in string
	public void frequencyCheckInString(char charLetter) {
		
		String strCompanyName = "Verve Square Technologies Pvt. Ltd";
		int intCount = 0;
		
		for(int intCheck=0; intCheck<=strCompanyName.length()-1; intCheck++) {
			if(strCompanyName.charAt(intCheck)==charLetter) {
				intCount++;
			}
		}
		System.out.println("The frequency of the letter "+charLetter+" is : "+intCount);
	}
	
	
	//Comparison of two strings
	//If both strings are same, then it will return 0.
	//If any difference, it will return the difference value according to aphabetical series.
	public void comparisonOfStrings() {
		
		String strFirstWord = "Hello";
		String strSecondWord = "Cello"; //It returns 5 because 'C' is 5 places biggerthan 'H'.
		
		int intCompare = strFirstWord.compareTo(strSecondWord);
		System.out.println("Comparison Value is : "+intCompare);
	}
	
	
	//Contains Method
	public void toCheckStringContainsWord(String strWord) {
		
		String strCompanyName = "Verve Square Technologies Pvt. Ltd";
		
		if(strCompanyName.contains(strWord)) {
			System.out.println("Given string contains the word : "+strWord);
		}else {
			System.out.println("Given string does not contains the word : "+strWord);
		}
	}
	
	//endsWith Method
	public void toCheckEndingString(String strEnd) {
		
		String strCompanyName = "Verve Square Technologies Pvt. Ltd";
		boolean blnEndCheck = strCompanyName.endsWith(strEnd);
		
		System.out.println("String ends with "+strEnd+" : "+blnEndCheck);
	}
	
	//Equals Method
	public void toCheckEqualityOfStrings() {
		
		String strName1 = "rohit";
		String strName2 = "rohit";
		String strName3 = "Rohit";
		String strName4 = "ROHIT";
		
		System.out.println("Name1 and Name2 are equal : "+strName1.equals(strName2));
		System.out.println("Name1 and Name3 are equal : "+strName1.equals(strName3));
		
		System.out.println("Name1 and Name4 are equal : "+strName1.equalsIgnoreCase(strName4));//Ignores the Case
	}
	
	//To upper and lower case
	public void toChangeTheCase(String strCompanyName) {
		
		String strUpperCase = strCompanyName.toUpperCase();
		String strLowerCase = strCompanyName.toLowerCase();
		
		System.out.println("Company Name : "+strCompanyName);
		System.out.println("Converted into Upper Case : "+strUpperCase);
		System.out.println("Converted into Lower Case : "+strLowerCase);
		
	}

}
