package com.modifiers;

public class Protectedmod {

  protected int num=10101;
	protected void min() {
		System.out.println(num);
	}
	public  static void main(String[] args) {
		
		Protectedmod  ref=new Protectedmod();
		ref.min();
		
		//import default modifier in same packafe so we dont import here we 
		//accedd directly by creting object here.
		Defmod df=new Defmod(); 
		df.disp();
		
	}

	}
