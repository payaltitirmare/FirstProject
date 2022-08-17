package com.Polymorphism;

public class Shape {

	double a;
	double b;
	
	public void calculateArea() {
		System.out.println("calculate area of shape");
	}
	public void calculateArea(double a,double b) {
		System.out.println(a+b);
	}
	
	public void calculateArea(double radius) {
		
		System.out.println("area will be: "+radius);
	}
}

