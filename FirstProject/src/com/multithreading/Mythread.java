package com.multithreading;

//  case 4-- performing multiple task from multiple thread.

//multipal task ke liye multipal classes lena padta hai   task ke according classes lena hai. 
//multipal task ke liye hamne multipal thread create kiya hai... 
	
class playing extends Thread {	
	
public  void run() {
	
	System.out.println("playing video");
}
}

class playingMusic extends Thread{
	
	public void run() {
		System.out.println("playing music");
	}
}

class progressBar extends Thread 
{
	public  void run() {
		System.out.println("progress bar is executing ");
	}
}

class Timerp extends Thread
{
	public void run() {
		
		System.out.println("timer is executing ");
	}
}

public class Mythread {
	
	public static void main(String[] args) {
		
		playing video=new playing();     //creating threads for different tasks.
		video.start();
		
		playingMusic music  =new playingMusic();
		music.start();
		
		progressBar pb= new progressBar();
		pb.start();
		
		Timerp timer=new Timerp();
		timer.start();
		
	}

}
