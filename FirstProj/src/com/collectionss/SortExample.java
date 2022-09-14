package com.collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class SortExample {


	public static void main(String[] args) {
		
		ArrayList <Emp> emps = new ArrayList<> ();
		
		emps.add (new Emp("payal", "34",  12));
		emps.add(new Emp("saurabh","2344",44));
		
		System.out.println(emps);
	}


}