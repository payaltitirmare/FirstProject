package com.MathsProblem;

import java.util.Scanner;

public class Switchcasees {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day name");
		String day = sc.next();
		
		switch(day)
		{
		case "mon":
			System.out.println("discount 5%");
			break;
		case "tue":
			System.out.println("discount 5%");
			break;
		case "wed":
			System.out.println("discount 5%");
			break;
		case "thr":
			System.out.println("discount 4%");
			break;
		case "fri":
			System.out.println("discount 4%");
			break;
		case "sat":
			System.out.println("discount 3%");
			break;
		case "sun":
			System.out.println("discount 3%");
			break;
		
		default:
			System.out.println("wrong data give proper data");
		}
	}

}
