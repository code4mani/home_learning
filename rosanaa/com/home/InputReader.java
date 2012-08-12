package com.home;
import java.io.IOException;

public class InputReader {


	public static  int readInt() {
	
		int a=0;
		byte[] bArray = new byte[100];
		
		try {
			
			System.in.read (bArray);
			String s = new String (bArray);
			
			 a = Integer.parseInt(s.trim());
			
		}
		catch (IOException e) {
			e.printStackTrace ();
		}
		return a;
	}
	

		public static String readString() {
	
		String a = "";
		byte[] bArray = new byte[100];
		
		try {
			
			System.in.read (bArray);
			a = new String (bArray);
			
		
			}
		catch (IOException e) {
			e.printStackTrace ();
		}
		return a.trim();
	}
	
	}
	