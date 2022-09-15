package com.codeo.clas;

import com.practice.Ss;

public class Student {

	

	public String name;
	public int Rollnumber;
	
	
	
	public void printdata()
	{
		System.out.println("student name :"+name);
		System.out.println("student rollnumber :"+ Rollnumber);
	}
	
	public static void main(String[] args) {
	
		Student s= new Student();
		s.name="payal";
		s.Rollnumber=12;
		
		s.printdata();

	}
}
