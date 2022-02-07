package test;

public class Loop3 {
	public static void main(String[] args){
		
		int i=0;
		
		for(i++; i < 4; i++){
			System.out.println("i" + i);
			System.out.println(~i);
		}
	}
}