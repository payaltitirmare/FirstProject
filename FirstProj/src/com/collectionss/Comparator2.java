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
		
		/* for comparable interfacae 
		 * 
	
		System.out.println(ar);
		Collections.sort(ar);
		
		System.out.println("after sorting id"+ar);
		
		Iterator itr =ar.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

	*/
		//for comparator  logic
		
		Collections.sort(ar, new IdComparator()); //we are passing comparator object for sorting 
		
		System.out.println(ar);
		
		
			//sorting for comparator on the basis of age
		
		ArrayList<Comparator1> ar11= new ArrayList <>(ar);
		
		
		Collections.sort(ar11,new AgeComparator()); //on the age basis
		
		System.out.println(ar11);
		
		Collections.sort(ar11,new  Namecomparator());  //on the name basis ...
		System.out.println(ar11);

	}


}
