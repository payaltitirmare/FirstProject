package com.assignmnet;

public class VariableAss1 {

	int a=10;
	int b= 20;
	
	static String name="payal";
	static String ename="saurabh";
	
	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(VariableAss1 .name);
		System.out.println(VariableAss1.ename);
	}
	
	static void m2() {
		VariableAss1 v1=new VariableAss1 ();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println(VariableAss1 .name);
		System.out.println(VariableAss1.ename);
	}
	public static void main(String[] args) {
		VariableAss1 v2=new VariableAss1 ();
		v2.m1();
		VariableAss1.m2();
	}

}
