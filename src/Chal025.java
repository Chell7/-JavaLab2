import java.util.Scanner;

public class Chal025 {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first name:" );
		String firstName = input.nextLine(); //read the first name from the user
		
		int firstNameLenght = firstName.length();
		
		if (firstNameLenght < 5)
		{
			System.out.println( "Please, enter your surname:" );
			String surname = input.nextLine(); 
			String name = firstName + " " + surname;
			
			name = name.toUpperCase();
			
			System.out.println( "Your full name is: " + name  + ".");
		}
		else {
			 String name = firstName;
			 name = name.toLowerCase();
			 
			 System.out.println( "Your full name is: " + name  + ".");
		}

	}

}
