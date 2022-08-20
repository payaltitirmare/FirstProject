package com.assignmnet;

class Dog10{ }
class Emp11 { }
class Puppy10{ }
public class LastAss {

	 int num; //instance
	static double b=188;
	
	String m1(int a,float f) {
		System.out.println("m1 method ");
		System.out.println(a+""+f);
		return "payal";
	}
	
	static Emp11 m2(Dog10 d,Puppy10 p) {
		System.out.println("m2 method ");
		System.out.println(d+""+ p);
		return new Emp11();
		
	}
	 LastAss (int num){//local 
		System.out.println(num);
		 System.out.println("1 arg con");
	 }
	 LastAss (int num,double b){
		this.num=num;
		// this.b=b;
		 System.out.println("2 arg con");
	 }
	{
		System.out.println("instance block 1");
		
	}
	{
		System.out.println("instance block 2");
	}
	
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		
		 LastAss ls=new  LastAss (22);
		 LastAss ls1=new  LastAss (19,12);
		
		
		 
		System.out.println( ls.m1(55, 12.5f));
		
		 System.out.println(ls1.num+" "+LastAss.b);
		
		
		 Dog10 d=new Dog10();
		 Puppy10 p=new Puppy10();
		System.out.println( LastAss.m2(d, p));
	}

}
