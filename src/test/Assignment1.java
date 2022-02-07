package test;


// https://www.tutorialspoint.com/Bitwise-right-shift-operator-in-Java

public class Assignment1 {

	public static void main(String[] args) {
		
		int a = 2 ;
		int b = 2 ;
		
		int c = a + b ;
		int d = a - b ;
		int e = a * b ;
		int f = b / a ;
		int g = b % a ; 
		int h = b ++ ;
		int i = b ; 
		int l = 0 ;
		int m = 0 ;
		int n = 0 ;
		int p = 0;
		
		boolean r = true;
		boolean s = true;
		
		
		if (r & s)
			System.out.println("r & s");
		if (r | s)
			System.out.println("r | s");
		
		p= a^b;
		System.out.println("p" + p);
		b= ~a ; 
		System.out.println("~b" + b);
		
		l = a << 2 ; 												//signed shift
		System.out.println("l" + l);
		System.out.println("2 << 2  = " + Integer.toBinaryString(l));
		
		m = a >>2 ; 
		System.out.println("m" + m);
		System.out.println("a >> 2  = " + Integer.toBinaryString(m));
		
		n = a>>>2 ;													// >>> unsigned shift 
		System.out.println("n" + n);
		System.out.println("a >>> 2 = " + Integer.toBinaryString(n));
		
		if (r && s)
			System.out.println("r && s" + (r && s));				
		if (r || s)
			System.out.println("r || b" + (r || s));			
		
		if (!r && s)
			System.out.println("!(r&&s)" + !(r&&s));	

	}

}
