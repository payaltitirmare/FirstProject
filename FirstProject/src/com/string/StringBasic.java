package com.string;

public class StringBasic {

	public static void main(String[] args) {
		
		String str="codeo";
		String str1="graph";
		String str2="codeo";
		String str3="codeograph";
		String str4=str+str1;
	//note:- (==) is used for object comparison
		if(str==str1) {
			System.out.println("object is same");
		}
		else {
			System.out.println("object is different");
		}
		
		//(equals() method is for content comparison.
 		if(str.equals(str2)) {
			System.out.println("content is same");
		}
		else
		{
			System.out.println("content is not same");
		}
	}

}
