import java.util.Scanner;

public class Chal031 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter the radius of a circle: ");
		double radius = input.nextDouble(); 
		
		double area = Math.PI * (Math.pow(radius, 2));
		
		System.out.println( "The area of the circle is: " + area + ".");
		

	}

}
