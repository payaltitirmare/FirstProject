package com.codeo.logical;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MaxMinCharacter {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string here :");
		String name = sc.nextLine();
		
		FindDuplicate(name);
	}

	private static void FindDuplicate(String name) {
		
		
		for(int i =0 ;i<name.length(); i++)
		{
			for(int j=i+1; j<name.length(); j++)
			{
				if(name.charAt(i)== name.charAt(j))
				{
					
					System.out.print(name.charAt(i)+"  ");
				}
				
			}
		}
		
		
	}
	
}
