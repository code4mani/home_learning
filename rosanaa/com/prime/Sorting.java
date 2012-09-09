package com.prime;
import java.io.*;
import com.home.InputReader;



public class Sorting{
	public static void main(String [] args){
		  System.out.println("Enter the count");
	  
		int a =InputReader.readInt();
		int num[] = new int[a];
		 //5..num[1]=4
		
		for(int i=0;i<a;i++){
			num[i] = InputReader.readInt();
			//System.out.println("numbers are:"+num[i]);
			
		}
		//System.out.println("value of biggernumer is"+bignumber);
		int bignumber = num[0];
		for( int i=1;i<a;i++){
			//num [i] = InputReader.readInt();
			if(bignumber < num[i]){
			bignumber = num[i];
			
			}
		}
		 System.out.println("bigger number is"+bignumber);
		
	}
}
	  
	  
			