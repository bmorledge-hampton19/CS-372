////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// Imports
import java.util.Scanner;

// This class takes an integer and determines whether it is even or odd.
public class OddOrEven {

	public static void main(String[] args) {
		
		// Create a scanner to read in input.
		Scanner s = new Scanner(System.in);
		
		// Read in the integer to be tested.
		System.out.printf("Input an integer: ");
		int toBeTested = s.nextInt();
		
		// Determine whether or not the integer is even using modulus, and print the result to the screen.
		if (toBeTested % 2 == 0) {
			System.out.printf("The integer is even.\n");
		}
		else System.out.printf("The integer is odd.\n");
		
		// Close the scanner. (I think this is important?)
		s.close();
		
	}

}
