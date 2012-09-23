package com.number;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.home.InputReader;
import com.home.FileContent;
import com.number.Algorithms;

public class BubSortString{
	public static void main(String[] args) {
		FileContent f = new FileContent("resources/stringlist.txt");
		List<String> names = f.readIt(); 
		System.out.println("The Names in the list are: " +names);
		Algorithms.bubbleStrSort(names);
		/*int n = names.size();
		
		for(int j=n; j>0 ;j--) {
			for(int i=0; i<j-1 ;i++) {
				if(names.get(i).compareToIgnoreCase(names.get(i+1)) > 0)
					Collections.swap(names,i,i+1);
				//}
			}
		}*/
		System.out.println("The names in the list are: " +names);
			
	}
}	