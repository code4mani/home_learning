package com.number;

import java.io.*;
import com.home.FileContent;
import java.util.List;
import java.util.ArrayList;
import com.number.Human;
import com.number.Human.Gender;


public class HumanLoader{
	public static List<Human> load(String fileName) { 
		
		FileContent filen = new FileContent("resources/namelist.txt");
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