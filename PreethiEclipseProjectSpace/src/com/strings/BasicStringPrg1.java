package com.strings;

public class BasicStringPrg1 {

	public static void main(String[] args) {
//How to change the first character to uppercase(init cap) in java?	
String a="great responsibility";
String b=a.substring(0, 1).toUpperCase()+a.substring(1).toLowerCase();
//substring(0,1) indicates 0 to 1st character then end character 1 to -1;
System.out.println(b);

	
//How to identify the duplicate characters in a String?
char a1[]=a.toCharArray();
System.out.println(a1);

	for(int i=0;i<a1.length;i++)
		for(int j=i+1;j<a1.length;j++)
			if(a1[i]==a1[j]) {
				System.out.println(a1[i]);
						}
	

	
	//How to find the number of occurences of a character in a string?
	System.out.println(a1);
	int count=0;
	char c='e';
	for(int k=0;k<a1.length;k++)
		if(a1[k]==c)
			count++;
		//	System.out.println(a1[k]);
	System.out.println(+count);

	//How to reverse a String without using any internal methods?
	
	/*for(int m=0;m<a1.length;m++)
		//for(int n=a1.length;a1.length;--n)
		System.out.println(a1[n]);
	*/
	//How to find the position number or index of the last occurence of a character?
	System.out.println(a.indexOf('y'));
	System.out.println(a.length()-1);
	}

}
