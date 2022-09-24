package com.codeo.logical;

import java.util.Arrays;

public class CompareString {

	public static void main(String[] args) {
		
		String str1="live";
		String str2="evil";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char [] a1=str1.toCharArray();
			char [] a2=str2.toCharArray();
			
			char temp;
			for(int i=0;i<a1.length;i++) {
				for(int j=i+1;j<a1.length;j++) {
					if(a1[i]>a1[j]) {
						temp=a1[i];
						a1[i]=a1[j];
						a1[j]=temp;
					}
				}
			}
			
			char temp1;
			for(int i=0;i<a2.length;i++) {
				for(int j=i+1;j<a2.length;j++) {
					if(a2[i]>a2[j]) {
					
						temp1=a2[i];
						a2[i]=a2[j];
						a2[j]=temp1;
						
					}
				}
			}
			
	boolean 	result = Arrays.equals(a1, a2)	;
	
	if(result)
	{
		System.out.println("String is anagram");
	}
	else
	{
		System.out.println("string is not anagram/same");
	}
		}
	}
}
						
						
                         
