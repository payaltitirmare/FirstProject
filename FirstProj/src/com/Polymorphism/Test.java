package com.Polymorphism;

public class Test {

	//overload methods
	Test(int a){
		System.out.println("1 arg con");
	}
	Test(int a,int b){
		System.out.println("2 arg con");	
	}
	Test(char a){
		System.out.println("1 arg character con");
	}
		
	public static void main(String[] args) {
		new Test(1);
		new Test(10,10);
		new Test('e');
	
		System.out.println("ratan"+"anu");
		System.out.println(10+"ratan"+"anu"+10+20);
	}
}
