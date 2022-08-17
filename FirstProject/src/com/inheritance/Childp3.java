package com.inheritance;

public class Childp3 extends Parent3 {
  
	
	
	Childp3(){
	    //super compiler generated code
	   System.out.println("0-arg");         }
	
   Childp3(int q){
	  // super compiler generated code
	   System.out.println("1-arg");
   }
	public static void main(String[] args) {
		new Childp3();
		new Childp3(10);
		
	}

}
