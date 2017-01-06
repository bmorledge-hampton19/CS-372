import java.util.ArrayList;
/**
 * A class which contains a bunch of buildings and people and can do a variety of tasks with them.
 * @author Benjamin
 * @version 1.0 1/6/2017
 */
public class City {

	// Array lists for citizens and buildings in the city.
	private ArrayList<Building> buildings = new ArrayList<Building>();
	private ArrayList<Person> citizens = new ArrayList<Person>();
	
	/**
	 * Adds a given building to the buildings array list.
	 * @param b specifies the building to be added.
	 */
	public void addBuilding(Building b) {
		buildings.add(b);
	}
	
	/**
	 * Adds a given person to the citizens array list.
	 * @param p specifies the person to be added.
	 */
	public void addCitizen(Person p) {
		citizens.add(p);
	}
	
	/**
	 * Prints the names of all of the citizens to the console.
	 */
	public void displayCitizens() {
		System.out.println("Citizens:\n");
		
		for (Person p : citizens) {
			System.out.printf("%s\n", p.getName());
		}
	}
	
	/**
	 * Prints the names of all of the buildings to the console.
	 */
	public void displayBuildings() {
		System.out.println("Buildings:\n");
		
		for (Building b : buildings) {
			System.out.printf("%s\n", b.getName());
		}
	}

	/**
	 * Pay all of the employees in the city.
	 */
	public void payEmployees() {
		
		for (Person p : citizens) {
			// Only pay the citizen if they are an instance of the employee interface.
			if (p instanceof Employee) {
				((Employee) p).payEmployee();
			}
		}
		
	}
	
	
	public boolean isInSchool(int i) {
		
		// Make sure the given person is either a kid or teacher
		if (citizens.get(i) instanceof Kid || citizens.get(i) instanceof Teacher) {
			
			// Run a loop for all of the schools, checking for citizen and returning true if they are found.
			
			
		}
		
	}
	
}
