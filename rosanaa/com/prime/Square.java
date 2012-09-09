package com.prime;
import  com.prime.Shape;

public class Square implements Shape {
	private double length;
	
	public Square(double length){
		this.length=length;
	}
	
	public double area (){
		return length*length;
	}
	
}