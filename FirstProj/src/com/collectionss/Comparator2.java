package com.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Comparator2  {

	public static void main(String[] args) {

		ArrayList<Comparator1> ar= new ArrayList <>();
		
		ar.add(new Comparator1(22,"payal",22));
		ar.add(new Comparator1(13,"usha",42));
		ar.add(new Comparator1(3,"radheshyam",57));
		
		System.out.println(ar);
		Collections.sort(ar);
		
		System.out.println("after sorting id"+ar);
		
		Iterator itr =ar.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//reverse order 
		
			
		

	}


}
