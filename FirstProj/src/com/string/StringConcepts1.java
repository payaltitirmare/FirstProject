package com.string;

public class StringConcepts1 {

	public static void main(String[] args) {
	//find string length ignore space	
		String str="java codes";
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
