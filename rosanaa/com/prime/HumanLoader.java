package com.prime;

import java.io.*;
import com.prime.FileList;
import java.util.List;
import java.util.ArrayList;
import com.prime.Human;
import com.prime.Human.Gender;
import java.util.Comparator;
import java.util.Collections;

public class HumanLoader{
	public static void main(String [] args){
		List<Human> li =load("resources/namelist.txt");
		int maleCount =0;
		for(Human h: li){
			if(h.getGender()==Gender.MALE){
				maleCount++;
			}
		}
		System.out.println("There are :"+maleCount+"men");
		for(Human f: li){
			if(f.getGender()==Gender.FEMALE){
			System.out.println("Female names are :"+f.getName());
			
			}
		}
		Collections.sort(li, new Comparator<Human>() {
			public int compare(Human h1,Human h2) {
				return h1.getName().compareToIgnoreCase(h2.getName());
			}
		});
		System.out.println("sorted human name");
		for(Human st :li){
			System.out.println(st.getName());
		}
		
}
	public static List<Human> load(String fileName){
		
		FileList flist =new FileList(fileName);
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