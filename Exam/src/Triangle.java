
public class Triangle implements Shape{
	
	private int ID;
	private int side1;
	private int side2;
	private int side3;
	private String color;
	
	Triangle(int ID, int side1, int side2, int side3, String color) {
		this.ID = ID;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
	}
	
	public int getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public double getArea() {
		double s = (double)getPerimeter() / 2.0;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); // Heron's formula!
	}
	
	public String toString() {
		return String.format("Triangle (ID# %d)", ID);
	}
	
	public String getKind() {
		return "Triangle";
	}
	
	public String getDetailString() {
		String detailString = toString() + "\n";
		detailString += String.format("Color: %s\n", color);
		detailString += String.format("Side 1: %d\n", side1);
		detailString += String.format("Side 2: %d\n", side2);
		detailString += String.format("Side 3: %d\n", side3);
		detailString += String.format("Perimeter: %d\n", getPerimeter());
		detailString += String.format("Area: %f\n", getArea());
		return detailString;
	}
	
	public int getID() {
		return ID;
	}
	
}
