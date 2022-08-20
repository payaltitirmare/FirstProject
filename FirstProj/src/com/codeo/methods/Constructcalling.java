package com.codeo.methods;

public class Constructcalling {

	Constructcalling(){
		this(10);
		
		System.out.println("0 argu constructor");
	}

	Constructcalling(int a){
		this(20,22);
		System.out.println("1 argu constructor");
	}
	Constructcalling(int a, int b){
		System.out.println("2 argu constructor");
	}
	
	public static void main(String[] args) {
		new Constructcalling ();
	}

}
