package com.codeo.logical;

import java.util.Scanner;

public class IsPalindrome {

	
	//palindrome = same from front as well as back
	boolean flag= true;
	
	public boolean ispalindrome(String s)
	{
	       s.toLowerCase();
	       System.out.println(s.indexOf('p'));
	       
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-i-1))
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("it is palindrome");

		}
		else 
		
			System.out.println("it is not palnidrome");
			return false;
		
	}
	public static void main(String[] args) {
		
		IsPalindrome pal= new IsPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string ");
		String s = sc.next();
		
		pal.ispalindrome(s);
		
	}

}
