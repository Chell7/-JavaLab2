import java.util.Scanner;


public class Chal030 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		double pi = Math.PI;
		
		double piRounded= Math.round(pi * 100000.0)/100000.0;
		
		System.out.println( "Your result is " + piRounded );
		
	}

}
