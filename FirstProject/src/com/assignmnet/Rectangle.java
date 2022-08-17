package com.assignmnet;


public class Rectangle {

	double length;
	double breadth;
	
	void Area() {
		System.out.println("area of reactable:"+length*breadth);
		
	}
	void perimeter() {
		System.out.println("area of parameter:" +2*(length*breadth));
		
	}
	 Rectangle(double l,double b) {
		length=l;
		breadth=b;
	}
	
}
