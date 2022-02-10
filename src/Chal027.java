import java.util.Scanner;


public class Chal027 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a number with a lot of decimals: ");
		double numDec = input.nextDouble(); 
		
	    double numDecTwice = numDec * 2;
	    
	    System.out.println("Your answer is: " + numDecTwice + ".");

	}

}
