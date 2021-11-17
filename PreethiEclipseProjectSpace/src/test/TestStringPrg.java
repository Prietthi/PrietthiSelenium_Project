package test;

public class TestStringPrg {


	public static void main(String[] args) 
	{
				String x="    He  llo  world   ";
		System.out.println(x.trim());
		String y="";
		System.out.println(y.isEmpty());
		String m="abc";
		System.out.println(m.concat(x));
		System.out.println(x.replace("world", "India"));
		System.out.println("Welcome Java");
System.out.println("Hello Java");	
System.out.println("Programming in Java");	


char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch);  

String s1="javatpoint";  
System.out.println(ch);
System.out.println(s);
System.out.println(s1);

String s2="java";//creating string by Java string literal    
char ch1[]={'s','t','r','i','n','g','s'};    
String s3=new String(ch1);//converting char array to string    
String s4=new String("example");//creating Java string by new keyword    
System.out.println(s2);    
System.out.println(s3);    
System.out.println(s4);    


System.out.println(s1.isEmpty());
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s2.replace("java", "J2SE"));

int[] marks= {40,10,50,70,60};
String[] students= {"sandeep","arun","Sheshu","sheenu","ravi", "swetha"};
System.out.println(marks.length);
System.out.println(students.length);
		}
}


