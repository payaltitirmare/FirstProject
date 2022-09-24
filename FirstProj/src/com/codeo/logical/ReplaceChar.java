package com.codeo.logical;

public class ReplaceChar {

	//Replace a character at a specific index in a String in Java
	
	public static void main(String[] args) {
	
		String str ="geeks gor geeks";
		
		int index = 6;
		
		char ch ='f';
		
		System.out.println("original :"+str);
		
		 str = str.substring(0, index) + ch
	              + str.substring(index + 1);
	 
		
		System.out.println("new :"+str);
		
	}

}
