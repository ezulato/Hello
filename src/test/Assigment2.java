package test;

public class Assigment2 
{
		public static void leftshift(int i, int j)
		{
		 i= i<<j;
		}
		public static void main(String args[])
		{
			int i = 4, j = 2;
			leftshift(i, j);
			System.out.println(i);
			
			
			int a = 10;
			switch(a++)
			{
				case 10:
					System.out.println("1.a:" + a); // a=11
				switch(a--) 
				{
					default: // sempre eseguito
						System.out.println("Exit : " + a); // a=10
					case 10:
				}
				default: // sempre eseguito
					System.out.println("2." + a); // a= 10
			}
			
			
		}
}

