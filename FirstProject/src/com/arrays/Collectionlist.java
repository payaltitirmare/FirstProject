package com.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class Collectionlist {

	public static void main(String[] args) {


		List <String> list1 =new ArrayList <> ();
		
		list1.add("shoe");
		list1.add("toys");
		list1.add("shandel");
		
		System.out.println("this is list 1"+list1);
		
		List <String> list= new ArrayList <>();
		list.add("aaa");
		list.add("bbb");
		list.add("ppp");
		
		
		System.out.println("===========copy ==========================================");
		
		Collections.copy(list1,list );
		System.out.println(list1);
		System.out.println("=========================================");
		
		
		System.out.println("thisis list 2 "+list1);
		System.out.println("==========adding list in list1 ============");
		
		
		list1.addAll(list);
		
		System.out.println(list1);
		
		System.out.println("==============sorting=======================================");
		
		Collections.addAll(list1, "fruits","bats");
		Collections.sort(list1);
			System.out.println(list1);
	
		
		
}
}