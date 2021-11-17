package TestPackage;

public class PvrDemo extends TheatreDemo 
{
	

	public static void main(String[] args)
	{
		PvrDemo pd=new PvrDemo();
		
		pd.parking();
		pd.soundsytem();
		pd.ticketbooking();
	onlinebooking("avail");

	}


	void parking() 
	{
		System.out.println("Parking price for 2-wheeler=40, 4-wheeler=60");	
		
	}

	
	void soundsytem()
	{
		System.out.println("Extra Digital Dolby sound systems");	
		
	}

	
	void ticketbooking() 
	{
		System.out.println("Ticket prices for third class=50, 2nd class=100, 1st class=200");
	}

}
