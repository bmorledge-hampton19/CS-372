/**
 * A class that extends Building and adds an array list for its occupants (Policemen).
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/5/2017
 */
public class CityHall extends Building{

	// Array for the occupants.
	private Police[] officers;
	
	// Integers to keep track of the number of officers.
	private int numberOfOfficers;
	
	/**
	 * A default constructor that just uses Building's constructor.
	 */
	CityHall() {
		
		// Call Building's default constructor.
		super();
		
	}
	
	/**
	 * A constructor which uses Building's constructor with a given name and address.
	 * @param name specifies the name to be set.
	 * @param address specifies the address to be set.
	 */
	CityHall(String name, String address) {
		
		// Call Building's corresponding constructor.
		super(name,address);
		
	}
	
	/**
	 * Adds a given officer to the array of officers.
	 * @param p specifies the officer to be added.
	 */
	public void addOfficer(Police p) {
		// Add the teacher to the array and increment the number of teachers.
		officers[numberOfOfficers] = p;
		numberOfOfficers++;
	}
	
	/**
	 * Returns the officer at the given index.
	 * @param i specifies the index of the desired officer.
	 * @return the officer at the given index.
	 */
	public Police getOfficer(int i) {return officers[i];}
	
	/**
	 * Returns the number of officers.
	 * @return the number of officers.
	 */
	public int getNumberOfOfficers() {return numberOfOfficers;}

}
