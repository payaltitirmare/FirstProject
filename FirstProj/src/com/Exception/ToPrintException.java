package com.Exception;

public class ToPrintException {

	void m1(){
		m2();
	}
void m2(){
		m3();
	}
void m3(){
	try {
		System.out.println(10/0);
		
	}
	catch(ArithmeticException e){
		
		System.out.println(e.toString());
		System.out.println(e.getMessage());
	     e.printStackTrace();
	}
	
}

	public static void main(String[] args) {
		
		ToPrintException tpe=new ToPrintException();
		tpe.m1();
	}

}
