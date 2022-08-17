package com.Exception;

public class TryCatchBlock {

	public static void main(String[] args) {
		
//normal code
		
		try {
			int a[]=new int[5];
			System.out.println(a[3]);
			System.out.println("ratan");
			String s=null;
			System.out.println(s.length());
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("array exception");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("this is string exception");
		}
		catch(NullPointerException e) {
			System.out.println("this is nullpointer exception");
		}
		catch(Exception e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
		
	}

}
