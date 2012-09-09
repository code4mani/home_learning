package com.number;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import com.number.Human;
import com.number.HumanLoader;

public class AgeSort2{
	public static void main(String[] args) {
		List<Human> hum = HumanLoader.load("resources/namelist.txt");
		//Sorting
		Collections.sort(hum);
		System.out.println("Sorted human name:");
		for(Human st : hum) {			
			System.out.println(st.getName());
		}
		
	}
}