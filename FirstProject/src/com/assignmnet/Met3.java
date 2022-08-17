package com.assignmnet;

class Student4{ }
class Emp4 { }
class Bank3 { }
class Test3{ }
class Dog3{ }
class Puppy3{ }

public class Met3 {

	/*question                                           return type
	 * 1- instance  method (Emp e,String str)              Student
	 * 1-static method (int a,Bank b)                    char
	 * 1 - instance method (Dog d,Puppy p)               Test
	 * 1- static method (any 2- arguments)               boolean
	 * p s v m {
	 * call 4 methods by upassing arguiments & hold the return value & print it
	 */
	
	Student4 m1(Emp4 e,String str) {
		Student4 s= new Student4();
		return s;
	}
	
	static char m2(int a,Bank3 b) {
		return 'c';
	}
	
	Test3 m3(Dog3 d ,Puppy3 p) {
		Test3 t=new Test3();
		return t;
	}
	static boolean m4(int a,int b) {
		return true;
	}
	

	public static void main(String[] args) {
		Met3 m3=new Met3();
		Emp4  e=new Emp4();
		Bank3 b=new Bank3();
		Dog3 d = new Dog3();
		Puppy3 p= new Puppy3();
		
		Student4 s2=m3.m1(e,"ratan");
		char ch=Met3.m2(12, b);
		Test3 test= m3.m3(d, p);
		boolean boo = Met3.m4(22, 33);
		
		System.out.println(s2);
		System.out.println(ch);
		System.out.println(test);
		System.out.println(boo);
		
		
		
		
		

	}

}
