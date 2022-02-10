import java.util.Scanner;


public class Chal028 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a number with a lot of decimals: ");
		double numDec = input.nextDouble(); 
		
	    double numDecTwice = numDec * 2;
	    
	    double roundNumDecTwice = Math.round (numDecTwice * 100.0) / 100.0 ;
	    
	    System.out.println("Your answer is: " + roundNumDecTwice + ".");

	}

}
