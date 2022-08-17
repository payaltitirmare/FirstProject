package com.practice;

 class  Mythread {
	 
	
	
	public static void main(String [] args)
	{
		String str[] = {"payal" , "titirmare" ,"saurabh" } ;
		System.out.println(str.length);
		
	}
	
	 
	 
 }

	/*
 void getline()
{
	for(int i=0;i<3;i++) {
		System.out.println(i);
		try {
			Thread.sleep(400);
			
		} 
		catch (InterruptedException e) {
		System.out.println(e);
			e.printStackTrace();
		}
		
	}
}

}

public class Mythread extends Thread{
 
	Line mythread; 
 
	Mythread(Line mythread){
		 this.mythread=mythread;
	 }
	 
	 public void run()
	 {
		 mythread.getline();
	 }
	 
	 public static void main()
	 {
		Line obj=new Line();
		 Mythread my=new Mythread(obj);
		 my.start();
	 }

}  */
