package com.prime;

import java.io.*;
import com.prime.FileList;
import java.util.List;
import java.util.ArrayList;
import com.prime.Human;
import com.prime.Human.Gender;
import java.util.Comparator;
import java.util.Collections;
import com.prime.HumanLoader;

public class Agesort2{
	public static void main(String [] args){
		List<Human> li = HumanLoader.load("resources/namelist.txt");
		Collections.sort(li);
		
		System.out.println("sorted human age");
		for(Human st :li){
			System.out.println(st.getName());
		}
		
	}
}