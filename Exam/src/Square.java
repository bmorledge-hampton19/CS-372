
public class Square implements Shape {

	private int ID;
	private int sideLength;
	private String color;
	
	Square(int ID, int sideLength, String color) {
		this.ID = ID;
		this.sideLength = sideLength;
		this.color = color;
	}
	
	public int getPerimeter() {
		return (sideLength * 4);
	}
	
	public int getArea() {
		return (sideLength * sideLength);
	}
	
	public String toString() {
		return String.format("Square (ID# %d)", ID);
	}
	
	@Override
	public String getKind() {
		return "Square";
	}

	@Override
	public String getDetailString() {
		String detailString = toString() + "\n";
		detailString += String.format("Color: %s\n", color);
		detailString += String.format("Side Length: %d\n", sideLength);
		detailString += String.format("Perimeter: %d\n", getPerimeter());
		detailString += String.format("Area: %d\n", getArea());
		return detailString;
	}

	@Override
	public int getID() {
		return ID;
	}

}
