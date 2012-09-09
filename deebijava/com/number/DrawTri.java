package com.number;

import java.io.*;
import com.home.InputReader;

public class DrawTri{
	public static void main(String[]args){
		System.out.println("Enter the count:");
		int length = InputReader.readInt();
		for(int i=0;i<length;i++) {
			String line=" ";
			for(int k=length-1;k>i;--k) {
				line = line + " ";
			}
			
			line = line + "* ";
			if(i< length-1) {
				for(int j=1;j<i;j++) {
					line = line + " ";
					line = line + " ";
				}
			}
			else {
				for(int j=1;j<i;j++) {
					line = line + "*";
					line = line + " ";
				}
			}
			if(i>=1) {
				line = line + "*";
			}
			System.out.println(line);
		}
	}
}
				