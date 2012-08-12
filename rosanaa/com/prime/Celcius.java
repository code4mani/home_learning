package com.prime;
import com.home.InputReader;
import java.io.*;
public class Celcius{
	public static void main(String [] args)
	{
		System.out.println("Enter the number");
		double c = InputReader.readDouble();
		 double fahrenheit = ((c * 9) / 5) + 32;
		System.out.println("fahranheit of the entered values  is "+fahrenheit);
		
	}
		
	}