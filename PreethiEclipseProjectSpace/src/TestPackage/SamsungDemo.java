package TestPackage;

public class SamsungDemo implements MobileDemo 
{

	public static void main(String[] args)
	{
	SamsungDemo sd=new SamsungDemo();
	sd.Demo();
	MobileDemo.modelname("Samsung Galaxy S9");
	
	sd.price();

	sd.camerapixelsize();
	sd.storagespace();

	}

	
	public void price()
{
	System.out.println("Samsung Galaxy S9 price is 40000Rs");	
	}

	
	public void camerapixelsize() 
	{
		System.out.println("CameraPixel size is 16MP with better photo quality");
		
	}


	public void storagespace() 
	{
	System.out.println("Storage allocated is 32GB");	
		
	}


}
