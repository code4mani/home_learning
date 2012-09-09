package com.number;

import java.io.*;
import com.home.LineDraw;
import com.home.InputReader;


public class Dtry{
	public static void main(String[]args){
		System.out.println("Enter the count:");
		int length = InputReader.readInt();
		int breadth = InputReader.readInt();
		for (int i=0;i<breadth;i++){
			LineDraw.drawLine(length);
			System.out.println("");
		}
	}
}