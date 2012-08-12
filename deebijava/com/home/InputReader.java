package com.home;

import java.io.IOException;

public class InputReader {
	public static int readInt() {    //Used for reading integer
		int a = 0;
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
	
	public static double readDouble() {
		double a = 0;
		byte[] bArray = new byte[100];
		try {
			System.in.read (bArray);
			String s = new String (bArray);
			a = Double.parseDouble(s.trim());
		}
		catch (IOException e) {
			e.printStackTrace ();
		}
		return a;
	}
	
	public static String readString() {
		String s = "";
		byte[] bArray = new byte[100];
		try {
			System.in.read (bArray);
			s = new String (bArray);
			
		}
		catch (IOException e) {
			e.printStackTrace ();
		}
		return s.trim();
	}
}
