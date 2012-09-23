package com.number;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import java.util.Comparator;
import com.home.FileContent;


public class Algorithms {
//bubble sort string
	public static <T extends Object & Comparable<? super T>>
	void bubbleSort(List<? extends T> names) {
		int n = names.size();
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(names.get(i).compareTo(names.get(i+1)) > 0)
					Collections.swap(names,i,i+1);
			}
		}
	}
	
	public static <T extends Object & Comparable<? super T>>
	void bubbleSort(List<? extends T> names,Comparator<T> c) {
		int n = names.size();
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(c.compare(names.get(i),names.get(i+1)) > 0)
					Collections.swap(names,i,i+1);
			}
		}
	}
	
// linear search

//public static void LinearSearchNum(List<Integer> nmbrs, int x) {
    public static <T> void linearSearch(List<T> nmbrs,T x) {
		for(T s : nmbrs) {
			System.out.println( s );
		}
		
		for (T i : nmbrs) {
			
			if (i.equals(x)) {
				System.out.println("The number is found");
				break;
			}
		}
	}
	
	//array
	
	 public static <T> boolean linearSearch(T[] nmbrs,T x,int sindex,int eindex) {
		for (int i = sindex ; i<= eindex ; i++) {
			System.out.println( nmbrs[i] );
		}
		
		for (int i = sindex ; i<= eindex ; i++) {
			if (nmbrs[i].equals(x)) {
				return true;
			}
		}
		return false;
	}
}