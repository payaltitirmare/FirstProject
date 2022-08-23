package com.assignmnet;

import java.util.ArrayList;
import java.util.List;

public class Al {

	public static void main(String[] args) {

     //colection to arra convert ..........
		List <String>l = new ArrayList ();
		
		l.add("pp");
		
		l.add("yyy");
		l.add("oo");
		l.add("eee");
		l.add("dd");
		System.out.println(l);
		String ar[] = new String [l.size()] ;
		
		
		l.toArray(ar);
		
		for (String i : ar)
		{
			System.out.println(i);
		}
		
		
	}

}
