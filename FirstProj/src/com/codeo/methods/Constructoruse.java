package com.codeo.methods;

public class Constructoruse {

	
	int eid;
		String name;
	
	Constructoruse(int eid) {
		
		this.eid = eid;
	}
	Constructoruse(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	 
	  void m1() {
    	
		  System.out.println(eid);
      }
	  void m2()
	  {
		  System.out.println(eid+" "+name);
	  }

	public static void main(String[] args) {
		Constructoruse cs=new Constructoruse(111);
		Constructoruse var=new Constructoruse(200,"payal");
		
    cs.m1();
    var.m2();
	}

}
