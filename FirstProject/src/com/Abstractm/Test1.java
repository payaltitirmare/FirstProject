package com.Abstractm;

public abstract class Test1 extends Test {
	
	int a;
	
	 int m1(char h,int a) {
		System.out.println(h);
		return a;
	}
	 float m2(boolean b ,int a) {
		 System.out.println(b);
		 System.out.println(this.a=a);
		 return 5.2f;
	 }
	
}
