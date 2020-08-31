package org.trishinfotech.nullobject;

public class ShapeFactory {

	public static Shape createShape(String shapeType) {
		Shape shape = null;
		if ("Circle".equalsIgnoreCase(shapeType)) {
			shape = new Circle();
		} else if ("Rectangle".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle();
		} else if ("Triangle".equalsIgnoreCase(shapeType)) {
			shape = new Triangle();
		} else {
			shape = new NullShape();
		}
		return shape;
	}
}
