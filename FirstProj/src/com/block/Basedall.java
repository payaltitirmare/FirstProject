package com.block;

public class Basedall {

	int a; 
	String name;//instance variable
	
	void m1(int a) {  //local variable
	  this.a=a;
	  
		System.out.println("insatnce method");
		System.out.println(a);
	}
	
	static void m2(String name) {
		System.out.println(name);
		System.out.println("static method ");
	}
	
	{
		System.out.println("instance block");
	}
	
	static{
		System.out.println("static block");
	}
	Basedall(){
		System.out.println("0 arg constructor" );
	}
	Basedall(int a){
		System.out.println("1 arg constructor");
	}
	
	
	public static void main(String[] args) {
		
		Basedall ba= new Basedall();
		Basedall b1= new Basedall(10);
		
		b1.m1(100);
		Basedall.m2("saurabh");
	}

	
	

}
