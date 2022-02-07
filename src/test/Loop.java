package test;

public class Loop {
	public static void main(String[] args){
		int b=0;
		
		do{
			int a=2;       
			//System.out.println("inizio a: " + a);
			
			b++;
			
			//System.out.println(++a); // first increment +1 THEN print a=3 (a=2+1) 
			System.out.println(a++); // first print a (a=2) THEN increment a+1. this one print '2'
			//System.out.println("alla fine a: " + a + "-------->");
		}
		while(b!=3);
		
	}
}

