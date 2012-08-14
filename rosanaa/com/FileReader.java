package com.prime;

import java.io.*;

public class FileStream{
	public static void main(String [] args) {
	try{
		FileReader File=new FileReader("com/prime/new.txt");
		BufferedReader bur=new BufferedReader(file);
		string str=bur.Readline();
		file.close();
		bur.close();
		system.out.println("File read is "+ str);
		}
	catch (IOException e) {
			e.printStackTrace ();
		}
		
}
}