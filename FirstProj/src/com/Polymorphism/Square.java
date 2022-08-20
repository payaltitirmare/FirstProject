package com.Polymorphism;

public class Square extends Shape {

	double side;
	
	public void calculateArea(double side) {
		double area;
		this.side=side;
		
		area=Math.pow(side, 2);
		System.out.println("area of square:"+area);
	}
}
