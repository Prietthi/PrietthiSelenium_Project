package TestPackage;

public class ImaxDemo extends TheatreDemo 
{

	public static void main(String[] args)
	{
	ImaxDemo id=new ImaxDemo();
	id.parking();
	id.soundsytem();
	id.ticketbooking();
onlinebooking("not available");
	}

	
	void parking()
	{
		System.out.println("Parking price for 2-wheeler=20, 4-wheeler=50");
		
	}

	
	void soundsytem() 
	{
		System.out.println("Digital Dolby sound systems");
		
	}

	
	void ticketbooking() 
	{
		System.out.println("Ticket prices for third class=20, 2nd class=50, 1st class=100");
		
	}

}
