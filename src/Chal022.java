import java.util.Scanner;


public class Chal022 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter your first name in lowercase:" );
		String firstName = input.nextLine(); //read the first name from the user
		
	
		System.out.println( "Please, enter your surname in lowercase:" );
		String surname = input.nextLine(); //read the first name from the user
		
		
		String name = firstName + " " + surname;
		
		
		
		System.out.println("Your full name is " + toTitleCase(name) + ".");


	}
	
	public static String toTitleCase(String input) {
	    StringBuilder titleCase = new StringBuilder(input.length());
	    boolean nextTitleCase = true;

	    for (char c : input.toCharArray()) {
	        if (Character.isSpaceChar(c)) {
	            nextTitleCase = true;
	        } else if (nextTitleCase) {
	            c = Character.toTitleCase(c);
	            nextTitleCase = false;
	        }

	        titleCase.append(c);
	    }

	    return titleCase.toString();
	

}
}