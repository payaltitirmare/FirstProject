package com.assignmnet;

public class Child extends Parent{
	
	/*	{
			System.out.println("child class insatnce block");
		}
	
		Child()
		{
			
			System.out.println("child class 0-arg con");
		}
	static{
		System.out.println("child class static block");
	}
	public static void main(String[] args) {
		
		
		new Child();
		new Child();
	}
*/
	int a=10;
	
	void m1() {
		System.out.println("yjis is child class method");
	}
	
	void m2() {
		System.out.println("this is child class m2 method");
	}
	public static void main(String[] args) {
		
		Child c=new Child();
		c.m1();
		c.m2();
		Parent p1=new Parent();
		p1.m1();
		Parent p=new Child();
		p.m1();
		p.m3();
		
		int a1=p.a;
		System.out.println(a1);
	}
}   
