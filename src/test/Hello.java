
package test;

import java.util.*;



public class Hello {

	public static void main(String[] args) {
		// System.out.println("Hello World");
//		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
//		String name;
//		String city;
//		byte age;
//		int height;
//		boolean married;
//		String sex;
//		
//		/*
//		 *  name(string ),City(String) ,age (byte),height(float),married(boolean),sex(char ),
//		 *  Population in your city (double) 
//		 *  as inputs and print in the format specified in sample output
//		 * */
//
//	      
//		System.out.println("Enter a name: ");
//		name= sc.nextLine();
//	
//		
//		System.out.println("Enter a city: ");
//		city= sc.nextLine(); 
//		
//		System.out.println("Enter a age: ");
//		age= sc.nextByte(); 
//		
//		System.out.println("Enter a height: ");
//		height= sc.nextInt(); 
//
//		System.out.println("are u married? ");
//		married= sc.nextBoolean(); 
//		
//		System.out.println("sex? "); 
//		sex= sc.next();
//		
//		System.out.println("Population in your city? ");
//		double population= sc.nextDouble();
//		sc.close();
//		
//		System.out.println("name: " + name);
//		System.out.println("city: " + city);
//		System.out.println("age: " + age);
//		System.out.println("height: " + height);
//		System.out.println("married: " + married);
//		System.out.println("sex: " + sex);
//		System.out.println("population: " + population);	
//		
//		
		double var1 = 1 + 5; 
		double var2 = var1 / 4;
		int var3 = 1 + 5;
		int var4 = var3 / 4;
		System.out.println(var2 + " " + var4);
		
	
		// operatori aritmetici
		int x , y;
		x = 10;
		x++;
		System.out.println("1-" + x + ":" + x);
		--x;
		System.out.println("2-" + x + ":" + x);
		y = x++;
		System.out.println("3- y:"+ y + ":" + y);
		System.out.println("4- x:"+ x + ":" + x);
		
		System.out.println(x + " " + y);
		
		
		
		int a = 1;
		int b = 2;
		int c;
		int d;
		c = ++b; //+1+2=3 c=3
		d = a++; //       d=1 a=1+1=2
		c++; // c=4
		b++; // b=3+1=4
		++a; // a=3
		System.out.println(a + " " + b + " " + c);
		
		
		
		int t=25;
		if(t>25)
			t++;
		t+=t;
		System.out.println("t" + t);
		
		
		int ra=25;
		if(ra-->ra--){
		{
		ra='0';
		}
		}
		else
		--ra;
		System.out.print("ra" + ra);
		
		
		int ar=25;
		if(ar++>ar--){
			ar+=2;
		}
		else{
			break;
		}
		System.out.println("ar: " + ar);
	}
}
