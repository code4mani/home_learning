package com.home;

import java.io.*;

public class Vehicle {
	private double cost;
	
	public Vehicle() {
		System.out.println("Vehicle constructor");
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double c) {
		cost = c;
	}
	
	protected void finalize () throws throwable {
		System.out.println("vehicle Finalize");
	}
	
	public static void main (String [] args) {
		Vehicle v= new Vechicle();
	}
}

