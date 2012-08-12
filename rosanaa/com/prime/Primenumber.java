package com.prime;

import java.io.*;
class Primenumber{
	public static void main(String [] args)
	{
		System.out.println("Enter the number");
		byte[] bArray = new byte[100];
		
		try {
			
			System.in.read (bArray);
			String s = new String (bArray);
			//System.out.println("before limit"+s.trim()+"After limit");
			int n = Integer.parseInt(s.trim());
			prime(n);
		}
		catch (IOException e) {
			e.printStackTrace ();
		}
		
	}
	static void prime(int s) {
		if(s%2==0)
		{
			System.out.println("Even number");
		}
			else
			
		{
			System.out.println("odd number");
		}
	}
	}