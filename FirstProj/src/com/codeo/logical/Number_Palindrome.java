package com.codeo.logical;

import java.util.Scanner;

public class Number_Palindrome {


	public static void main(String[] args) {  

	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter number");
	
	int num = sc.nextInt();
	
	Ispalindrome(num);  //it is static method
}

		private static void Ispalindrome(int num) { //1661
		
		int rem, rev = 0, temp;
		
		temp = num;
		
		while(num != 0)  // loop will iterate until num become 0.
		{
			   rem = num % 10;   //1   6   6    1
			   rev = rev *10 + rem ; // 0+1  10 +6  160+6    1
			   num = num /10;      // 166  16   1   0
			}
		
		System.out.println(rev);
		
		if(temp == rev)
		{
		  System.out.println("it is palindrome ");	
		}
		
		else
		{
			System.out.println("it is not palindrome");
		}
		}
}
