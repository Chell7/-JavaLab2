import java.util.Scanner;


public class Chal033 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter the first number:" );
		int number1 = input.nextInt(); //read a number from the user
		
		System.out.println( "Please, enter the second number:" );
		int number2 = input.nextInt(); //read a number from the user
		
		int result = number1/number2;
		
		int remainder= number1 % number2;
		
		System.out.println( number1 + " divided by " + number2 + " is " + result +" with "+ remainder +" remaining." );
		

	}

}
