package com.prime;
import java.io.*;
import com.home.InputReader;
import java.util.ArrayList;



public class Searching{
	public static void main(String [] args){
		  System.out.println("Enter the count");
	  
		int a = InputReader.readInt();
		String num[] = new String[a];
				System.out.println("Enter the names");
		for(int i=0;i<a;i++){
			num[i] = InputReader.readString();
			
			
		}
		System.out.println("Enter the name to search:");
		String strn = InputReader.readString();
		for(int i=0;i<a;i++){
			if(num[i] .equals(strn)){
			 System.out.println(" string found");
			}
		}	
	}
}
		