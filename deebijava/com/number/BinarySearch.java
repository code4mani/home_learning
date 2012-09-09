package com.number;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import com.home.FileContent;


public class BinarySearch{
	public static void main(String[] args) {
		List<Integer> nmbrs = load("resources/numlist.txt");
		System.out.println("The numbers in the list are: " +nmbrs);
		//for(Integer s : nmbrs) {
			//System.out.println( s );
		//}
		
		System.out.println("Enter the number to search: ");
		int n = InputReader.readInt();
		//int[] arr = nmbrs.toArray(new int[nmbrs.size()]);
		int index = search(n, 0, nmbrs.size(),nmbrs);
		System.out.println("index is" +index);
		
		//load
	}
	public static List<Integer> load(String fileName) { 
		
		FileContent filen = new FileContent(fileName);
		return filen.readIntList();
		
	}
	
	//search
	public static int search(int num, int startIndex,int lastIndex, List<Integer> arr) { 
	
		if(startIndex >= arr.size() || lastIndex >= arr.size()) {
			return -1;
		}
		
		if(startIndex >= lastIndex) {
			if(arr.get(lastIndex) == num)
				return startIndex;
			return -1;
		}
		int middleIndex = (startIndex + lastIndex) / 2 ; 
		if(arr.get(middleIndex) < num) {
			return search(num,middleIndex,lastIndex,arr);
		}
		else if(arr.get(middleIndex) > num) {
			return search(num,startIndex,middleIndex,arr);
		}
		return middleIndex;
	}
}