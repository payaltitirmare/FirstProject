package com.Polymorphism;

public class Child5 extends  Overridingmethod{

	/*static void marry() {
		System.out.println("red girl");
	}
	*/
	 void m2() {
		 System.out.println("child class method ");
	 }

	public static void main(String[] args) {
		
		 Overridingmethod ov=new  Overridingmethod ();
		ov.m2();
		
		Child5 c5	=new Child5();
		c5.m2();
		
		 Overridingmethod ovv=new Child5();
		 ovv.m2();
	}
		 
}
