import java.util.Scanner;


public class Chal020 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first name:" );
		String firstName = input.nextLine(); //read the first name from the user
		
		int nameLength = firstName.length(); 
		
		System.out.println("The length of your firstname is " + nameLength + ".");

	}

}
