package com.assignmnet;

	class Student2{ }
	class Emp2 { }
	class Bank { }
	class Test2{ }
	class Dog{ }
	class Puppy{ }

	public class M4 {
	

		/*question  solve by using nameless object          return type
		 * 1- instance  method (Emp e,String str)            Student
		 * 1-static method (int a,Bank b)                    char
		 * 1 - instance method (Dog d,Puppy p)               Test
		 * 1- static method (any 2- arguments)               boolean
		 * p s v m {
		 * call 4 methods by upassing arguiments & hold the return value & print it
		 */
		
		Student2 m1(Emp2 e,String str) {
			return new Student2();
		}
		
		static char m2(int a,Bank b) {
			return 'c';
		}
		
		Test2 m3(Dog d ,Puppy p) {
			
			return  new Test2();
		}
		static boolean m4(int a,int b) {
			return true;
		}
		

		public static void main(String[] args) {
			M4 m3=new M4();
			
			Student2 s2=m3.m1(new Emp2(),"ratan");
			char ch=M4.m2(12, new Bank());
			Test2 test= m3.m3(new Dog(), new Puppy());
			boolean boo = M4.m4(22, 33);
			
			System.out.println(s2);
			System.out.println(ch);
			System.out.println(test);
			System.out.println(boo);
			
			
			
			
			

		}

	}
