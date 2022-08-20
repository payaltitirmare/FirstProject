package com.Polymorphism;

public class Rectangle extends Shape{

	double length;
	double breadth;
	
	public void calculateArea() {
		System.out.println("calculate area of rectangle");
	}
		public void calculateArea(double length,double breadth) {
			double area=0;
			area=length*breadth;
			System.out.println("area of rectangle:"+area);
		}
	}
