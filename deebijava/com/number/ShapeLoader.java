package com.number;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.home.InputReader;
import com.number.Square;
import com.number.Circle;
import com.number.Shape;


public class ShapeLoader {
	public static void main(String [] args) { 
		//List<Shape> shapelist = new ArrayList<Shape>();
		
		Shape sh = null;
		
		System.out.println("Enter the shape type to find area : circle (c)/square (s)" );
		String shapeType = InputReader.readString();
		if (shapeType.equalsIgnoreCase("s")) {
			System.out.println("Enter the length to find the area of the square");
			double d = InputReader.readDouble();
			sh = new Square(d);
		}
		else if(shapeType.equalsIgnoreCase("c")) {
			System.out.println("Enter the radius to find the area of the circle ");
			double r = InputReader.readDouble();
			sh = new Circle(r);
		}
		System.out.println("The area  of " + sh.getClass().getName() + " is :" + sh.area());
	}
}
