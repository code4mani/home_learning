package com.number;

import java.io.*;
import com.number.Shape;

public class Circle implements Shape {
	private double radius;
	public static final double PI = 3.14;
	public Circle(double radius) { 
		this.radius = radius;
	}
	
	public double area() {
		return PI * radius * radius;
	}
}
