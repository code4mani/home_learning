package com.number;

import com.home.InputReader;

public class FarToCel {
	static public void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit : ");
		double far = InputReader.readDouble();
		
		double cel = (far - 32) * ((double)5.0 / 9.0) ;
		
		System.out.println ("Temp in Cel is " + cel );
	}
}
