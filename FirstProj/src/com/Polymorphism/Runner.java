package com.Polymorphism;

public class Runner {

	public static void main(String[] args) {
	
		Shape circle=new Circle();
		
		
		 circle.calculateArea(5);
		 circle.calculateArea();
		 
		Shape rectangle=new Rectangle();
		rectangle.calculateArea();
		rectangle.calculateArea(4, 7);
		
		Shape triangle=new Triangle();
		triangle.calculateArea(3, 6);
		
		Shape square=new Square();
		square.calculateArea(5);
		
		Shape s=new Shape();
		s.calculateArea(2);
		s.calculateArea(5, 10);
	}

}
