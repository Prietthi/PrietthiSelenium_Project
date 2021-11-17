package TestPackage;

public abstract class TheatreDemo 

{
abstract void parking();
abstract void soundsytem();
abstract void ticketbooking();
static void onlinebooking(String a)
{
	System.out.println("Ticket booking is "+ a);
}
TheatreDemo()
{
	System.out.println("Welcome");
}
	public static void main(String[] args)
	{
	//parking();
	//TheatreDemo td=new TheatreDemo();	
	TheatreDemo.onlinebooking("available");
	}

}
