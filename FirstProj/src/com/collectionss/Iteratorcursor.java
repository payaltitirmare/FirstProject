package com.collectionss;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iteratorcursor {

	public static void main(String[] args) {
	
		//cursor are used for retrving object one by one from collection
	//enumerartion = object of enumeration created by using elements() method of vector class. this is for legacy class.  we can only read or retrie data. not remove or add
	//it is sinle direction only forward direction	
		Vector v = new Vector();  //creatingbemty object for vector class
		
		v.add("payal");
		v.add(90);
		v.add(null);
		
		Enumeration e= v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("===========================================================================================================================================");
		// 2) Iterator = it is used with any collection object thats why it is called universal cursor . for creating object of iterator we use iterator method present in collection interface.
		// by using iterator we can perform read and remove elements. 
		//it is sinle direction only forward direction	
		Iterator itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("==================================================================================================================================================");
		//ListIterator = it used with only list interface classes like arraylist,linkedlist,vector. it is not universal iterator. 
		//we csn perform read, remove.add and replace operation by using this.
		//it is birectional direction both forward and backward	
		ListIterator lt = v.listIterator();
		
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		while(lt.hasPrevious())    //printing backward previous data
		{
			System.out.println(lt.previous());	
		}
	}

}
