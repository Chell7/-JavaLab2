import java.util.Scanner;

public class Chal021 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first name:" );
		String firstName = input.nextLine(); //read the first name from the user
		
		System.out.println( "Please, enter your surname:" );
		String surname = input.nextLine(); //read the first name from the user
		
		String name = firstName + " " + surname;
		
		int nameLength = name.length(); 
		
		System.out.println("The length of your name is " + nameLength + ".");

	}

}
