package com.number;

import java.io.*;
import java.util.Scanner;

public class Bigger {
	public static void main(String [] args) {
		System.out.println("Enter the count :");
		Scanner userinput = new Scanner(System.in);
		int a = userinput.nextInt();
		int number[]=new int[a];
		int bignumber = number[0];
		for (int i=0;i<a;i++)
		{
			number[i] = userinput.nextInt();
		}
		
		for (int i=0;i<a;i++)
		{
			if(bignumber < number[i]) {
				bignumber= number[i];
			}
		}
		
		System.out.println("The bigger number is :" +bignumber);
	}
}