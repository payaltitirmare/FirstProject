package com.arrays;

public class Interview {

	public static void main(String[] args) {
		
		Emp[] e=new Emp[5];
		
		Emp e1= new Emp(111,"payal");
		Emp e2=new Emp (222,"chirag");
		Emp e3=new Emp (333,"mayuri");
		
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
		
		
		for(int i=0;i<e.length ; i++)
		{
			if ( e [i] ==null)
			{
				System.out.println(i);
			}
		}

	}

}
