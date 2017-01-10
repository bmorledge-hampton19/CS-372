/**
 * A class that extends Person and adds variables for grade level and certification.
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/5/2017
 */
public class Teacher extends Person implements Employee{

	// The teacher's grade level and certification.
	private int grade; // Kindergarten is represented by the number 0.
	private String certification;
	
	// The teacher's money.
	private double moneyInDaBank = 0;
	// The teacher's Salary.
	private double salary;
	// The teacher's employeeID.
	private String employeeID;
	
	/**
	 * Constructs a Teacher with given name, age, phone number, grade, and certification.
	 * @see Person.java
	 * @param name specifies the teacher's name.
	 * @param age specifies the teacher's age.
	 * @param phoneNumber specifies the teacher's phone number.
	 * @param grade specifies the teacher's taught grade level.
	 * @param certification specifies the teacher's type of certification.
	 */
	public Teacher(String name, int age, int phoneNumber, int grade, String certification) {
		// Call Person's constructor and then set the role.
		super(phoneNumber, name, age);
		this.grade = grade;
		this.certification = certification;
	}
	
	/**
	 * The default constructor which merely calls Person's default constructor,
	 * sets grade to 0 (Kindergarten), and certification to Bachelor's.
	 * @see Person.java
	 */
	public Teacher() {
		// Call Person's default constructor and set role to PATROL.
		super();
		grade = 0;
		certification = "Bachelor's";
	}
	
	/**
	 * Returns the grade level that the teacher teaches.
	 * @return the grade level that the teacher teaches.
	 */
	public int getGrade() {return grade;}
	
	/**
	 * Returns the teacher's level of certification
	 * @return the teacher's level of certification
	 */
	public String getCertification() {return certification;}
	
	/**
	 * Sets the grade level that the teacher teaches to a given value.
	 * @param grade specifies the grade level to be set.
	 */
	public void setGrade(int grade) {this.grade = grade;}
	
	/**
	 * Sets the teacher's level of certification to a new value.
	 * @param certification specifies the level of certification to be set.
	 */
	public void setCertification(String certification) {this.certification = certification;}
	
	/**
	 * Returns the employee's money value.
	 * @return the employee's money value.
	 */
	public double getMoney(){return moneyInDaBank;}
	
	/**
	 * Pays the employee their salary.
	 */
	public void payEmployee() {moneyInDaBank+=salary;}

	/**
	 * Returns the employee's salary.
	 * @return the employee's salary.
	 */
	public double getSalary() {return salary;}

	/**
	 * Sets the employee's salary.
	 * @param salary specifies the salary to be set.
	 */
	public void setSalary(double salary) {this.salary = salary;}

	/**
	 * Returns the employee's ID.
	 * @return the employee's ID.
	 */
	public String getEmployeeID() {return employeeID;}
		
	/**
	 * Sets the employee's ID.
	 * @param employeeID specifies the new ID to be set.
	 */
	public void setEmployeeID(String employeeID) {this.employeeID = employeeID;}
	
}
