package com.codeo.methods;
import  com.modifiers.Protectedmod;


 class  Importmod extends Protectedmod {  //it means this is child class of protectedmod class.

	
	public static void main(String[] args) {
		
		Importmod im=new Importmod(); //child reference object 
		im.min();
	}

}

 //we can access protected outside the package only in child  class with the help of child reference

