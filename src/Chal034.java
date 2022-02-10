import java.util.Scanner;


public class Chal034 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner( System.in );
		
		System.out.println( "1)Square \n\n" +"2)Triangle \n\n" + "Enter a number: ");
		int choice = input.nextInt(); 
		
		
		switch (choice) {
		  case 1:
			System.out.println( "Please, enter the lenght of one side: ");
			int side = input.nextInt(); 
			
			int areaSquare = side * side;
			
		    System.out.println("The area of the square is: " + areaSquare + ".");
		    break;
		    
		  case 2:
			System.out.println("Please, enter the base of the triangle: ");
			int base = input.nextInt(); 
			
		    System.out.println("Please, enter the height of the triangle: ");
		    int height = input.nextInt();
		    
		    int areaTriangle = (base*height)/2;
		    
		    System.out.println("The area of the square is: " + areaTriangle + ".");
		    break;
		    
		  default:
		    System.out.println("Incorrect option selected");
		}
		
		
	}
	

}
