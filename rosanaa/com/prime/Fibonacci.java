package com.prime;
import com.home.InputReader;


public class Fibonacci{
	public static void main(String args[]){
		System.out.println("Enter the positive integer");
		int num =0;
		String errorMessage = "please enther a valid positive integer";
		try{
			 num = InputReader.readInt(); 
		}
		catch(NumberFormatException ex) {
			System.out.println(errorMessage);
			return ;
		}
		if(num<=0) {
			System.out.println(errorMessage);
			return ;
		}
			//System.out.println("Fibonacci Series");
		int f1, f2=1, f3=1;
		for(int i=2;i<num;i++){
			
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
		System.out.println(num + "th fibo is " + f3);
	}
}