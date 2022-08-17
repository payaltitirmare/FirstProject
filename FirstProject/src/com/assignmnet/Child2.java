package com.assignmnet;

public class Child2 extends Parent1 {

	
	void m2() {
		System.out.println("this is child class");
	}
	public static void main(String[] args) {
		
		Parent1 p1=new Parent1();
		p1.m1();
		Child2 c2=new Child2();
		c2.m2();
		//c2.m1();
	}

}
