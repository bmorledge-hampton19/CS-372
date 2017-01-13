
public class Rectangle implements Shape {

	private int ID;
	private int width;
	private int height;
	private String color;
	
	Rectangle(int ID, int width, int height, String color) {
		this.ID = ID;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public int getPerimeter() {
		return (width * 2 + height * 2);
	}
	
	public int getArea() {
		return (width * height);
	}
	
	public String toString() {
		return String.format("Rectangle (ID# %d)", ID);
	}
	
	@Override
	public String getKind() {
		return "Rectangle";
	}

	@Override
	public String getDetailString() {
		String detailString = toString() + "\n";
		detailString += String.format("Color: %s\n", color);
		detailString += String.format("Width: %d\n", width);
		detailString += String.format("Height: %d\n", height);
		detailString += String.format("Perimeter: %d\n", getPerimeter());
		detailString += String.format("Area: %d\n", getArea());
		return detailString;
	}

	@Override
	public int getID() {
		return ID;
	}
	
}
