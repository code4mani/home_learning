package com.number;

import java.io.*;


public class MemoryLeak {
	public static void main(String[] args) {
		int arr[];
		//Java GC works well!!!
		while (true) {
			arr = new int[2000000];
		}
	}
}