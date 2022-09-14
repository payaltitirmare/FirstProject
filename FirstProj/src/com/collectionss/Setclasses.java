package com.collectionss;

import java.util.SortedSet;
import java.util.TreeSet;

public class Setclasses {

	public static void main(String[] args) {
	

		//hashset insertion order is not preserved , null insertion allowed , heterogeneous object allowed
		
		// linkedhashset class insertion order is preserved , null insertion is possible, heterogeneous object are allpwed.
		
		/*
		 * sorted set (interface)= sorted set interface extends the set interface
		 * 
		 * sorted interface is implemented by treeset class. treeset class which implements the sorted set interface.heterogeneous objects are not allowed if
		 *  we insert heterougeneius object then it will give an exception saying classcast bound exception. 
		 * in treeset class object will be inserted based on some sorting order
		 * null is not allowed it will give nullpointerexception.
		 */
		
		SortedSet ss= new TreeSet();
		
		ss.add(12);
		//ss.add("pa");
		ss.add(55);
		ss.add(9);
		//ss.add(null);
		
		System.out.println(ss);
		

	}

}
