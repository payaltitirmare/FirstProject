package com.arrays;

public class Arr1 {

	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40};  //approac to declare array
		
		System.out.println(a[0]);  // 1st approoach to print the arrays
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
	
		System.out.println(" =================================================================");
		
		for(int i=0;i<a.length;i++) {     // 2nd approach for printing array data
			System.out.println(a[i]);
		}
		System.out.println(" =================================================================");
		
		for(int aa:a) {
			System.out.println(aa);	
		}
		System.out.println(a.length);
		
	}
	
}
