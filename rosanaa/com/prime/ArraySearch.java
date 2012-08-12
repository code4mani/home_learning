package com.prime;
import com.home.InputReader;
import java.io.*;
public class ArraySearch{
	public static void main(String [] args) {
		String[] flowers={"rose","lotus","jasmine","lilly"};
			
		System.out.println("Enter the string");
		
		String c = InputReader.readString();
		//for(int i=0;i<flowers.length;i++) {
			
		for(String aa: flowers) {
			if(c.equals(aa)) {
				System.out.println("string is exixted");
				return;
			} 
		}
		System.out.println("string does not exixted");
	}
}
	