package com.inheritance;

public class Child  extends Ratan1 {
	
	  //child class
		
		int a=111;
		int b=222;
		
		{
			System.out.println("instance block");
		}
		
		void add(int a,int b) {
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(super.a+super.b);
		}
			public static void main(String[] args) {
				
				{
				new Child().add(1000, 2000);
					
				}
			}
		}


