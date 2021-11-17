package test;

public class Basicforloop {

	public static void main(String[] args) {
		int m[]= {5,2,3,6,7};
		
		for(int i=0;i<m.length;i++)
			System.out.println("array list"+m[i]);
		
		int t=0;
		
		
		for(int i=0;i<m.length;i++)
		{
		for(int j=i+1;j<m.length;j++)
		{
			if(m[i]>m[j])
			{	
		t=m[i];
		m[i]=m[j];
		m[j]=t;
		}
		}		
		}
		System.out.println();
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("array list"+m[i]);
			
		}
		}
		
		}

