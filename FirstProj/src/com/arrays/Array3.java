package com.arrays;

public class Array3 {
	
	int[] m1()
	{
		System.out.println("m1 method ");
		int[] a= {10,20,30};
		return a;  //return type is integer
	}
	
	void m2(double[] d) {
		System.out.println("m2 method");
		for(double dd:d) {
			System.out.println(dd);  //return type is argument
		}
	}
	public static void main(String[] args) {
		
		Array3 t=new Array3();
			
		int[] x=t.m1();
		for(int xx:x)
		{
			System.out.println(xx);
		}
		double[] d = {10.5,20.3,30.8,40.9};
		t.m2(d);
	}

}
