package com.Abstractm;

public abstract class AbstactMethod {

	static int a=10;
	AbstactMethod(){
		System.out.println("construct of abstarct");
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static ");
	}
	
	/*abstract void m1();
	abstract void m2();
	abstract void m3();
	
	void m4() {
		System.out.println("m4 method");
	}
	
	public static void main(String [] args) {
		}
	*/
	
}
