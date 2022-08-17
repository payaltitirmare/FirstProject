package com.Abstractm;

 class Runner extends AbstactMethod {

	 
	//constructor exuecuted object is not created
	Runner(){
		 super();
		 System.out.println("normal constructor");
	 }
	 public static void main(String[] args) {
		 new  Runner();
		 System.out.println(a);
	 }
	 /*
	@Override
	void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	void m2() {
		System.out.println("m2 method");
	}

	@Override
	void m3() {
		System.out.println("m3 method");
		
	}
	
	void m5() {
		System.out.println("m5 method");
	}

	public static void main(String[] args) {
		 Runner r=new Runner();
		 r.m1();
		 r.m2();
		r.m4();
		/*
		 System.out.println("========================================================");
		 AbstactMethod ab=new Runner();
		 ab.m1();
		 ab.m2();
		 ab.m3();
		 ab.m4();*/
		
	}


