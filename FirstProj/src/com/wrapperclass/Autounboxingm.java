package com.wrapperclass;

public class Autounboxingm {

	//conversion of object to primtive  is called autounboxing --we use parseint method/parsexxx method
	
	
	public static void main(String[] args) {
	
		String age="22";  //i have object from front end and i want to store it into backend
		
		 //this concate bcz it is string object cant add
		System.out.println(age+20); //2220
		
		
		int a= Integer.parseInt(age);  //in backend we have store it into integer value so we use parint method
		
		System.out.println(a); //20
		
		//it will add bcz it is integer 
		System.out.println(a+20); //42
		
		float f= Float.parseFloat(age);
		
		System.out.println(f);
	}

}
