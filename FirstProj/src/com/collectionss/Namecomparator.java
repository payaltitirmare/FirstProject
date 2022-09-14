package com.collectionss;

import java.util.Comparator;

public class Namecomparator implements Comparator<Comparator1 >{

	@Override
	public int compare(Comparator1 o1, Comparator1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
