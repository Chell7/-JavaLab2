import java.util.Scanner;

public class Chal024 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter a word:");
		String word = input.nextLine(); //read the word from the user
		word = word.toUpperCase();
		
		System.out.println("Your word in uppercase is " + word + ".");

	}

}
