package com.prime;

import java.io.*;
import com.prime.FileList;
import java.util.List;
import java.util.ArrayList;
import com.prime.Human;
import com.prime.Human.Gender;

public class HumanLoader{
	public static List<Human> load(String fileName){
		
		FileList flist =new FileList("resources\namelist.txt");
		List<String> elist =flist.readIt();
		
		List<Human> humanList =new ArrayList<Human>();
		
		for(String str : elist){
			String[] extract =str.split(",");
			int age = Integer.parseInt(extract[0]);
			String name = extract[1];
			Gender gender = getGender(extract[2]);
			humanList.add(new Human(age,name,gender));
		}
		return humanList;
	}
	private static Gender getGender(String gen){
		if(gen.equalsIgnoreCase("male")){
			return Gender.MALE;
		}
		else if(gen.equalsIgnoreCase("FEMALE")){
			return Gender.FEMALE;
		}
		else if(gen.equalsIgnoreCase("TRANS")){
			return Gender.TRANS;
		}
		return Gender.TRANS;
	}
}