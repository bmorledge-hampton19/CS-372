
public interface Employee {
	
	/**
	 * Returns the employee's money value.
	 * @return the employee's money value.
	 */
	public double getMoney();
	
	/**
	 * Pays the employee their salary.
	 */
	public void payEmployee();
	
	/**
	 * Returns the employee's salary.
	 * @return the employee's salary.
	 */
	public double getSalary();
	
	/**
	 * Sets the employee's salary.
	 * @param salary specifies the salary to be set.
	 */
	public void setSalary(double salary);
	
	/**
	 * Returns the employee's ID.
	 * @return the employee's ID.
	 */
	public String getEmployeeID();
	
	/**
	 * Sets the employee's ID.
	 * @param employeeID specifies the new ID to be set.
	 */
	public void setEmployeeID(String employeeID);
	
}
