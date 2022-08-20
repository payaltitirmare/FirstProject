package com.assignmnet;

import java.util.Arrays;

public class Ans {
	
	public static void main(String [] args) {
		
		
		//System.out.println(2+10+3+"ratan"+3*4+3+"anu"+1+6+2);
		
//===============================================================================================================================================
		
		//==================STRINGS PRACTISE===================================
		
	/*	String s="payal";
		
		s.concat("titirmare");
		
		System.out.println(s);
		
		String s1=new String("ushbai");
		
		s1.concat(s);
		System.out.println(s1);
		
		s1="payalradheshyam";
		System.out.println(s1+s1);*/
		System.out.println("===================================================================");
		
		//reverse a string...........
		
	/*	String sr=new String ("payal Learn coding");
		
		System.out.println(sr.length());
		
		char [] arr=sr.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
		}    */
		
		System.out.println("===================================================================");
		
		//string is anagram or not ==anagram means compare two strings and checks its same or not according to alphabets=======
		
		String s="live";
		String r="evil";
		
		System.out.println(s.length());
		
		if(s.length()==r.length()) {
			
			char [] arr = s.toLowerCase().toCharArray();
			char [] aa= r.toLowerCase().toCharArray();
			
			char temp;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			
			char temp1;
			
			for(int i=0;i<aa.length;i++) {
				for(int j=i+1;j<aa.length;j++) {
					if(arr[i]>arr[j]) {
						
						temp1=arr[i];
						arr[i]=arr[j];
						arr[j]=temp1;
					}
				}
				}
			
			
			 boolean result = Arrays.equals(arr,aa);
				if(result) 
					System.out.println("string are anagram");
				
				else 
					System.out.println("string are not anagram");
				
					}
		else {
			System.out.println("string are not anagram");
		} 
			}
		}
			
	
	
/*
 public static void main(String [] args) {
	 String str="learn java coding";
	 
	 System.out.println(str.length());
 
	String s1="payal";
	String s2="saurabh";
	
	System.out.println(s1.replace('l', 'm'));
	System.out.println(s1.replaceAll(s2, str));
	
	 
	 
/*	int count=0;
 for (int i=0;i<str.length();i++) {
	 if(str.charAt(i)!= ' ') {
		 count++;
	 }
 } 
	System.out.println(count);  */
	//reverse the string 
	 
	/* char a[]=str.toCharArray();
	//String rev=" ";
	 for(int i=a.length-1;i>=0;i--) {
	//	 rev=rev+a[i];
		 System.out.print(a[i]);
	 }
	 
	 char a[]=str.toCharArray();
	 System.out.println(a[6]);
	 System.out.println(str.charAt(6));
	
	 for(int i=a.length-1;i>=0;i--) {
		 System.out.print(a[i]);
		
	 }
	
	 
	 
 }*/

