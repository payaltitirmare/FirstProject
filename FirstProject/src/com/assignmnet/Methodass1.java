package com.assignmnet;

class X{  }
class Y {  }
class Emp {   }
class Student{ }


public class Methodass1 {

	/* quetion== 1-ins method (X x,Y y,int a)
	 * 1-static method(Emp e,double d)
	 * 1 ins method(char ch,Student s)
	 * 1 -static method(String s, float f)
	 * 
	 * p s v m (S[] a){
	 * call 4 methods by passing arguments
	 * }
	 */
	void m1(X x,Y y,int a) {
		System.out.println("m1 method");
		System.out.println(x+ " "+y+" "+a);
	}
	
	static void m2(Emp e,double d) {
		System.out.println("m2 method");
		System.out.println(e+" "+d);
	}
	
	void m3(char ch,Student s)
	{
		System.out.println("m3 method");
		System.out.println(ch+" "+s);
	}
	
	static void m4(String s,float f) {
		System.out.println("m4 method");
		System.out.println(s+" "+f);
		
	}
	public static void main(String[] args) {
	    Methodass1 ref=new Methodass1();
		X x1=new X(); //craeting object of separate class and return that reference variable
		Y y1=new Y();
		ref.m1(x1,y1, 10);
		System.out.println("=====================================");
		Emp e1=new Emp();
		Methodass1.m2(e1,14.2);
		System.out.println("=====================================");
		Student s1=new Student();
		ref.m3('p',s1 );
		System.out.println("=====================================");
		 Methodass1.m4("payal",5);
		
		
		

	}

}
