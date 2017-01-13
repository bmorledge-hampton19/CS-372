
public class Circle implements Shape {

	private int radius;
	private int ID;
	private String color;
	
	Circle(int ID, int radius, String color) {
		this.ID = ID;
		this.radius = radius;
		this.color = color;
	}

	public double getCircumference() {
		return (3.1416 * radius * 2);
	}
	
	public double getArea() {
		return (3.1416 * radius * radius);
	}
	
	public String toString() {
		return String.format("Circle (ID# %d)",ID);
	}

	public String getKind() {
		return "Circle";
	}

	public String getDetailString() {
		String detailString = toString() + "\n";
		detailString += String.format("Color: %s\n", color);
		detailString += String.format("Radius: %d\n", radius);
		detailString += String.format("Circumference: %f\n", getCircumference());
		detailString += String.format("Area: %f\n", getArea());
		return detailString;
	}

	public int getID() {
		return ID;
	}
	
	
	
}
