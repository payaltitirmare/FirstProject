package com.inheritance;

public class Child2 extends Ratan2 {

	
		Child2(){
			
			//super 
			this(5);
			System.out.println("child class 0-arg");
		}
		
		Child2(int a){
			
			System.out.println("child class 1-arg");
		}

		
		public static void main(String[] args)
		{
			new Child2();
		}
	}
	

