package com.number;

import java.io.*;
import java.io.IOException;
import com.home.InputReader;
import com.number.Algorithms;


class NewThread implements Runnable {
   Thread t;
   Integer numbers[];
   int num;
   NewThread(Integer [] arr, int n) {
      // Create a new, second thread
      t = new Thread(this, "Demo Thread");
	  numbers= arr;
	  num = n;
      System.out.println("Child thread: " + t);
      t.start(); // Start the thread
   }
   
   // This is the entry point for the second thread.
	public void run() {
		if ( Algorithms.linearSearch(numbers,num,(numbers.length/2)+1 , (numbers.length-1)) ) {
			System.out.println("Found in 2nd half");
		}
	}
}

class ThreadDemo {
   public static void main(String args[]) {
		Integer [] arr  = {3,6,1,2,0,45,23,68,66,4};
		int n = InputReader.readInt();
		new NewThread(arr,n); // create a new thread
		if( Algorithms.linearSearch(arr,n,0,(arr.length/2)) ) {
			System.out.println("Found in first half");
		}
   }
}