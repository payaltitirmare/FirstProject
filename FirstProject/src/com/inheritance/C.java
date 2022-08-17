package com.inheritance;

public class C extends P {

	void m2(){
		System.out.println("child class");
		
	}
	public static void main(String[] args) {
	P p=new C();  //parent reference variable can hold the child class object
	
	p.m1();
		
	}
}
