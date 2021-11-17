package com.strings.practice;

public class StringA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//How to change the first character to uppercase(init cap) in java?
		
		String str1="welcome";
		String str2="Java programming online";
	System.out.println(str1.charAt(3));
	System.out.println(str1.toUpperCase());
	
	System.out.println(str2.contains("Java"));
	System.out.println(str2.charAt(0));
	//String str3=str2.charAt(0).toUppercase();
	//System.out.println(str3);
	System.out.println(str1.length());
	System.out.println(str2.length());
	//System.out.println(str1.replaceFirst(str2,1);

	//String str4=str1.substring(0,2).toUpperCase()+str1.substring(1);
	String str4=str1.substring(0,1).toUpperCase()+str1.substring(1,str1.length());
	System.out.println(str4);
	
	String sText5="github is a product from Microsoft";
	
	System.out.println(sText5.substring(10));
	System.out.println(sText5.substring(0, 5));
	System.out.println(sText5.substring(0,1).toUpperCase()+sText5.substring(1));// The substring begins at the specified beginIndex andextends to the character at index endIndex - 1.
	//System.out.println(sText5.charAt(0).toUpperCase()+sText5.substring(1));
	
	//System.out.println(sText5.charAt(0).toUpperCase());//Cannot invoke toUpperCase() on the primitive type char
	
	
	}

}
