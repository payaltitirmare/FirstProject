package com.modifiers;

public class pubmodifier {

	public int a=10;
	public void max() {
		System.out.println(a);
	}
	
	public static void main(String [] args) {
		pubmodifier pub=new pubmodifier();
		pub.max();
	}
}
