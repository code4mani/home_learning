package com.prime;

import java.io.*;

import java.util.Comparator;

public class Human implements Comparable<Human> {
	public enum Gender{
		MALE,
		FEMALE,
		TRANS
	} 
		
	private int age;
	private String name;
	private Gender gender;
	public Human(int age,String name,Gender gender){
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public Gender getGender(){
		return gender;
	}
	
	public int compareTo(Human other) {
		return this.getAge() - other.getAge();
	}
	
	
}
		