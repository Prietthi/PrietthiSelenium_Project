package TestPackage;

public class VivoDemo implements MobileDemo 
{

	
	public static void main(String[] args) 
	{
		VivoDemo vd=new VivoDemo();
		vd.Demo();
		MobileDemo.modelname("Vivo");
		
		vd.price();

		vd.camerapixelsize();
		vd.storagespace();
	}

	public void price() 
	{
		
		System.out.println("Vivo price is 20000Rs");	
	}

	
	public void camerapixelsize() 
	{
		System.out.println("CameraPixel size is 8MP photo quality");	
	}

		
	public void storagespace() 
	{
		System.out.println("Storage allocated is 16GB");		
		
	}

}
