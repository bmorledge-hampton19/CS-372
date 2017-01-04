////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// Imports
import java.util.Scanner;

// This class takes a radius and uses it to determine the area of a circle.
public class AreaOfACircle {

	public static void main(String[] args) {
		// An estimation of PI to be used in calculating the area of a circle.
		final double PI = 3.14;
		
		// Create a scanner to read in input.
		Scanner s = new Scanner(System.in);
		
		// Read in the radius of the circle.
		System.out.printf("Input your circle's radius: ");
		double radius = s.nextDouble();
		
		// Determine the area of the circle.
		double area = radius*radius*PI;
		
		// Display the area to the user.
		System.out.printf("The area of your circle is %f.",area);
		
		// Close the scanner. (I think this is important?)
		s.close();

	}

}
