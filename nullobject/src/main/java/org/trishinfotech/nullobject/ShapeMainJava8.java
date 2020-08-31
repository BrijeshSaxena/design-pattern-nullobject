package org.trishinfotech.nullobject;

import java.util.Arrays;
import java.util.Optional;

public class ShapeMainJava8 {

	public static void main(String[] args) {
		String[] shapeTypes = new String[] { "Circle", null, "Triangle", "Pentagon", "Rectangle", "Trapezoid" };
		Arrays.asList(shapeTypes).stream().forEach(shapeType -> {
			Optional<Shape> optionalShape = ShapeFactoryJava8.createShape(shapeType);
			optionalShape.ifPresent((shape) -> {
				// null-check is done by ifPresent of Optional
				System.out.println("Shape area: " + shape.area());
				System.out.println("Shape Perimeter: " + shape.perimeter());
				shape.draw();
				System.out.println();
			});
		});
	}

}
