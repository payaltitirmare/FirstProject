package com.block;

public class Instanceblock {
  //creating constructors
	Instanceblock(){
		System.out.println("0 argument constructor");
	}
	Instanceblock(int a){
		System.out.println("1 argument constructor");
	}
	Instanceblock(int a,int b)
	{
		System.out.println("2 argument constructor");
	}
	Instanceblock(int a,int b,int c)
	{
		System.out.println("3 argument constructor");
	}
	

	//instance block 
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		 new Instanceblock();
	     new Instanceblock(10);
		 new Instanceblock(11,12);
		 new Instanceblock(11,12,22);

		

	}

}
