package com.Polymorphism;

public class Circle extends Shape {

	double radius;
	
	public void calculateArea() {
		System.out.println("area of circal");
		System.out.println(radius);
	}
	
	public void calculateArea(double radius) {//5
		this.radius=radius; 
		double area=0;
		area=3.14*(Math.pow(radius, 2));
		System.out.println("area of circal will be "+area);
	}
}
