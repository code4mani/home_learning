package com.prime;

import java.io.*;
import com.home.InputReader;


public class DrawSquare{
	public static void main(String [] args){
		System.out.println("Enter the count");
		//System.out.println("*");
		int length = InputReader.readInt();
		for(int i=0;i<length;i++){
			System.out.println(" ");
			if(i ==0 || i == length-1){
				for(int j=0;j<length;j++){
					System.out.print('*');
				}
			}
			else {
				System.out.print('*');
				for(int j=0;j<length-2;j++){
					System.out.print(' ');
				}
				System.out.print('*');
			}
		}
	}
}
		
		
	
		
	
	
					
					
					
					
					
					
					
		
		