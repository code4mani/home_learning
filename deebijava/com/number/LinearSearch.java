package com.number;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import com.home.FileContent;
import com.number.Algorithms;

public class LinearSearch{
	public static void main(String[] args) {
		List<String> nmbrs = load("resources/stringlist.txt");
		System.out.println("The numbers in the list are: " +nmbrs);
		/*
		for(Integer s : nmbrs) {
			System.out.println( s );
		}*/
		
		System.out.println("Enter the number to search: ");
		String n = InputReader.readString();
		Algorithms.linearSearch(nmbrs,n);
		
		/*
		for (Integer i : nmbrs) {
			
			if (i == n) {
				System.out.println("The number is found");
				break;
			}
			
		}*/
		
		//load
	}
	public static List<String> load(String fileName) { 
		
		FileContent filen = new FileContent(fileName);
		return filen.readIt();
		
	}
}
	