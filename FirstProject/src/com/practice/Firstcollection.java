package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Firstcollection {

	public static void main(String[] args) {
		
		List <String>list = new ArrayList <> () ;
		
		list.add("pink");
		list.add("red");
		list.add("black");
		list.add(1, "yellow");
		list.add("payal");
	

         System.out.println(list);
		//print elements with index number one by one
		String arr[] = new String [list.size()];
		
			list.toArray(arr);	
			for (String e : list)
				
			{
				System.out.println(e);
			}
	for (int i=0;i<arr.length;i++)
     {
    	 System.out.println("index :  "+i+" , elements:  "+arr[i]);
     }
		
	}

}
