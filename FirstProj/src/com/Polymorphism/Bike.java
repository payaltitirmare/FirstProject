package com.Polymorphism;

public class Bike {

	
	 /*void run(){
		 System.out.println("Bike is running safely");
		 }  
	  
	  public static void main(String args[]){  
	  
		  Bike obj = new Bike();//creating object  
	 
		  obj.run();//calling method  
	  }  */
	
	 void m1() {
		System.out.println("no arg");

	}
	
	void m1(int a) {
		System.out.println("int arg");
} 
	void m1(double c) {
		System.out.println("double c");
	}
	
	  public static void main(String args[]){  
		
		  Bike b=new Bike();
		  b.m1();
		  b.m1(11);
		  b.m1(11.8);
		  b.m1('c');
		  b.m1('a');
	  
	  }
	
}
