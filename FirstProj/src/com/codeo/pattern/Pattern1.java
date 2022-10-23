package com.codeo.pattern;

import java.util.Scanner;

public class Pattern1 {

	//    * * * *   
	//    * * *  
	//    * * 
	//    *
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter how row want");
		int row = sc.nextInt() ;

		for (int i = row; i >=0 ; i --) //0 1 2 3 4 
		{
			for (int j =0 ; j<= i ; j++) // 1 //0 1 // 0 1 2 // 0 1 2 3 // 0 1 2 3 4
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}

	}

}
