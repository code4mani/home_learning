package com.prime;

import java.io.*;
//import java.utill.scanner;
import com.home.InputReader;



public class Greater {
	public static void main(String [] args) {
	System.out.println("which is the greater number");
		int a;
		int b;
		int c;
		 a = InputReader.readInt();
		 b = InputReader.readInt();
		 c = InputReader.readInt();
	
	
		
		if((a>b) && (a>c)) {
			System.out.println("the greater number is"+a);
		}
		else if((b>c) && (b>a)){
			System.out.println("the greater number is"+b);
		
		}
		else{
			System.out.println("the greater number is"+c);
		}
	
			
	}
}	