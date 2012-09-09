package com.prime;

import java.io.*;
import java.lang.*;
import com.home.InputReader;
import java.util.Arrays;

public class Letters{
	public static void main(String args[]){
		String[] oneToTen={"","one","two","three","four","five","six","seven","eight","nine"};
		String[] eleToNineteen={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] twenToHund={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		System.out.println("Enter the number from 1 to 100"); //56
		String num  = InputReader.readString();// num = 5 6
		int length = num.length();// length = 2
		
		
		if(length==1){
			Character c1 =num.charAt(0); // c1= 5 
			String s1 =c1.toString();
			int b =Integer.parseInt(s1); // int 5;
			System.out.println("the converted value is "+oneToTen[b]); //five
			return ;
		}
		if(length==2){
			Character c1 =num.charAt(0); //5
			Character c2 =num.charAt(1); //6

			String s1 =c1.toString();
			int b =Integer.parseInt(s1); //int5
			String s2 =c2.toString();
			int b1 =Integer.parseInt(s2); //int 6
			if(b == 1){
				System.out.println("the converted value is "+eleToNineteen[b1]);
			}
			else{
				System.out.println("the converted value is "+twenToHund[b]+" "+ oneToTen[b1]);
			
			}
		}
	}
}
		
		
		
		
		