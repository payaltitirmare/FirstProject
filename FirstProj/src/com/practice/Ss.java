package com.practice;

public class Ss {

	public String name;
	public int Rollnumber;
	
	
	
	public void printdata()
	{
		System.out.println("student name :"+name);
		System.out.println("student rollnumber :"+ Rollnumber);
	}
	
	public static void method()
	{
		
		System.out.println(new Ss().name);
	}
	
	public static void main(String[] args) {
	
		Ss s= new Ss();
		
		s.name = "payal";
		s.Rollnumber = 12;
		s.printdata();

	}

}
