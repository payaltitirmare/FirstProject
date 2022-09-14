package com.MathsProblem;

import java.util.Scanner;

public class StudentData {

	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student name");
		String name = sc.next();
		
		System.out.println("enter science marks");
		int science = sc.nextInt();
		System.out.println("enter social science marks");
		int sst = sc.nextInt();
		System.out.println("enter maths marks");
		int maths = sc.nextInt();
		
		int sum = science+sst+maths;
		
		int avg = sum/3;
		
		
		if(avg>=50)
		{
			System.out.println("hii "+name+"  you passed your total marks "+sum+" your percentage  " +avg);
		}
		else 
		{
			System.out.println("hii "+name+" you failed your total marks  "+sum+" your percentage payal  "+avg);
		}
		
	}

}
