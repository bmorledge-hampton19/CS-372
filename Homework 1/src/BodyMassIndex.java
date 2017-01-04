////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// Imports
import java.util.Scanner;

// This class takes a person's mass and height and determines and displays their BMI.
public class BodyMassIndex {

	public static void main(String[] args) {
		
		// Create a scanner to read in input.
		Scanner s = new Scanner(System.in);
		
		// Get mass and height values from the user.
		System.out.printf("Enter your weight in pounds: ");
		double mass = s.nextDouble();
		
		System.out.printf("Enter your height in inches:");
		double height = s.nextDouble();
		
		// Calculate the person's BMI.
		double BMI = mass*703/(height*height);
		
		// Tell the user where they fall on the BMI scale.
		if (BMI < 18.5) System.out.printf("You are underweight.\n");
		else if (BMI < 24.9) System.out.printf("You are normal.\n");
		else if (BMI < 29.9) System.out.printf("You are overweight.\n");
		else System.out.printf("You are obese.\n");
		
		// Also give the user their exact BMI value and the scale that determines the above results.
		System.out.printf("\nYour BMI is %f.\n\n", BMI);
		System.out.printf("BMI VALUES\n");
		System.out.printf("Underweight: less than 18.5\n");
		System.out.printf("Normal: between 18.5 and 24.9\n");
		System.out.printf("Overweight: between 25 and 29.9\n");
		System.out.printf("Obese: 30 or greater\n");
		
		// Close the scanner. (I think this is important?)
		s.close();

	}

}
