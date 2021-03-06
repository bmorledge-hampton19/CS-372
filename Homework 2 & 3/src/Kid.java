/**
 * A class that extends Person and adds a string for favorite candy.
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/5/2017
 */
public class Kid extends Person {

	// The favorite candy of the kid!
	private String favoriteCandy;
	
	/**
	 * Constructs a Kid with given name, age, phone number, and favoriteCandy.
	 * @see Person.java
	 * @param name specifies the Kid's name.
	 * @param age specifies the Kid's age.
	 * @param phoneNumber specifies the Kid's phone number.
	 * @param favoriteCandy specifies the Kid's favorite Candy.
	 */
	public Kid(String name, int age, int phoneNumber, String favoriteCandy) {
		// Call Person's constructor and then set the role.
		super(phoneNumber, name, age);
		this.favoriteCandy = favoriteCandy;		
	}
	
	/**
	 * The default constructor which merely calls Person's default constructor and sets favoriteCandy to Reese's.
	 * @see Person.java
	 */
	public Kid() {
		// Call Person's default constructor and set role to PATROL.
		super();
		favoriteCandy = "Reese's";
	}
	
	/**
	 * Returns the Kid's favorite type of Candy.
	 * @return the Kid's favoirte type of Candy.
	 */
	public String getFavoriteCandy() {return favoriteCandy;}
	
	/**
	 * Sets the Kid's favorite candy to a specified string
	 * @param favoriteCandy specifies the name of the favorite candy type to be set.
	 */
	public void setFavoriteCandy(String favoriteCandy) {this.favoriteCandy = favoriteCandy;}
	
}
