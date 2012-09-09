  package com.home;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class FileContent {
	private String name ;

	public FileContent(String fileName) {
		name = fileName;
	}
	public List<String> readIt() {
		List<String> list = new ArrayList<String>();
		
		FileReader file = null;
		BufferedReader bur = null;
			
		try {			
			file = new FileReader(name);
			bur = new BufferedReader(file);
			String str = bur.readLine();
			while(str != null) {
				list.add(str);
				str = bur.readLine();
			}
			file.close();
			bur.close();
		
		}
		catch(IOException e) {
			e.printStackTrace ();
		}
		return list;
	}
	
	//int
	public List<Integer> readIntList() {
		List<Integer> list = new ArrayList<Integer>();
		
		FileReader file = null;
		BufferedReader bur = null;
			
		try {			
			file = new FileReader(name);
			bur = new BufferedReader(file);
			String str = bur.readLine();
			while(str != null) {
				list.add(Integer.parseInt(str));
				str = bur.readLine();
			}
			file.close();
			bur.close();
		
		}
		catch(IOException e) {
			e.printStackTrace ();
		}
		return list;
	}

}
 