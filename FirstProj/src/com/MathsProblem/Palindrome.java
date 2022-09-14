package com.MathsProblem;

public class Palindrome {

	public static void main(String[] args) {
		
		//write a program to check if the given number is palindrome or not
		
		//means  return same from back also
		
		int num =1221;
		
		int org= num;
		
    int rem;
    int store=0;
	while(num!=0)
	{
		rem = num%10;
		
		store = store*10+rem;
		
		num=num/10;
		
		
	}
	
	if(org==store)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}

}
