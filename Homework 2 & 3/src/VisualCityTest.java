import javax.swing.JFrame;

public class VisualCityTest {

	public static void main(String[] args) {
		
		// Create a City!
		City myCity = new City();
		
		// Create some buildings.
		CityHall myCityHall = new CityHall("Important People Building", "2424 Government Ln.");
		myCityHall.createImage("res/CityHall.jpg",100,100,250,100);		
		
		School mySchool = new School("Rose Park Elementary", "8374 Rose St");
		mySchool.createImage("res/School1.jpg",100,100,100,100);

		School myOtherSchool = new School("Billings Senior High", "6283 Broncs Rd");
		myOtherSchool.createImage("res/School2.jpg",100,100,400,100);
		
		
		// Create some citizens.
		Kid kid1 = new Kid("Joe", 16, 5559837, "Skittles");
		kid1.createImage("res/Kid1.jpg",50,50);
		
		Kid kid2 = new Kid();
		kid2.createImage("res/Kid2.jpg",50,50);
		
		Police officer1 = new Police("Randy", 35, 8372946, Police.Role.CAPTAIN);
		officer1.createImage("res/Officer1.png",50,50);	
		officer1.setEmployeeID("1000A");
		
		Police officer2 = new Police("Gerald", 50, 3826393, Police.Role.CHIEF);
		officer2.createImage("res/Officer2.png",50,50);	
		officer2.setEmployeeID("2000B");
		
		Teacher teacher1 = new Teacher("Corina", 19, 8372963, 2, "Masters");
		teacher1.createImage("res/Teacher1.jpg",50,50);		
		teacher1.setEmployeeID("1000B");
		
		Teacher teacher2 = new Teacher("Mr. Caekart", 62, 4067839, 12, "Baechelor's");
		teacher2.createImage("res/Teacher2.png",50,50);
		teacher2.setEmployeeID("2000B");
		
		
		// Add things to other things.
		myCityHall.addOfficer(officer1);
		mySchool.addTeacher(teacher2);
		mySchool.addStudent(kid2);
		
		myCity.addBuilding(myCityHall);
		myCity.addBuilding(mySchool);
		myCity.addBuilding(myOtherSchool);
		
		myCity.addCitizen(kid1);
		myCity.addCitizen(kid2);
		myCity.addCitizen(officer1);
		myCity.addCitizen(officer2);
		myCity.addCitizen(teacher1);
		myCity.addCitizen(teacher2);
		
		//Create the JFrame
		JFrame frame = new JFrame();
		frame.add(new VisualCity(myCity));
		frame.setSize(700, 700);
		
		frame.setVisible(true);
		
	}

}