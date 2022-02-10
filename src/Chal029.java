import java.util.Scanner;

public class Chal029 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter an integer that is over 500:" );
		int number = input.nextInt(); //read a number from the user
		
		double sqrtNumber = Math.sqrt(number) ;
		
		double sqrtNumberRound = Math.round (sqrtNumber * 100.0) / 100.0 ;
		
		System.out.println( "Your answer is " + sqrtNumberRound + "." );

	}

}
