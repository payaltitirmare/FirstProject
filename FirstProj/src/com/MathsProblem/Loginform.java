package com.MathsProblem;

import java.util.Scanner;

public class Loginform {

	
	public static void main(String[] args) {
		
		//print bigger
			
			Scanner sc = new Scanner(System.in);
		
			System.out.println("enter the user name");
			String name = sc.next();
			
			System.out.println("enter the password");
			int pass = sc.nextInt();
			
			if(name.equals("payal") && pass==123)
			{
				System.out.println("login succefull");
			}
			else
			{
				System.out.println("fail");
			}
		}
	
}
