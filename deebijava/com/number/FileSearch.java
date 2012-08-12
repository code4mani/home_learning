package com.number;

import java.io.*;
import java.util.*;
import com.home.FileContent;
import com.home.InputReader;

public class FileSearch { 
	public static void main(String [] args) {
		List<String> elist = new ArrayList<String>();
		System.out.println("Enter the word to search in the file : ");
		String str = InputReader.readString();
		FileContent filen = new FileContent("com/number/new.txt");
		elist = filen.readIt();
		for(String s: elist){
			if(s.contains(str) ){
				System.out.println("Entered string exists");
				return;
			}
		}
		System.out.println("String does not exist");
	}
}