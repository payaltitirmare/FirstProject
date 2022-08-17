package com.collectionss;

import java.util.ArrayList;
import java.util.List;

public class ArrList4 {

	public static void main(String[] args) {
		
		// how to convert collection (ArrayList ) to String array
		
		// for that *toArray* method id used 
		// sollection to string array ke liye sabse pahle to String type ka array declare karna padta hai. 
		//  after that to.Array() method ke under me array ka name pass karna padta hai.
		
		
	List <String> list1 = new ArrayList <> ();
		
		list1.add("payal");
		list1.add("radheshyam");
		list1.add("titirmare");
		
	String arr[] = new String [list1.size()];
	
	
	list1.toArray(arr);
	System.out.println(arr.length);
    for (String e : arr)
    {
    	System.out.println(e);
    }
	
		
	}

}
