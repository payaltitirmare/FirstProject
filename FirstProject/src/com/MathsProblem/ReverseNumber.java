package com.MathsProblem;
import java.util.Scanner;
public class ReverseNumber {

	
	public static void main(String[] args) {
	//reverse the number 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number you want to reverse");
		int num=sc.nextInt();
		int rev=0;
		int sum=0;
		//this logic is also valid  using while loop
		/*while(num!=0) {
			
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		
		System.out.println("the reverse number is:"+sum);*/
		
		//this is uding for loop without increment operator is also valid
		
		for(int i=num;num>0; ) {
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		System.out.println("the reverse number will be:"+sum);
		
		//this is with increment operator is also valid

		for( ;  num!=0;  num=num/10 ) {
			rev=num%10;
			sum=sum*10+rev;
		}
		System.out.println("the reverse number will be:"+sum);
	}

}
