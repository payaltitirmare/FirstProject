package com.collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrList3 {

	public static void main(String[] args) {
		
		//converting arrays into collection...
		
	//Arrays.asList()= wrap the array into an list and return arraylist..
		
		String arr[] = {"codeo", "graph" ,"solutions" ,"payal" };
		
	   List <String> arlist= new ArrayList <> (Arrays.asList(arr));
		
		System.out.println(arlist);
		System.out.println(arlist.size());
		
		for(String e : arlist) {
			
			System.out.println(e);
			
		}
	
	}	
}
