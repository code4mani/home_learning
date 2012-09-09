package com.prime;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import com.home.InputReader;
import com.home.FileContent;


public class Algorithms /*extends Object */{
	public static void BubbleSortnum(List<Integer> nmbrs) {
		int n = nmbrs.size();
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(nmbrs.get(i) > nmbrs.get(i+1)) {
					Collections.swap(nmbrs,i,i+1);
				}
			}
		}
	}
	public static void BubbleSortStr(List<String> s){
		int n = s.size();  
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(s.get(i).compareToIgnoreCase(s.get(i+1)) > 0) {
					Collections.swap(s,i,i+1);
				}
			}
		}
	}
	
	//class Object {
	//}
	//class T extends Object implements Comparable<T> {
	//}
	//class ? extends T {
	//}
	
	public static <T extends Object & Comparable<? super T>>
	void BubbleSort(List<? extends T> s){
		int n = s.size();  
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(s.get(i).compareTo(s.get(i+1)) > 0) {
					Collections.swap(s,i,i+1);
				}
			}
		}
	}

	public static void Linear(List<Integer> nmbrs, int x){	
		for (Integer i : nmbrs) {
			
			if (i == x) {
				System.out.println("The number is found");
				break;
			}			
		}
	}
	
}	 