package com.number;

import java.io.*;
import com.home.FileContent;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import com.number.Human;
import com.number.Human.Gender;


public class HumanLoader{
	public static void main(String[] args) {
		List<Human> hum = load("resources/namelist.txt");
		int maleCount =0;
		for(Human h : hum) {
			if(h.getGender() == Gender.MALE) {
				maleCount++;
			}
		}
		System.out.println("There are : " + maleCount + " men");
		//for listing female names
		for(Human f : hum) {
			if(f.getGender() == Gender.FEMALE) {
				System.out.println("Female names are : " + f.getName());
			}
		}
		//Sorting
		
		Algorithms.bubbleSort(hum, new Comparator<Human> () {
			public int compare(Human h1, Human h2) {
				return h1.getName().compareToIgnoreCase(h2.getName());
			}
		});
		// Collections.sort(hum, new HumanComparator() );
		/**Collections.sort(hum, new Comparator<Human> () {
			public int compare(Human h1, Human h2) {
				return h1.getName().compareToIgnoreCase(h2.getName());
			}
		});
*/
		System.out.println("Sorted humen name:");
		for(Human st : hum) {			
			System.out.println(st.getName());
		}
		
	}
	/*
	static class HumanComparator implements Comparator<Human> {
		public int compare(Human h1, Human h2) {
			return h1.getName().compareToIgnoreCase(h2.getName());
		}
	} */
	
	public static List<Human> load(String fileName) { 
		
		FileContent filen = new FileContent(fileName);
		List<String> elist = filen.readIt();
		
		List<Human> humanList = new ArrayList<Human>(); 
		
		for(String str : elist) {
			String[] extract = str.split(",");
			int age = Integer.parseInt(extract[0]);
			String name = extract[1];
			Gender gender = getGender(extract[2]);
			humanList.add(new Human(age,name,gender));
		}
		return humanList;
		
	}
	private static Gender getGender(String gen) {
		if(gen.equalsIgnoreCase("male")) {
			return Gender.MALE;
		}
		else if(gen.equalsIgnoreCase("female")) {
			return Gender.FEMALE;
		}
		else if(gen.equalsIgnoreCase("trans")) {
			return Gender.TRANS;
		}
		return Gender.TRANS;
	}
		
}