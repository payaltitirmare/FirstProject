package com.collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {

	public static void main(String[] args) {
		
		List <Integer> ll =new LinkedList <>();
		List  <Integer> al =new ArrayList< >();
		

		System.out.println(ll.get(1));   // get 1 index 
		
		
		
		
	}

	
	static void getTimeDiff(List < Integer > list)
	{
		for (int i=0 ; i<10000 ; i++)
		{
			list.add(i);
		}
	}
}
