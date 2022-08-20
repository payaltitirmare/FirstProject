package com.assignmnet;
import java.util.Scanner;

public class M5 {
	/* Question important read it 
	 * void details()
	 * {  eid ename esal:from end-user by using scanner class}
	 * 
	 * void disp()
	 * {  print the details here}
	 *
	 * p s v m {
	 * call details()
	 * call disp()
	 * }
	 */
	int eid;    //instance variable
	String ename;
	double esal;
	/*   //this is one way to solve using local var
	void details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eid");
		int eid=sc.nextInt();                  //local variable
		System.out.println("enter ename");
		String ename=sc.next();
		System.out.println("enter esal");
		double esal=sc.nextDouble();
		//for printing local variable here we convert local to instance using this. keyword
		this.eid=eid;   
		this.ename=ename;
		this.esal=esal;
		sc.close();  //for cloasing scanner class --after reading/getting data it must be close  here
		
	}
	void disp() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	*/
	// 2nd this is the way we can directly assigning values to instance variable that variable we can access throught the class
	void details1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eid");
		 eid=sc.nextInt();                  
		System.out.println("enter ename");
		 ename=sc.next();
		System.out.println("enter esal");
		 esal=sc.nextDouble();
		
		sc.close();  //for cloasing scanner class --after reading/getting data it must be close  here
		
	}
	void disp1() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	

	public static void main(String[] args) {
		M5 met=new M5();
	
		
	   	met.details1();
	   	met.disp1();

	}

}
