package com.number;

import java.io.*;
import com.home.InputReader;

public class Fibo { 
	
	public static void main(String [] args) {
	int a=1;
	int b=1;
	int c=1;
	int n=0;
	String errMsg = "Enter positive integer!";
	System.out.println("Enter the nth number:");
	try {
		n = InputReader.readInt();
	}
	catch(NumberFormatException e) {
		System.out.println(errMsg);
		return ;
	}
	
	if(n<1) {
		System.out.println(errMsg);
		return ;
	}
	for(int i=2;i<n;i++) { 
		c= a+b;
		a=b;
		b=c;
	}
	System.out.println("The nth fibonacci number is " + c);

	}
}