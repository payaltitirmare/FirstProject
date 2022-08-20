package com.assignmnet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class P {
	

	public static void main(String [] args)
	{
		List  ar = new ArrayList  ();
		
		ar.add("payal");
		ar.add(12);
		ar.add("saurabh");
		
		System.out.println(ar);
	/*	
		//Iterator cursor ..
         Iterator itr = ar.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("elements are nor present...");
		ar.add(3010);
		System.out.println(ar);
		
		*/
		
		ListIterator li = ar.listIterator();
		
		while (li.hasNext())
		{
			System.out.println(li.next());
		}
		
		//printing previous elememnts here...........
		while (li.hasPrevious())
		{
			System.out.println(li.previous());
			
		}
		
		ar.remove(1);
		System.out.println(ar);
	
}
}
