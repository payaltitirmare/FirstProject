package com.assignmnet;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else 
			System.out.println("number is odd");
	
	
	if(num%2!=1)
	{
		System.out.println("number is even");
	}

	else 
		System.out.println("number is odd");
}
	
}