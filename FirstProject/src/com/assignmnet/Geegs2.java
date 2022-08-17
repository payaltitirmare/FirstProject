package com.assignmnet;

public class Geegs2 extends Geegs1 {

	void Show() {
		System.out.println("this is child class");
	}
	
	
	void Call() {
		super.Show();
		Show();
		
		
	}
}
