package com.number;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Namelist {
	public static void main(String [] args) {
		System.out.println("Enter the count");
		
		Scanner userinput = new Scanner(System.in);
		int a = userinput.nextInt();
		userinput.nextLine();
		String estr[]= new String[a];
		
		System.out.println("Enter " + a + "names");
		
		for(int i=0;i<a;i++) {
			estr[i] = userinput.nextLine();
		}
		
		System.out.println("Enter name to search");
		String searchstr = userinput.nextLine(); 
		
		boolean found = false;
		
		for(int i=0;i<a;i++) {
			if(estr[i].equals(searchstr)) {		
				System.out.println("Entered string found");
				found = true;
				break;
			}
			//else {
				//System.out.println("Entered string not found");
			//}
		}
		if (!found) {
			System.out.println("String not found");
		}
		
	}
}