package com.codeo.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row  ");
		int row = sc.nextInt() ;
		
		for (int i = row ; i >=0 ; i--)
		{
			for (int j = 0 ; i >= j ;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
