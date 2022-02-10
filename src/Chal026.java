import java.util.Scanner;

public class Chal026 {

	public static void main(String[] args) {
	

		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter a word:" );
		String word = input.nextLine();
		
		String first = word.substring(0, 1);
		
		int wordLength = word.length();
		
		String remainder = word.substring(1, wordLength);
		
		
		if ((!first.equals ("a")) && (!first.equals ("e")) && (!first.equals("i")) && (!first.equals("o")) && (!first.equals("u"))) {
			String newWord1 = remainder + first + "ay";
			newWord1 = newWord1.toLowerCase();
			
			System.out.println( "Your new word is:" + newWord1);}
			
		else  {
			
			String newWord2 = word + "way";
			newWord2 = newWord2.toLowerCase();
			
			System.out.println( "Your new word is:" + newWord2 );}
				

	}

}
