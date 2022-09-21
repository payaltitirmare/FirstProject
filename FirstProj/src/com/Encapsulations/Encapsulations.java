package com.Encapsulations;

public class Encapsulations {  //this class extended by run class

	//encapsulation =wrapping data into a single unit 
	
	//we can achieve encapsulation by declaring variables of a class as a private
	// declarring public setter and getter methods
	// it provide security and it perform data hiding it hide data from other classes  so other
	//classes cant access private variables directly they acces by using setter and hgetter methods
	// setter method is used for set the values and getter method is used for get the values 
	
	private int account_no;
	private String name;
	private double balance;
	
	
	//this is constructor

	public Encapsulations(int account_no, String name, double balance) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
	}
	
	public Encapsulations() {
		// TODO Auto-generated constructor stub
	}




	public void setaccount( int account_no)
	{
		this.account_no=account_no;
	}
	
	public int getaccount ()
	{
		return account_no;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public String getname ()
	{
		return name;
	}
	public void setbalance(double balance )
	{
		this.balance=balance;
	}
	
	public double getbalance ()
	{
		return balance;
	}
	
	
}
