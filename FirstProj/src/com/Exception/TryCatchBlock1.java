package com.Exception;

public class TryCatchBlock1 {

	public static void main(String[] args) {
		try {
//unchekd exception
			
			System.out.println("okay");
			System.out.println("okay");
			System.out.println(10/0);
			System.out.println("okay");
		}
		catch(ArithmeticException e) {
			System.out.println("catch");
		}
		catch(NullPointerException e) {
			System.out.println("cath");
		}
		finally {
			System.out.println("finaly");
		}
	}

}
