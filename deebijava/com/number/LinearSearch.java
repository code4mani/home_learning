package com.number;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import com.home.FileContent;


public class LinearSearch{
	public static void main(String[] args) {
		List<Integer> nmbrs = load("resources/numlist.txt");
		System.out.println("The numbers in the list are: " +nmbrs);
		for(Integer s : nmbrs) {
			System.out.println( s );
		}
		
		System.out.println("Enter the number to search: ");
		int n = InputReader.readInt();
		
		for (Integer i : nmbrs) {
			
			if (i == n) {
				System.out.println("The number is found");
				break;
			}
			
		}
		
		//load
	}
	public static List<Integer> load(String fileName) { 
		
		FileContent filen = new FileContent(fileName);
		return filen.readIntList();
		
	}
}
	