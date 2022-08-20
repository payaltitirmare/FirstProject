package com.collectionss;

import java.util.ArrayList;
import java.util.List;

public class ArrList2 {

	public static void main(String[] args) {
		//for homogenous arraylist you have to use generics means like..<>
		
		List <Integer>list1 = new ArrayList <>();
		
	list1.add(Integer.valueOf("8"));   //wrapper class concept converting from string to integer through valuof method..
	
	list1.add(5);
	list1.add(6);
	list1.add(33);
	list1.add(5);
	
	System.out.println(list1);
	
	list1.add(null);
	list1.add(3, 6);
	System.out.println(list1);
	
	System.out.println(list1.contains(9)); //this check object is present or not in specific list of collection............
	
	list1.remove(4);
	System.out.println("================================");
	System.out.println(list1);
    
	list1.add(3, 12);
	list1.add(32);
	System.out.println("after adding and removing all objects"+list1);
	
	
	
	
	
	
	
	
	}

}
