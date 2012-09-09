package com.prime;

import java.io.*;
import com.home.InputReader;
import com.prime.Square;
import com.prime.Circle;
import com.prime.Shape;
import java.util.List;
import java.util.ArrayList;

public class ShapeLoader {
	public static void main(String[] args){
	List<Shape> shapelist =new ArrayList<Shape>();
	String shapetype =InputReader.readString();
	
	if(shapetype.equalsIgnoreCase("s")){
		System.out.println("Find the area of square");
		double d =InputReader.readDouble();
		Square s =new Square(d);
		System.out.println("The area of square is "+s.area());
	}
	else if(shapetype.equalsIgnoreCase("c")){
		System.out.println("Find the area of circle");
		double r =InputReader.readDouble();
		Circle c =new Circle(r);
		System.out.println("The area of circle is "+c.area());
	}
}
}