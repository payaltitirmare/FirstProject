package com.assignmnet;

public class Cehck {

	
	void insertdata(String name, String password)
	{
	System.out.println(name);
	System.out.println(password);
	}
	
	public static void main(String[] args) {
		
		String name="payal";
		String password="123";
		
		Cehck ck = new Cehck();
		
		ck.insertdata(name,password);

	}

}
