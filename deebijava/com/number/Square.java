package com.number;

import java.io.*;
import com.number.Shape;

public class Square implements Shape {
	private double length;
	
	public Square(double length) { 
		this.length = length;
	}
	
	public double area() {
		return length * length;
	}
}
