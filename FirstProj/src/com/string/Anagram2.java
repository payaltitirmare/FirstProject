package com.string;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		String s="race";
		String r="care";
		
		System.out.println(s.length());
		s= s.toLowerCase();
		r= r.toLowerCase();
		if(s.length()==r.length()) {
			
			char [] arr =s.toCharArray();
			char [] aa=r.toCharArray();
			
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
					if(aa[i]>aa[j]) {
						
						temp1=aa[i];
						aa[i]=aa[j];
						aa[j]=temp1;
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
			


