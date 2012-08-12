package com.prime;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class FileList {
	private String name ;
	
	public FileList(String fileName) {
		name =fileName;
		System.out.println("name of the file="+name);
	}
	public List<String> readIt(){
		List<String>list =new ArrayList<String>();
		
		
		FileReader file =null;
		BufferedReader bur =null;

		try{
			file=new FileReader(name);
			bur =new BufferedReader(file);
			String str =bur.readLine();
			while(str !=null){
			list.add(str);
			str =bur.readLine();
			}
			file.close();
			bur.close();
		}
		catch (IOException e) {
				e.printStackTrace ();
		}
		return list;
		
	}
} 