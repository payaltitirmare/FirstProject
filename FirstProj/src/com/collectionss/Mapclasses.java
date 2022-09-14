package com.collectionss;

import java.util.*;

public class Mapclasses {

	public static void main(String[] args) {
	
		Map<Integer,String>  m = new HashMap <>();
		
		m.put(101, "m");
		m.put(104, "payal");
		m.put(103, "saurabh");
		m.put(66, null);
		m.put(23, "op");
		
		System.out.println(m.keySet());   //only for keys we use keyset method
		System.out.println(m.values());   //only for values we use values method
		
		System.out.println(m);
		
		LinkedHashMap lhp= new LinkedHashMap();
		
		lhp.put(190, 'p');
		lhp.put(22, "paya");
		lhp.put(1, 90);
		lhp.put(198, 's');
		lhp.put(52, "yya");
		lhp.put(34, 90);
		lhp.put("rty", 55);
		
		System.out.println(lhp);
		
		System.out.println("===================================");
		SortedMap smp= new TreeMap();
		smp.put(190, 'p');
		smp.put(22, "paya");
		smp.put(1, 90);
		smp.put(198, 's');
		smp.put("qn", "yya");
		
		System.out.println(smp);
		
	}

}
