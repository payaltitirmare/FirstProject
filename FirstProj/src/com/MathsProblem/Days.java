package com.MathsProblem;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter day");
		String day = sc.next();
		
		if(day.equals("mon"))
		{
			System.out.println("Discount 5%");
		}
		
		else if(day.equals("tue"))
		{
			System.out.println("Discount 5%");
		}
		
		else if(day.equals("wed"))
		{
			System.out.println("Discount 5%");
		}
		
		else if(day.equals("thr"))
		{
			System.out.println("Discount 4%");
		}
		
		else if(day.equals("fri"))
		{
			System.out.println("Discount 4%");
		}
		else if(day.equals("sat"))
		{
			System.out.println("Discount 3%");
		}
		else if(day.equals("sun"))
		{
			System.out.println("Discount 3%");
		}
		
		else {
			System.out.println("wrong data give proper data");
		}
		
		
	}

}
