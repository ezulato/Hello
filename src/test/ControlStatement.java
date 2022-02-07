package test;

public class ControlStatement 
{
	public static void main(String[] args) 
	{
		int a=25;
		
		if(a>10)							// viene valutato solo il 1° IF
			System.out.print("ok");
		else if(a>0 && a<=10)
			System.out.print("bye");
		else
			System.out.print("tata");
	}
}