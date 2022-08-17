package com.arrays;

public class A {

	public static void main(String [] args) {
	
		//this is employee array
	
		Emp e1=new Emp(111,"payal");
		Emp e2=new Emp(222,"chirag");
		Emp e3=new Emp(333,"mayuri");
		
		Emp[] e= new Emp[5];
		
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
		
		//to store employee data nd null data we create object.
		for(Object o :  e)
		{
			if( o instanceof Emp)
			{
				Emp ee  =  (Emp)o;
				System.out.println(ee.eid+"-----"+ee.ename);
			}
			if(o==null) {
				System.out.println(o);
			}
			
			
			  
		  }
		  
	
	
	}
	
}
