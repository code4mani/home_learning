package com.prime;

import java.io.*;

public class FileStream{
	public static void main(String [] args) {
	try{
		FileReader file=new FileReader("com/prime/new.txt");
		BufferedReader bur=new BufferedReader(file);
		String str=bur.readLine();
		while(str !=null){
		System.out.println("File read is "+ str);
		str=bur.readLine();
		}
		file.close();
		bur.close();
		}
	catch (IOException e) {
			e.printStackTrace ();
		}
		
}
}