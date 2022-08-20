package com.block;

public class Iblock {

	Iblock(){
		System.out.println("0 arg-constructor");
		
	}
	
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		Iblock ref=new Iblock();
	
	}

}
