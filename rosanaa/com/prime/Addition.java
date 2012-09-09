package com.prime;

import java.io.*;

public class Addition{
	private static int add(int a,int b){
		return (a+b);
	}
	private static double add(double a,double b){
		return (a+b);
	}
	private static String add(String a,String b){
		return (a+b);
	}
public static void main(String [] args){
	System.out.println("The sum of the"+add(5,6));
	System.out.println("The sum of the"+add(2,9));
	System.out.println("The sum of the"+add("aaaaa","bbbbbbbb"));
	}
}
	