package com.modifiers;

public class Encapusulated {

	private String name;
	private int rollno;
	private int Age;
	
	int getAge() { return Age;  }
	String getName() {return name;  }
	int getrollno() { return rollno; }
	
	void setAge(int newAge) {
		Age=newAge;
		
	}
	
	void setname(String newname) {
		name =newname;
		
	}
	
	void setrollno(int newrollno) {
	   rollno= newrollno;
		
	}
		
	public static void main(String[] args) {
		
		 Encapusulated eca= new  Encapusulated();
		 eca.setAge(22);
		 System.out.println("age :"+eca.getAge());
		 eca.setname("payal");
		 System.out.println("name:"+eca.getName());
		 eca.setrollno(101);
		 System.out.println("rollno :"+eca.getrollno());
	}

}
