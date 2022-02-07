package test;

public class CheckHitFlop {

	public static void main(String[] args) {
		// prints "Box Office Hit" if the int variable "DaysInTheatre" is more than or equal to 50; 
		// or prints "Flop" otherwise.
		double DaysInTheatre = Math.random(); //50;
		
		if (DaysInTheatre >= 50)
			System.out.println ("Box Office Hit") ; 
		else
			System.out.println ("Flop : " + DaysInTheatre) ; 
		

	}

}
 