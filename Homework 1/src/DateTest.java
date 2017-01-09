////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// This class tests the Date clas's capabilities.
public class DateTest {

	public static void main(String[] args) {

		// Create a couple date objects, one default, and one otherwise.
		Date myBirthday = new Date();
		Date aDate = new Date(2,2,2018);
		
		// Change some stuff for aDate and then display the parameters of both dates.
		aDate.setMonth(aDate.getMonth() - 1);
		aDate.setDay(aDate.getDay() + 1);
		aDate.setYear(aDate.getYear() - 1);
		
		// Display the two dates.
		System.out.printf("My birthday: ");
		myBirthday.displayDate();
		System.out.printf("Some Date: ");
		aDate.displayDate();

	}

}