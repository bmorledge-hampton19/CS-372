////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// This class takes a set of characters and displays their integer values.
public class IntegerValueOfACharacter {

	public static void main(String[] args) {
		
		// Create an array of the characters to be used.
		char[] characters = {'A','B','C','a','b','c','0','1','2','$','*','+','/',' ',};
		
		// Using a fancy for loop, display the integer values for all of the above characters.
		for (char c : characters) {
			System.out.printf("The character %c has the corresponding integer value %d.\n", c,(int)c);
		}
		
	}
	
}