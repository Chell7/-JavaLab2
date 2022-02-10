import java.util.Scanner;


public class Chal023 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter the first line of a nursery rhyme:" );
		String rhyme = input.nextLine(); //read the first line from the user
		
		int rhymeLength = rhyme.length(); 
		
		System.out.println( "This has " + rhymeLength + " letters in it.");
		//-----------------------------------
		System.out.println( "Enter a starting number:");
		int start = input.nextInt();
		
		System.out.println( "Enter an end number:");
		int end = input.nextInt();
		
		String part = rhyme.substring(start , end);
		
		System.out.println( "The part you selected is:" + "\""+ part + "\"");
	}

}
