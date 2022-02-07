package test;

public class Test 
{
	public static void main(String[] args) 
	{
		int a=25;
		
		if(a>10)
			System.out.print("ok");
		else if(true);							// forzata 
			System.out.print("bye");
			
			int horses = 10; 
			int camels = 5; 
			
			if(horses < 5) { 
				System.out.println("Guvi"); 
			} 
			else if(horses >=5)
				System.out.print("Geek "); 
			
			//System.out.println("Coin");  		// illegal!!
			
			else 
				System.out.println("Java");
	}
}