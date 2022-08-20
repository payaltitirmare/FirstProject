package com.inheritance;

public class RunnerWapp{

	public static void main(String[] args) {
		BasicWapp bw=new BasicWapp();
		bw.chat();
		
		BasicWapp2 wa1=new BasicWapp2();
		wa1.chatMessengers();
		wa1.audioCall();
		
		BasicWapp3 wa2=new BasicWapp3();
		wa2.chatMessengers();
		wa2.audioCall();
		wa2.videoCall();
		
		
	}

}
