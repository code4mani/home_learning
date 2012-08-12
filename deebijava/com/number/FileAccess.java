package com.number;

import java.io.*;

public class FileAccess {
	public static void main(String [] args) {
		try {			
			FileReader file = new FileReader("com/number/new.txt");
			BufferedReader bur = new BufferedReader(file);
			String str = bur.readLine();
			while(str != null) {
				System.out.println(str);
				str = bur.readLine();
			}
			file.close();
			bur.close();
		}
		catch(IOException e) {
			e.printStackTrace ();
		}

	}
}
