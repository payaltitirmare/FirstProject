package com.codeo.methods;
import com.modifiers.pubmodifier;
public class Test {

	int a=1003;
	
	int m1(int a) {
		return this.a;
		
	}
	
	public static void main(String[] args) {
		Test t1=new Test();
		int v=t1.m1(10);
		System.out.println(v);
		pubmodifier pub=new pubmodifier();
		pub.max();
		
		System.out.println(pub.a);
		
	}

}
