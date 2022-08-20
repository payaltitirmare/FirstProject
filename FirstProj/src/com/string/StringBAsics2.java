package com.string;

public class StringBAsics2 {

	public static void main(String[] args) {
		String str=new String("codeo");
		String str1=new String("codeo");
		String str2= new String ("codeograph");
		
		//object comparison
		if(str==str1) {
			System.out.println("object are same");
		}
		else {
			System.out.println("object are different");
		}
		 //(equals() method is used for content comprarison)
		if(str.equals(str1)) {
			System.out.println("content are same");
		}
		else {
			System.out.println("content  are different");
		}
		   
	}

}
