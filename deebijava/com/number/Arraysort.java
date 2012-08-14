package com.number;

import java.io.*;
import java.util.Arrays;

public class Arraysort {
	public static void main(String [] args) {
		String[] namelist = {"apple","boy","cat","dog","Egg","rose"};
		Arrays.sort(namelist);
		 for(int i=0;i< namelist.length;i++) {
            System.out.println(namelist[i]);
        }
	}
}