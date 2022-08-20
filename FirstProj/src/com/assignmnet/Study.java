package com.assignmnet;

class Emp10{ }
class Animal10{ }
class Student10 { }
public class Study {

	int a;
	static int b;
	 String s;
	 
	 static {
		 System.out.println(10+20+"payal"+10*3+2+6+"titir"+11+5); //imp for interview............!
	 }
	
	String str(Emp10 e10,int a) {
		System.out.println("str method");
		System.out.println(Study.b+" "+s);
		return "payal";
	}
	
	static Animal10 animal(Student10 s10,float f,int c) {
		System.out.println("animal method");
		System.out.println(s10+"   "+f+"    "+c);
		return new Animal10();
	}
	
	
	Study(int a){
		this.a=a;
		System.out.println("a arg con");
	}
	Study(int b,String s)
	{
		this.b=b;
		this.s=s;
		
		System.out.println("2 arg constr");
	}
	
	public static void main(String[] args) {
		
		Study ss=new Study(159);
		Study st=new Study(10,"saurbh");
		
		System.out.println(ss.a);
		System.out.println(Study.b);
		System.out.println(st.s);
		Emp10 e=new Emp10();
		Student10 s1=new Student10();
	
	//Animal10 a= Study.animal(s1, 12.5f, 23);
	System.out.println(st.str(e, 19));
	System.out.println(Study.animal(s1, 1.2f, 99));
	
	}
}
