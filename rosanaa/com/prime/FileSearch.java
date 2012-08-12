package com.prime;


import java.io.*;
import com.prime.FileList;
import com.home.InputReader;

import java.util.List;

public class FileSearch{
	public static void main(String [] args) {
		final String CONTENT_FILE = "com/prime/new.txt";
		FileList flist =new FileList(CONTENT_FILE);
		List<String> list = flist.readIt();
		System.out.println("enter the text to search the file");
		String str = InputReader.readString();
		for(String aa: list) {
			if(aa.contains(str)) {
				System.out.println("file is exixted");
				return;
			}
			
		}
		System.out.println("file does not existed");
	}
}