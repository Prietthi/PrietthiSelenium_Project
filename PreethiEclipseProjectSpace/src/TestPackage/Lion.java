package TestPackage;
public class Lion 
{

	 String name;
	 int age;
	
	Lion(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	void sleep()
	{
		System.out.println(name+" is sleeping");
		
	}
	void run()
	{
		System.out.println("Rock is running at age"+age);
		
	}
	
	
	public static void main(String[] args)
	
	{
		Lion l=new Lion("Kicko",2);
		l.sleep();
		l.run();
		

	}	
		
	}
