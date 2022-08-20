package com.MathsProblem;
import java.util.Scanner;
public class ThreeBig {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int largest;
	/*	if((num1>num2)&&(num1>num3)){
			System.out.println(num1+"  a is bigger");
			}
		else if((num2>num1)&&(num2>num3)) {
			System.out.println(num2+"  b is bigger");
		}
		else {
			System.out.println(num3 +" a is bigger");
		}
		
		//we can write also.............
		
		/*else if(num2>num3) {
			System.out.println(num2+"  b is bigger");
		}
		else
		{
			System.out.println(num3+" c is bigger");
		}  
		
		largest=(num1>num2)? num1:num2;*/
		
		//smallest number 
		if((num1<num2)&&(num1<num3)) {
			System.out.println(num1);
		}
		else if((num2<num1)&&(num2<num3)) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
	}	
	

}
