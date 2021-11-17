package TestPackage;

public interface MobileDemo 
{
	static void modelname(String a)
	{
		System.out.println("Mobile model is "+a);
	}
abstract void price();
abstract void camerapixelsize();
abstract void storagespace();

default void Demo()
{
	System.out.println("Welcome to default Demo from MobileDemo Interface");
}

public static void main(String[] args)
{

MobileDemo.modelname("SmartPhone");
}
}
