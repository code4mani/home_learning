package com.prime;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import com.home.FileContent;
import com.prime.Algorithms;


public class StringSort{
	public static void main(String[] args) {
		FileContent f = new FileContent("resources/stringlist.txt");
		List<String> s = f.readIt();
		System.out.println("The names in the list are: " +s);
		
	/*	int n = s.size();
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(s.get(i).compareToIgnoreCase(s.get(i+1)) > 0) {
					Collections.swap(s,i,i+1);
				}
			}
		}
		System.out.println("The names in the list are: " +s);*/
		Algorithms.BubbleSortStr(s);
		System.out.println("The numbers in the list are: " +s);
		
			
	}
}	