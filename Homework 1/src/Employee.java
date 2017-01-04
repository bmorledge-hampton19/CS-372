////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// A class that stores basic information about an employee.
public class Employee {
	
	// Instance variables that are rather self-explanatory.
	private String firstName;
	private String lastName;
	private double salary;
	
	// The default constructor for the class
	Employee() {
		firstName = "Bob";
		lastName = "Jones";
		salary = 10000;
	}
	
	// A constructor that initializes each of the instance variables with values passed to it.
	Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// First ensure that the salary given is valid (positive).
		if (salary > 0) this.salary = salary;
		// Otherwise, use the default value.
		else this.salary = 10000;
	}
	
	// Basic Getters and Setters
	
	public String getFirstName() { 
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	// This setter only sets the variable if it is positive.
	public void setSalary(double salary) {
		if (salary > 0) this.salary = salary;
	}
	
}