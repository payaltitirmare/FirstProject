package Interfaces;

public class Inter3 extends Inter2{

	public void m1() {
		System.out.println("this is overriding method");
	}
	public void m2() {
		System.out.println("this is m2 method.......");
	}

	public static void main(String[] args) {
		Inter2 i2=new Inter3();
		i2.m1();
		i2.m2();
	}
}
