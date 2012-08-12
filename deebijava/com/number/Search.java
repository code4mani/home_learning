package com.number;

import java.io.*;
import com.home.InputReader;

public class Search {
	public static void main(String [] args) {
		String[] grpnames = {"apple","boy","cat","dog","Egg","rose"};
		System.out.println("Enter the string :");
		String str = InputReader.readString();
		for(String gt: grpnames){
			if(str.equalsIgnoreCase(gt) ){
				System.out.println("Entered string exists");
				return;
			}
		}	
		System.out.println("Does not exist");
	}
}