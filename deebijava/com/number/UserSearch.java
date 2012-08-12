package com.number;

import java.io.*;
import com.home.InputReader;

public class UserSearch {
	public static void main(String [] args) {
		System.out.println("Enter the limit :");
		int n = InputReader.readInt();
		String[] grpnames = new String[n];
		for(int i=0;i<grpnames.length;i++) {
			grpnames[i]= InputReader.readString();
		}
		
		for(String gt: grpnames){
			System.out.println(gt);		
		}
		
	}
}