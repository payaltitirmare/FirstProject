package com.Polymorphism;

public class MethodOverloading {

	void m1(int a) {
		System.out.println("int m1 method");
	}
	
	void m1(int a,int b) {
	System.out.println("int a b ");	
	}
	void m1(char c) {
		System.out.println("char m1");
		}
	
	public static void main(String[] args) {
		new MethodOverloading().m1(1);
		new MethodOverloading().m1('d');
		new MethodOverloading().m1(2,3);
	}
}
