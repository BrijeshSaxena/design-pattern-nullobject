package org.trishinfotech.nullobject;

import java.util.Optional;

public class ShapeFactoryJava8 {

	public static Optional<Shape> createShape(String shapeType) {
		Shape shape = null;
		if ("Circle".equalsIgnoreCase(shapeType)) {
			shape = new Circle();
		} else if ("Rectangle".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle();
		} else if ("Triangle".equalsIgnoreCase(shapeType)) {
			shape = new Triangle();
		} else {
			// no need to have NullShape anymore
			shape = null;
		}
		// using ofNullable because shape may be not null.
		return Optional.ofNullable(shape);
	}
}
