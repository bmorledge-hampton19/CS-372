
public class CityTest {

	public static void main(String[] args) {
		
		// Create a City!
		City myCity = new City();
		
		// Create some buildings.
		CityHall myCityHall = new CityHall("Important People Building", "2424 Government Ln.");
		School mySchool = new School();
		
		// Create some citizens.
		Kid kid1 = new Kid("Joe", 16, 5559837, "Skittles");
		Kid kid2 = new Kid();
		Police officer1 = new Police("Randy", 35, 8372946, Police.Role.CAPTAIN);
		Police officer2 = new Police("Gerald", 50, 3826393, Police.Role.CHIEF);
		Teacher teacher1 = new Teacher("Corina", 19, 8372963, 2, "Masters");
		Teacher teacher2 = new Teacher("Mr. Caekart", 62, 4067839, 12, "Baechelor's");
		
		// Add things to other things.
		myCityHall.addOfficer(officer1);
		mySchool.addTeacher(teacher2);
		mySchool.addStudent(kid2);
		
		myCity.addBuilding(myCityHall);
		myCity.addBuilding(mySchool);
		
		myCity.addCitizen(kid1);
		myCity.addCitizen(kid2);
		myCity.addCitizen(officer1);
		myCity.addCitizen(officer2);
		myCity.addCitizen(teacher1);
		myCity.addCitizen(teacher2);
		
		// Run some tests with the City.
		
		// Test general output.
		myCity.displayBuildings();
		System.out.println("\n");
		myCity.displayCitizens();
		System.out.println("\n");
		
		//Test checking for citizens in specific buildings.
		if (myCity.isAtCityHall(officer1)) System.out.printf("%s is at City Hall.\n", officer1.getName());
		else System.out.printf("%s is not at CityHall.\n", officer1.getName());
		
		if (myCity.isAtCityHall(officer2)) System.out.printf("%s is at City Hall.\n", officer2.getName());
		else System.out.printf("%s is not at CityHall.\n", officer2.getName());
		
		if (myCity.isInSchool(kid1)) System.out.printf("%s is in School.\n", kid1.getName());
		else System.out.printf("%s is not in School.\n", kid1.getName());
		
		if (myCity.isInSchool(kid2)) System.out.printf("%s is in School.\n", kid2.getName());
		else System.out.printf("%s is not in School.\n", kid2.getName());
		
		if (myCity.isInSchool(teacher1)) System.out.printf("%s is in School.\n", teacher1.getName());
		else System.out.printf("%s is not in School.\n", teacher1.getName());
		
		if (myCity.isInSchool(teacher2)) System.out.printf("%s is in School.\n", teacher2.getName());
		else System.out.printf("%s is not in School.\n", teacher2.getName());
		
		//Test paying all employees.
		((Employee)teacher1).setSalary(1000000000);
		((Employee)teacher1).setEmployeeID("ABCDEFG");
		((Employee)officer2).setSalary(800000);
		((Employee)officer2).setEmployeeID("HIJKLMNOP");
		
		for (int i = 0; i < 4; i++) {
			myCity.payEmployees();
		}
		
		System.out.println();
		System.out.printf("Citizen %s with ID %s has $%f after being payed\n", teacher1.getName(), teacher1.getEmployeeID(), teacher1.getMoney());
		System.out.printf("Citizen %s with ID %s has $%f after being payed\n", officer2.getName(), officer2.getEmployeeID(), officer2.getMoney());
		
		
		// Hooray!!
		System.out.println();
		System.out.println("Everything worked!");
		
		
		
	}

}
