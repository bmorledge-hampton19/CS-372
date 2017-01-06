/**
 * A class that extends Person and adds an enum field for the officer's specific role.
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/5/2017
 */
public class Police extends Person {

	// The enumerator that specifies the officer's role.
	public enum Role{PATROL, SERGEANT, CAPTAIN, CHIEF};
	private Role role;
	
	/**
	 * Constructs a Police officer with given name, age, phone number, and role.
	 * @see Person.java
	 * @param name specifies the officer's name.
	 * @param age specifies the officer's age.
	 * @param phoneNumber specifies the officer's phone number.
	 * @param role specifies the officer's role.
	 */
	public Police(String name, int age, int phoneNumber, Role role) {
		// Call Person's constructor and then set the role.
		super(phoneNumber, name, age);
		this.role = role;		
	}
	
	/**
	 * The default constructor which merely calls Person's default constructor and sets role to Patrol.
	 * @see Person.java
	 */
	public Police() {
		// Call Person's default constructor and set role to PATROL.
		super();
		role = Role.PATROL;
	}
	
	/**
	 * Returns the officer's role.
	 * @return the officer's role.
	 */
	public Role getRole() {return role;}
	
	/**
	 * Sets the officer's role to a new enum type.
	 * @param role specifies the new enum type.
	 */
	public void setRole(Role role) {this.role = role;}
	
}
