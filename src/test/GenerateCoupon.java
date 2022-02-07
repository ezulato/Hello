package test;

import java.util.Scanner;

public class GenerateCoupon {

	public static void main(String[] args) {
		/*
		 * Write a program GenerateCoupon which prints the coupon amount based on the purchase made by the customer.
		 * If purchase is the in the range of
		1.Rs.20000 & Above Free Trolley Suitcase
		2.Rs.10000 & Above Free Travel Bag
		3.Rs.5000 & Above Free BackPck
		4.Below 5000 "Collect money even for cover we give "
	
		Sample Input: Purchased Amount: Rs.5000
		Sample Output: Collect money even for cover we give
		 * */
		int debituccio = 0 ;
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		
		System.out.println("quanto hai speso, dolcezza? " );
		debituccio += sc.nextInt();
		
		sc.close();
		System.out.println("ops.... quindi qui abbiamo un debituccio di " + debituccio + " euro...");
		
		
		System.out.println("vabbe è il tuo giorno fortunato. ti regalo un coupon per avere altri debitucci e morire di fame!");
		
		if (debituccio > 20000)
			System.out.println("Free Trolley Suitcase");
		
		else if (debituccio > 10000)
			System.out.println("Free Travel Bag");
		
		else if (debituccio > 5000)
			System.out.println("Free BackPck");
		
		else if (debituccio < 5000)
			System.out.println("Collect money even for cover we give");
		
	}

}
