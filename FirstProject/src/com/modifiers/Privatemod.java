package com.modifiers;

public class Privatemod {


	private int num=100;
	
	private void m1() {       //instance method
		System.out.println("m1 method");
		System.out.println(num);
	}
	private static void m2() {
		 Privatemod pm=new  Privatemod();
		 System.out.println("m2 method");
 System.out.println(pm.num); //static method and num variable is instance var i.e access by creating object.
	}
	
	public static void main(String[] args) {
		 Privatemod pm1=new  Privatemod();
		pm1.m1();             //instance method access by object name
		Privatemod.m2();  //static method acces by class name
	}

}


