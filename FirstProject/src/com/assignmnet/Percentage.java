package com.assignmnet;

public class Percentage {
   private int Salary;
private  String name;

 public int getSalary()
 {
	   return Salary;
 }
 
 public String getName(){
     return name;
 }
 public void setSalary(int S) {
		Salary=S;
	}
	public void setName(String n) {
		name=n;
	}
	
	
public static void main(String[] args) {
	
  Percentage p =  new Percentage();
  
 
  p.setSalary(100);
  p.setName("payal");
  
  System.out.println(p.getName());
  System.out.println(p.getSalary());
}
	
	
	
}
