package com.prime;

import java.io.*;
import java.util.Arrays;
public class Arraysort{
	public static void main(String [] args) {
		String[] list={"rose","lotus","jasmine","lilly"};
		Arrays.sort(list);
		for(int i=0;i<list.length;i++){
			System.out.println(list[i]);
		}
	}
}
		
