package com.home;

import java.io.IOException;

public class LineDraw {
	public static void drawLine(int length) {    //Used for reading integer
		for (int j=0;j<length;j++) {
			System.out.print('*');
		}
	}
	//space
	public static void drawSpace(int length) {    //Used for reading integer
		for (int j=0;j<length;j++) {
			System.out.print(' ');
		}
	}
}