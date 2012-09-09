package com.prime;

import java.io.*;
import com.home.InputReader;


public class Line{
	public static void main(String [] args){
		System.out.println("Enter the count");
		int line = InputReader.readInt();
		for(int i=0;i<line;i++){
			System.out.println(" ");
			//for(int j=0;j<i+1;j++){
				System.out.print('|');
			//}
		}	
		//System.out.print('*');
	}						
}
