package com.codeo.logical;

import java.util.Scanner;

public class IsAmstrong {

	//armstrong 1234= 4 digits ---> power 4 for all 1pow4+2pow4+3 pow4+ 4pow4 = it is ame as given number then it is armstrong
	
	int count=0;
	int  temp;
	int rem=0;
	int sum=0;
	public boolean isamstrong(int num)
	{
	    
	   while( num!=0)
	   {
		   rem = num /10; 
		   count=count+1;
		   
	   }
	   
	   while(num !=0)
	   {
		   rem = num%10;
		   sum = (int) (sum+Math.pow(rem, count));
		   num=num/10;
	   }
	   if (sum == temp)
	   {
		   System.out.println(" armstrong");
	   }
	   else {
		   System.out.println("not armstrong");
	   }
	   return false;
	}
	public static void main(String[] args) {
		
		IsAmstrong ams = new IsAmstrong();
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		ams.isamstrong(num);

	}

}
