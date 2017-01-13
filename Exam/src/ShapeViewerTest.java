
public class ShapeViewerTest {

	public static void main(String[] args) {
		
		String shapeTextLocation = System.getProperty("user.dir");
		shapeTextLocation += "\\src\\res\\shapes.txt";
		
		@SuppressWarnings("unused")
		ShapeViewer myShapeViewer = new ShapeViewer(ShapeFactory.getShapesFromText(shapeTextLocation));
		
	}
	
}
