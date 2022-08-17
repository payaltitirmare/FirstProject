package com.wrapperclass;

public class WrapperCLass {

	public static void main(String[] args) {
	
		
		// data conversion from String to Primitive type......
      /*  
		double d=100;
		
		String s=String.valueOf(i);
		System.out.println(s+222);
		
		
		String s=String.valueOf(d);
		 System.out.println(s+20);
		 
		//autoboxing....primtive to Object me
		 
		 int a=10;
		 
		 int i=Integer.valueOf(a);
		
		 int j=a;
		 System.out.println(j);
		 
		 int b=20; //primitive type
		 
			Integer k=Integer.valueOf(b);//converting int into Integer
			Integer l=b;//auto boxing, now compiler will write Integer.valueOf(a) internally  
			System.out.println("The value will be "+l+" "+k);
*/
		 String k="true";
		 
		 boolean b=Boolean.parseBoolean(k);
		 System.out.println(k);
		
	}

}
