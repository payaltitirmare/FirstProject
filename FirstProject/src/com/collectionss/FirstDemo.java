package com.collectionss;
import java.util.*;
public class FirstDemo {

	public static void main(String[] args) {
		
		ArrayList<Comparable> i = new ArrayList();
		//add method is used for adding elements.
		
		
		i.add(10);
		i.add(null);     //in collection we can store hetrogeneous data aand duplicate data also...
		System.out.println(i); 
		
                //remove method is used for removing.. object 
		i.remove(1);
		System.out.println(i);
		
		       //add(with parameters ) method is used for this  replacement of object..........
		
		i.add(1, "payal");
		System.out.println(i);
		
	}

}
