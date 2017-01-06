/**
 * A class that extends Building and adds an array for students, and an array for teachers.
 * @author Benjamin Morledge-Hampton
 * @version 1.0 1/5/2017
 */
public class School extends Building {

	// Arrays for the occupants.
	private Teacher[] teachers;
	private Kid[] students;
	
	// Integers to keep track of the number of teacher's and students.
	private int numberOfTeachers;
	private int numberOfStudents;
	
	/**
	 * A default constructor that just uses Building's constructor.
	 */
	School() {
		
		// Call Building's default constructor.
		super();
		
	}
	
	/**
	 * A constructor which uses Building's constructor with a given name and address.
	 * @param name specifies the name to be set.
	 * @param address specifies the address to be set.
	 */
	School(String name, String address) {
		
		// Call Building's corresponding constructor.
		super(name,address);
		
	}
	
	/**
	 * Adds a given teacher to the array of teachers.
	 * @param t specifies the teacher to be added.
	 */
	public void addTeacher(Teacher t) {
		// Add the teacher to the array and increment the number of teachers.
		teachers[numberOfTeachers] = t;
		numberOfTeachers++;
	}
	
	/**
	 * Adds a given kid to the array of students.
	 * @param k specifies the student to be added.
	 */
	public void addStudent(Kid k) {
		// Add the student to the array and increment the number of students.
		students[numberOfStudents] = k;
		numberOfStudents++;
	}
	
	/**
	 * Returns the teacher at the given index.
	 * @param i specifies the index of the desired teacher.
	 * @return the teacher at the given index.
	 */
	public Teacher getTeacher(int i) {return teachers[i];}
	
	/**
	 * Returns the student at the given index.
	 * @param i specifies the index of the desired student.
	 * @return the student at the given index
	 */
	public Kid getStudent(int i) {return students[i];}
	
	/**
	 * Returns the number of students.
	 * @return the number of students.
	 */
	public int getNumberOfStudents() {return numberOfStudents;}
	
	/**
	 * Returns the number of Teachers.
	 * @return the number of Teachers.
	 */
	public int getNumberOfTeachers() {return numberOfTeachers;}
	
}
