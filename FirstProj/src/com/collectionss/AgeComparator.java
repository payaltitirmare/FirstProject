package com.collectionss;

import java.util.Comparator;

public class AgeComparator implements Comparator<Comparator1 > {


	@Override
	public int compare(Comparator1 o1, Comparator1 o2) {
		
		return o1.getAge()-o2.getAge();
	}
	
	

	
	
}
