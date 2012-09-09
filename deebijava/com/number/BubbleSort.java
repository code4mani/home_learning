package com.number;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import com.home.FileContent;


public class BubbleSort{
	public static void main(String[] args) {
		FileContent f = new FileContent("resources/numlist.txt");
		List<Integer> nmbrs = f.readIntList();
		System.out.println("The numbers in the list are: " +nmbrs);
		
		int n = nmbrs.size();
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(nmbrs.get(i) > nmbrs.get(i+1)) {
					Collections.swap(nmbrs,i,i+1);
				}
			}
		}
		System.out.println("The numbers in the list are: " +nmbrs);
			
	}
}	