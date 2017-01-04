////////////////
// Ben Morledge-Hampton
// Homework 1
// CS 372-1
// 1/4/2017
////////////////

// This class tests the Employee class by creating two employees and giving each a 10% raise.
public class EmployeeTest {

	public static void main(String[] args) {
		
		// Create two employees, one with the default constructor and one without.
		Employee Bob = new Employee();
		Employee Paul = new Employee("Paul", "Krueger", 12345);
		
		// Display information about the two employees before their raises.
		System.out.printf("Employee %s %s has a $%f monthly salary\n", 
				Bob.getFirstName(), Bob.getLastName(), Bob.getSalary());

		System.out.printf("Employee %s %s has a $%f monthly salary\n\n", 
				Paul.getFirstName(), Paul.getLastName(), Paul.getSalary());
		
		// Give both employees a 10% raise.
		Bob.setSalary(Bob.getSalary()*1.1);
		Paul.setSalary(Paul.getSalary()*1.1);
		
		// Display information about the two employees after their raises.
		System.out.printf("After their raise, employee %s %s has a $%f monthly salary\n", 
				Bob.getFirstName(), Bob.getLastName(), Bob.getSalary());

		System.out.printf("After their raise, employee %s %s has a $%f monthly salary\n", 
				Paul.getFirstName(), Paul.getLastName(), Paul.getSalary());
		
	}

}