package com.assignmnet;

public class ArithPractice {


	
	public static void main(String[] args) {
		
		int a[]= {10,20,3,33,5,2,14};
		
		String str[]= { "java","c","cpp","html"};
		
		
		System.out.println("befor sorting array is");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					}
			}
		}
		for(int i:a) {
			System.out.print(", "+i);
		}
		System.out.println();  

		
	}
	

}