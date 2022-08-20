package com.multithreading;

public class SecRunnable implements Runnable  {


	@Override
	public void run() {
		System.out.println("runnable is an instraface intrface is abstract ");
		
	}

	
	public static void main(String[] args) {
	
		SecRunnable sr=new SecRunnable();
		
	//	sr.start();   this throw error bcz runnable class me start() method nahi hai so apne ko Thread class ka thread create karna padega
		
		Thread tr=new Thread();
		tr.start();
	}

}
