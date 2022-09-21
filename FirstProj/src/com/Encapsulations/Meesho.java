package com.Encapsulations;

import java.util.Scanner;

public class Meesho {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
	char c= sc.next().charAt(0);
	
	System.out.println(c); 
	
	int i = c;
	System.out.println(i);
		
	int cast = (int)c;
	System.out.println(cast);
	}

}
