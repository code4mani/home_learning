package com.number;

import java.io.*;

public class Addition {

private static int add(int a, int b) {
	return (a + b);
}

private static double add(double a, double b) {
	return (a + b);
}

private static String add(String a, String b) {
	return (a + b);
}

public static void main(String [] args) {
	System.out.println("The sum of the given integers are " + add(4,5));
	System.out.println("The sum of the given Float values are " + add(5.6,1.9));
	System.out.println("The sum of the given Strings values are " + add("Deebika","C"));
}
}