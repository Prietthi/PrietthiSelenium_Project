package TestPackage;

class EncapsulationDm
{
private String username="preethi";
private String password="safe123";
	

public String getUsername() 
{
	return username;
}

public void setUsername(String username) 
{
	this.username = username;
}

public String getPassword() 
{
	return password;
}

public void setPassword(String password) 
{
	this.password = password;
}

public static void main(String[] args) 
{
EncapsulationDm ed=new EncapsulationDm();
System.out.println(ed.username);
System.out.println(ed.password);
}
}

public class EncapsulationTs extends EncapsulationDm
{
	public static void main(String[] args) 
	{
		System.out.println("Inside Test class");
	EncapsulationTs ed=new EncapsulationTs();
	//System.out.println(ed.username);
	System.out.println(ed.getUsername());
	System.out.println(ed.getPassword());
	//System.out.println(ed.password);
	
	ed.setUsername("Ravi");
	System.out.println(ed.getUsername());
	ed.setPassword("Secure123");
	System.out.println(ed.getPassword());
	}
}