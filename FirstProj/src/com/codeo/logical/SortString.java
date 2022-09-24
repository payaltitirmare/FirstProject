package com.codeo.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortString {

	     //Sort a String in Java
	public static void main(String[] args) {
		
		String str ="payalti" ;
		char temp;
		char ch[] = str.toCharArray();
		
		System.out.println(ch);
		
		for(int i=0 ; i<ch.length;i++)
		{
			for(int j=1+i; j<ch.length; j++)
			{
				if(ch[j] < ch[i])
				{
					temp = ch[i];
					ch[i]= ch[j];
					ch[j]= temp;
					
				}
			}
		}
		System.out.println(ch);
		
	
	}

}
