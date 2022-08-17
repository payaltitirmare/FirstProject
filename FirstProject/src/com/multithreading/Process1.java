package com.multithreading;

public class Process1 extends Thread{

	public void run() {
		
		System.out.println("Thread"+Thread.currentThread().getId()+"is working");
	
	
	}
	public static void main(String[] args) {
	
		System.out.println("Thread  "+Thread.currentThread().getName()+"  is working");
	
	int number=4;
	
	for(int i=0;i<number;i++) {
		
		Process1 p1=new Process1();
		p1.start();
		
	}
		
	}

}
