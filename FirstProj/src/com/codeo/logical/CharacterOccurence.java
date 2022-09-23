package com.codeo.logical;

import java.util.Scanner;

public class CharacterOccurence {

	//count occurence of character in a string 
	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string ");
  String str = sc.nextLine();
  
  System.out.println("enter which character do you want ..");
   char value = sc.next().charAt(0);
  
  str.toLowerCase();
  
  char ch [] = str.toCharArray();
 
  CharacterOccurence.getCharOccurence(ch, value);
 
}
	
	public static void getCharOccurence (char ch[],char value)
	{
		
     int count=0;

     for(int i=0 ;i< ch.length ;i++)
     {
    	 if(ch[i] == value)
    	 {
    		 count++;
    	 }
     }
		System.out.println(value+" :"+count);
	
	}
}