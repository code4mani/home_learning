package com.number;

import java.io.*;
import java.lang.*;
import java.util.Arrays;
import com.home.InputReader;

public class LetterConv { 
	
	public static void main(String [] args) {
		String[] oneToTen = {"","one","two","three","four","five","six","seven","eight","nine"};
		String[] tillNineteen = {"ten","eleven","twelve","thirteen","fourteen","Fifteen","Sixteen","seventeen","eighteen","nineteen"};
		String[] tillHundred = {"","","twenty","thirty","fourty","fifty","sixty","seventy","Eighty","ninety"};
		System.out.println("Enter any number from 1 to 100 for conversion"); 
		String num = InputReader.readString(); 
		int length = num.length(); 

		if(length == 1)	{
			Character c1 = num.charAt(0);
			
			String s1 = c1.toString();
			int i1 = Integer.parseInt(s1);
			
			System.out.println("the converted value is " + oneToTen[i1]);
			return;
		}
		if(length == 2) {
			Character c1 = num.charAt(0);
			Character c2 = num.charAt(1);
			
			String s1 = c1.toString();
			int i1 = Integer.parseInt(s1);
			
			String s2 = c2.toString();
			int i2 = Integer.parseInt(s2);
			if(i1 == 1) {
				System.out.println("the c1onverted value is " + tillNineteen[i2]);
			}
			else {
				System.out.println("the converted value is " + tillHundred[i1] + " " + oneToTen[i2]);
			}
		}
	}
}