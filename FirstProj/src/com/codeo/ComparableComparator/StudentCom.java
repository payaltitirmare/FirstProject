package com.codeo.ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentCom {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
	
		al.add(new Student(12, "payal" , "nagpur"));
		al.add(new Student(22, "sauarbh" , "nagpur"));
		al.add(new Student(58, "parabh" , "pune"));
		al.add(new Student(45, "usha" , "banglore"));
		al.add(new Student(5,  "usha" , "banglore"));
		
		//Collections.sort(al);
		
		//sorting is not applicable for custom objects because the get confused whjch objevt they call.
		
		System.out.println("before sorting :"+al);
		
		Collections.sort(al);
		
		System.out.println("after sorting :"+al);
		
	
	}

  
}