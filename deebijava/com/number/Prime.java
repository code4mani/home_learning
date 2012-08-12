package com.number;

import java.io.*;
import com.home.InputReader;

class Prime{
	public static void main(String [] args) 
	{
		System.out.println("Enter the number to check:");
		int a = InputReader.readInt();
		primecheck(a);
	}
	static void primecheck(int a) {
		
		int i;
		for (i=2; i<a;i++ ){
			//int n = a%i;
			if (a%i==0){
				System.out.println("not Prime!");
		break;
			}
		}
		if(i==a){
			System.out.println("Prime number!");
		}
  }
		
}