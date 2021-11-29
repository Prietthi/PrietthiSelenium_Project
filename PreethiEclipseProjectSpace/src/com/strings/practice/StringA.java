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
	
	}

}
