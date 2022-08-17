package com.assignmnet;

class Emp3{  }
class Animal{ }
class Student3{ }


public class Constructors {

	/* 1-instance variable
	 * 1-static variable                   return type
	 * 
	 * 1-instance method(Emp e,int a)----- String
	 * 1-static method(Student s,float f,int a) ---Animal
	 * 1-constructor  : 1-arg
	 * 1-constructor   :2-arg
	 * 
	 * p  s v m  {
	 * craete the object obj1---1 arg  obj2--2 arg
	 * use any one object call the method
	 * 
	 */
	
	int a=10;
	int b=20;
	String m1(Emp3 e,int a) {
		System.out.println("method m1");
		System.out.println(e+" "+a);
		return "sauarbh";
	}
	static Animal m2(Student3 s,float f,int a) {
		System.out.println("method m2");
		System.out.println(s);        //sout(s+" "+f+" "+a );
        System.out.println(f);
		System.out.println(a);
		 return new Animal();
	}
	
	 Constructors(int a){
		 this.a=a;
	 }
	 Constructors(float f,int a){
		 this.a=a;
	 }
	public static void main(String[] args) {
		
		 Constructors ct=new  Constructors(15);
		 Constructors ctt= new  Constructors(12,22);
		 
		 System.out.println(ct.a);
		 System.out.println(ctt.a);

		 
		String s= ct.m1(new Emp3(), 5);
		System.out.println("return type:"+s);
		 
		 Animal a=ctt.m2(new Student3(),5.3f, 99);
		 System.out.println("return type:"+a);
	}

}
