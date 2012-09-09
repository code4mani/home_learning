package com.number;

import java.io.*;
import java.util.Scanner;

public class Greater {
	public static void main(String [] args) {
		System.out.println("Enter the three numbers to find the greater");

		Scanner userinput = new Scanner(System.in);
		int a = userinput.nextInt();
		//System.out.println("user entered " +a);
		int b = userinput.nextInt();	

		int c = userinput.nextInt();
		
		if(a > b) 
		{
			if( a > c) {
				System.out.println("Greater number is "+a);
				if(b>c) {
					System.out.println("Smaller number is "+c);
				}
				else {
					System.out.println("Smaller number is "+b);
				}				
			}
			else {
				System.out.println("Greater number is "+c);
				if(b>a) {
					System.out.println("Smaller number is "+a);
				}
				else {
					System.out.println("Smaller number is "+b);
				}				
			}
		}
		else {
			if( b > c) {
				System.out.println("Greater number is " + b);
				if(a>c) {
					System.out.println("Smaller number is " + c);
				}
				else {
					System.out.println("Smaller number is " + a);
				}				
			}
			else {
				System.out.println("Greater number is "+c);
				if(c>a) {
					System.out.println("Smaller number is "+a);
				}
				else {
					System.out.println("Smaller number is "+c);
				}				
			}
		}
	}
}
