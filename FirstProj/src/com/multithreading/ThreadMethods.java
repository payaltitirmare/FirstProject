package com.multithreading;

public class ThreadMethods extends Thread {

	public void run() {
		
		//ise payal name ka thread execute krayega ..
		
		//Thread.currentThread().setName("payal");
		
		System.out.println("thread task :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		//main thread is sysout ko execute karega or ye sbse pahle execute hoga --BY MAIN THREAD
		
		System.out.println("hello india :"+Thread.currentThread().getName());
		
		ThreadMethods tm=new ThreadMethods();
		
		tm.start();
		
		ThreadMethods tm1=new ThreadMethods();
		tm1.start();
	
	}

}
