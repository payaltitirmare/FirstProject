package com.assignmnet;

class B{
	
}
class Test{
	
}
public class M2 {
/*
 * question==                  return type
 * 1-ins method() ------>    float
 * 1-static meth() ------>   Emp
 * 1-instance method() ----> Test
 * 1-static method()  ------>String
 */
	
   float m1() { //instance
		return 10.5f;
	}
   static B m2() { //static 
	 B e=new B();
	   return e;
   }
   
   Test m3()      //instance
   { Test t=new Test();
	   return t;
   }
   
   static String m4() {  //static
	   
	   return "payal";
   }
	
	public static void main(String[] args) {
		
		M2 ref=new M2();
		float f=ref.m1();
		B e1=M2.m2();
		Test t1=ref.m3();
		String s=M2.m4();
		System.out.println(f);
		System.out.println(e1);
		System.out.println(t1);
		System.out.println(s);
		
		
		

	}

}
