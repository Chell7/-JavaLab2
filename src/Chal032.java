import java.util.Scanner;


public class Chal032 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please, enter the radius of a cylinder: ");
		double radius = input.nextDouble(); 
		
		System.out.println( "Please, enter the depth of a cylinder: ");
		double depth = input.nextDouble(); 
		
		double circleArea = Math.PI * (Math.pow(radius, 2));
		
		double volume = circleArea * depth;
		
		double volRounded = Math.round(volume * 1000.0)/1000.0;
		
		
		System.out.println( "The volume of the cylinder: " + volRounded + ".");
		
	}

}
