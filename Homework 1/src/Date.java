////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// This class represents a date through its day, month, and year.
public class Date {
	
	// The instance variables that together represent the date.
	private int month;
	private int day;
	private int year;
	
	// A default constructor that sets the date as my birthday!
	Date() {
		month = 7;
		day = 26;
		year = 1996;
	}
	
	// A constructor which creates a date based on the values it is passed.
	Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// A method which displays the date separated by forward slashes.
	public void displayDate() {
		System.out.printf("%d/%d/%d\n", month, day, year);
	}
	
	// Basic getters and setters for all of the instance variables.
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}