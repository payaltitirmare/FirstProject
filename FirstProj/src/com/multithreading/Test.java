package com.multithreading;

public class Test extends Thread  {

	//case 1-- performing single task from single thread
	
/*	public void run()         //start method run this run method
	{
		System.out.println("task 1");
	}
     
	public static void main(String[] args) {
	
		Test thread1= new Test();   //creating thread
		
		thread1.start();  
	}
	*/
	
	
	
	//case 2--performing single task from multipal thread
	
	public void run()         //start method run this run method
	{
		System.out.println("task 1");
	}
	
	public static void main(String[] args) {  //this is also main thread  provided by JVM 
		
		Test thread1= new Test();    //creating first thread
		thread1.start();
		Test thread2 =new Test();         //creating another second thread
		thread2.start();
		
		//like that we can create multipal thread...
		
		
		
	}
}
