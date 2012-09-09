package com.number;

import java.io.*;
import com.home.FileContent;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import com.number.Human;
import com.number.Human.Gender;
import com.number.HumanLoader;



public class Agesort{
	public static void main(String[] args) {
		List<Human> hum = HumanLoader.load("resources/namelist.txt");
		//Sorting
		Collections.sort(hum, new Comparator<Human> () {
			public int compare(Human h1, Human h2) {
				return (h1.getAge() - h2.getAge());
			}
			
			/*	if(h1.getAge() == h2.getAge()) {
					return 0;
				}
				else if(h1.getAge() < h2.getAge()) {
					return -1;
				}
				else {
					return 1;
				}
			}*/
		});

		System.out.println("Sorted humen name:");
		for(Human st : hum) {			
			System.out.println(st.getName());
		}
		
	}
}