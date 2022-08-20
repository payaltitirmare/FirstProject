package com.block;

public class Sblock {

	
	static void m1()
	{
		System.out.println("this is static method");
	}
	Sblock(){
		System.out.println("0 argu constructor");  //constructor
		}
	Sblock(int a){
		System.out.println("0 argu constructor");  //constructor
		}
	
	
	static {
		System.out.println("static block 1");
		
	}
	static {
		System.out.println("static block 2");
		
	}
	
	{
		System.out.println("instance block 1");
	}
	

	{
		System.out.println("instance block 2");
	}
	
	
		public static void main(String[] args) {
		Sblock sb=new Sblock();
		//first object first instance block exicuted 1& 2 then 1st constructor exucuted after that 
		//second object second instance block exicuted  1& 2 then 2nd constructor excuted.
		Sblock sb1=new Sblock(10);
	     sb.m1();

	}

}
